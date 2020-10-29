from antlr4 import *
from pactor.ast import *
from pactor.nodes_expression import *
from pactor.nodes_math import *
from pactor.nodes_blocks import *
from pactor.nodes_primitives import *
from pactor.nodes_commands import *
from pactor.nodes_stack import *
from pactor.nodes_using import *
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
        self.ast.add_node(NumberNode(ctx.value.text))
        return self.visitChildren(ctx)

    def visitPushFloatToStack(self, ctx:PactorParser.PushFloatToStackContext):
        self.ast.add_node(FloatNode(ctx.value.text))
        return self.visitChildren(ctx)

    def visitPushStringToStack(self, ctx:PactorParser.PushStringToStackContext):
        self.ast.add_node(StringNode(ctx.value.text[1:-1]))
        return self.visitChildren(ctx)

    def visitPushBooleanToStack(self, ctx:PactorParser.PushBooleanToStackContext):
        self.ast.add_node(BooleanNode(ctx.value.text=='t'))
        return self.visitChildren(ctx)

    def visitCommandRun(self, ctx:PactorParser.CommandRunContext):
        word = ctx.value.text
        if word == '+': self.ast.add_node(AddNode())
        elif word == '-': self.ast.add_node(MinusNode())
        elif word == '*': self.ast.add_node(MultiplyNode())
        elif word == '/': self.ast.add_node(DivideNode())
        elif word == 'dup': self.ast.add_node(DupNode())
        elif word == 'swap': self.ast.add_node(SwapNode())
        elif word == 'call': self.ast.add_node(CallNode())
        elif word == 'str': self.ast.add_node(StrNode())
        elif word == 'python': self.ast.add_node(PythonNode())
        else:
          self.ast.add_node(CallWordOrVariableNode(word))

        return self.visitChildren(ctx)

    def visitPushExpressionToStack(self, ctx:PactorParser.PushExpressionToStackContext):
        exp = ctx.value.text
        if exp == '=': self.ast.add_node(EqualNode())
        elif exp == '>': self.ast.add_node(GreaterThanNode())
        elif exp == '<': self.ast.add_node(SmallerThanNode())
        elif exp == '>=': self.ast.add_node(GreaterEqualThanNode())
        elif exp == '<=': self.ast.add_node(SmallerEqualThanNode())
        elif exp == '!=': self.ast.add_node(NoEqualNode())
        elif exp == 'not': self.ast.add_node(NotNode())
        elif exp == 'and': self.ast.add_node(AndNode())
        elif exp == 'or': self.ast.add_node(OrNode())


    def visitCreateWord(self, ctx:PactorParser.CreateWordContext):
        self.ast_increase()
        result = self.visitChildren(ctx)
        words_ast = self.ast_decrease()
        self.ast.add_node(WordNode(ctx.name.text,
                                   words_ast,
                                   len(ctx.params_in),
                                   len(ctx.params_out)))
        return result

    def visitCreateQuote(self, ctx:PactorParser.CreateQuoteContext):
        self.ast_increase()
        result = self.visitChildren(ctx)
        quote_ast = self.ast_decrease()
        self.ast.add_node(QuoteNode(quote_ast))
        return result

    def visitCreateIf(self, ctx:PactorParser.CreateIfContext):
        result = self.visitChildren(ctx)
        self.ast.add_node(IfNode())
        return result

    def visitCreateWhen(self, ctx:PactorParser.CreateWhenContext):
        result = self.visitChildren(ctx)
        self.ast.add_node(WhenNode())
        return result

    def visitCreateTimes(self, ctx:PactorParser.CreateTimesContext):
        result = self.visitChildren(ctx)
        self.ast.add_node(TimesNode())
        return result

    def visitCreateUsing(self, ctx:PactorParser.CreateUsingContext):
        result = self.visitChildren(ctx)
        for package in ctx.packages:
            self.ast.add_node(UsingNode(package.text))
        return result

    def visitCreateVariableWord(self, ctx:PactorParser.CreateVariableWordContext):
        self.ast_increase()
        self.ast.add_node(Stack2LocalVarsNode([var.text for var in ctx.params_in]))
        result = self.visitChildren(ctx)
        words_ast = self.ast_decrease()
        self.ast.add_node(WordNode(ctx.name.text,
                                   words_ast,
                                   len(ctx.params_in),
                                   len(ctx.params_out)))
        return result

    def visitCreateLocalVars(self, ctx:PactorParser.CreateLocalVarsContext):
        if ctx.variable:
            self.ast.add_node(Stack2LocalVarsNode([ctx.variable.text]))
        elif ctx.variables:
            self.ast.add_node(Stack2LocalVarsNode([var.text for var in ctx.variables]))
        return self.visitChildren(ctx)