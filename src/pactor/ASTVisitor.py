from antlr4 import *
from pactor.ast import *
from pactor.PactorParser import PactorParser

class ASTVisitor(ParseTreeVisitor):

    def get_ast(self):
      return self.__ast

    def visitProgram(self, ctx:PactorParser.ProgramContext):
      self.__ast = Ast()
      return self.visitChildren(ctx)


    def visitPushNumberToStack(self, ctx:PactorParser.PushNumberToStackContext):
        self.__ast.add_node(NumberNode(ctx.value.text))
        return self.visitChildren(ctx)

    def visitPushFloatToStack(self, ctx:PactorParser.PushFloatToStackContext):
        self.__ast.add_node(FloatNode(ctx.value.text))
        return self.visitChildren(ctx)

    def visitPushStringToStack(self, ctx:PactorParser.PushStringToStackContext):
        self.__ast.add_node(StringNode(ctx.value.text[1:-1]))
        return self.visitChildren(ctx)

    def visitCommandRun(self, ctx:PactorParser.CommandRunContext):
        word = ctx.value.text
        if word == '+': self.__ast.add_node(AddNode())
        elif word == '-': self.__ast.add_node(MinusNode())
        elif word == '*': self.__ast.add_node(TimesNode())
        elif word == '/': self.__ast.add_node(DivideNode())
        elif word == 'dup': self.__ast.add_node(DupNode())
        elif word == 'swap': self.__ast.add_node(SwapNode())
        elif word == 'python': self.__ast.add_node(PythonNode())
        else:
          self.__ast.add_node(CallWordNode(word))

        return self.visitChildren(ctx)

    def visitCreateWord(self, ctx:PactorParser.CreateWordContext):
        save_ast = self.__ast
        self.__ast = Ast()
        result = self.visitChildren(ctx)
        word_ast = self.__ast
        self.__ast = save_ast
        self.__ast.add_node(WordNode(ctx.name.text,
                                     word_ast,
                                     len(ctx.params_in),
                                     len(ctx.params_out)))
        return result

    def visitCommandIgnore(self, ctx:PactorParser.CommandIgnoreContext):
        return self.visitChildren(ctx)