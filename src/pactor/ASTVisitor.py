from antlr4 import *
from pactor.ast import *
from pactor.nodes_expression import *
from pactor.nodes_math import *
from pactor.nodes_blocks import *
from pactor.nodes_primitives import *
from pactor.nodes_commands import *
from pactor.nodes_stack import *
from pactor.nodes_using import *
from pactor.nodes_python import *
from pactor.nodes_sequence import *
from pactor.PactorParser import PactorParser

class ASTVisitor(ParseTreeVisitor):

    @property
    def ast(self):
      return self.__ast[-1]

    def ast_increase(self):
        self.__ast.append(Ast())
        return self.ast

    def ast_decrease(self):
        decreased = self.__ast.pop()
        return decreased

    def visitProgram(self, ctx:PactorParser.ProgramContext):
      self.__ast = [Ast()]
      return self.visitChildren(ctx)

    def visitPushNumberToStack(self, ctx:PactorParser.PushNumberToStackContext):
        self.ast.add_node(NumberNode(ctx.value.text, ctx))
        return self.visitChildren(ctx)

    def visitPushFloatToStack(self, ctx:PactorParser.PushFloatToStackContext):
        self.ast.add_node(FloatNode(ctx.value.text, ctx))
        return self.visitChildren(ctx)

    def visitPushStringToStack(self, ctx:PactorParser.PushStringToStackContext):
        self.ast.add_node(StringNode(ctx.value.text[1:-1], ctx))
        return self.visitChildren(ctx)

    def visitPushBooleanToStack(self, ctx:PactorParser.PushBooleanToStackContext):
        self.ast.add_node(BooleanNode(ctx.value.text=='t', ctx))
        return self.visitChildren(ctx)

    def visitCommandRun(self, ctx:PactorParser.CommandRunContext):
        word = ctx.value.text
        if word == '+': self.ast.add_node(AddNode(ctx))
        elif word == '-': self.ast.add_node(MinusNode(ctx))
        elif word == '*': self.ast.add_node(MultiplyNode(ctx))
        elif word == '/': self.ast.add_node(DivideNode(ctx))
        elif word == 'dup': self.ast.add_node(DupNode(ctx))
        elif word == 'swap': self.ast.add_node(SwapNode(ctx))
        elif word == 'call': self.ast.add_node(CallNode(ctx))
        elif word == 'str': self.ast.add_node(StrNode(ctx))
        elif word == 'python': self.ast.add_node(PythonNode(ctx))
        elif word == 'py_module': self.ast.add_node(PyModuleNode(ctx))
        elif word == 'py_getattr': self.ast.add_node(PyGetattrNode(ctx))
        elif word == 'py_call': self.ast.add_node(PyCallNode(ctx))
        elif word == 'if': self.ast.add_node(IfNode(ctx))
        elif word == 'when': self.ast.add_node(WhenNode(ctx))
        elif word == 'times': self.ast.add_node(TimesNode(ctx))
        elif word == 'map': self.ast.add_node(MapNode(ctx))
        elif word == 'filter': self.ast.add_node(FilterNode(ctx))
        elif word == 'reduce': self.ast.add_node(ReduceNode(ctx))
        elif word == 'seq2stack': self.ast.add_node(Seq2StackNode(ctx))
        else:
          self.ast.add_node(CallWordOrVariableNode(word, ctx))

        return self.visitChildren(ctx)

    def visitPushExpressionToStack(self, ctx:PactorParser.PushExpressionToStackContext):
        exp = ctx.value.text
        if exp == '=': self.ast.add_node(EqualNode(ctx))
        elif exp == '>': self.ast.add_node(GreaterThanNode(ctx))
        elif exp == '<': self.ast.add_node(SmallerThanNode(ctx))
        elif exp == '>=': self.ast.add_node(GreaterEqualThanNode(ctx))
        elif exp == '<=': self.ast.add_node(SmallerEqualThanNode(ctx))
        elif exp == '!=': self.ast.add_node(NoEqualNode(ctx))
        elif exp == 'not': self.ast.add_node(NotNode(ctx))
        elif exp == 'and': self.ast.add_node(AndNode(ctx))
        elif exp == 'or': self.ast.add_node(OrNode(ctx))


    def visitCreateWord(self, ctx:PactorParser.CreateWordContext):
        self.ast_increase()
        result = self.visitChildren(ctx)
        words_ast = self.ast_decrease()
        self.ast.add_node(WordNode(ctx.name.text,
                                   words_ast,
                                   len(ctx.params_in),
                                   len(ctx.params_out),
                                   ctx))
        return result

    def visitCreateQuote(self, ctx:PactorParser.CreateQuoteContext):
        self.ast_increase()
        result = self.visitChildren(ctx)
        quote_ast = self.ast_decrease()
        self.ast.add_node(QuoteNode(quote_ast, ctx))
        return result

    def visitCreateUsing(self, ctx:PactorParser.CreateUsingContext):
        result = self.visitChildren(ctx)
        for package in ctx.packages:
            self.ast.add_node(UsingNode(package.text, ctx))
        return result

    def visitCreateVariableWord(self, ctx:PactorParser.CreateVariableWordContext):
        self.ast_increase()
        self.ast.add_node(Stack2LocalVarsNode([var.text for var in ctx.params_in], ctx))
        result = self.visitChildren(ctx)
        words_ast = self.ast_decrease()
        self.ast.add_node(WordNode(ctx.name.text,
                                   words_ast,
                                   len(ctx.params_in),
                                   len(ctx.params_out),
                                   ctx))
        return result

    def visitCreateLocalVars(self, ctx:PactorParser.CreateLocalVarsContext):
        if ctx.variable:
            self.ast.add_node(Stack2LocalVarsNode([ctx.variable.text], ctx))
        elif ctx.variables:
            self.ast.add_node(Stack2LocalVarsNode([var.text for var in ctx.variables], ctx))
        return self.visitChildren(ctx)

    def visitCreateArray(self, ctx:PactorParser.CreateArrayContext):
        self.ast_increase()
        result = self.visitChildren(ctx)
        elements_ast = self.ast_decrease()
        self.ast.add_node(ArrayNode(elements_ast, ctx))
        return result

    def visitCreateDictionary(self, ctx:PactorParser.CreateDictionaryContext):
        return self.visitChildren(ctx)