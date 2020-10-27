from antlr4 import *
from pactor.ast import *
from pactor.PactorParser import PactorParser

class ASTVisitor(ParseTreeVisitor):

    def get_ast(self):
      return self.__ast

    # Visit a parse tree produced by PactorParser#program.
    def visitProgram(self, ctx:PactorParser.ProgramContext):
      self.__ast = Ast()
      return self.visitChildren(ctx)


    # Visit a parse tree produced by PactorParser#pushNumberToStack.
    def visitPushNumberToStack(self, ctx:PactorParser.PushNumberToStackContext):
        self.__ast.add_node(NumberNode(ctx.value.text))
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PactorParser#pushFloatToStakc.
    def visitPushFloatToStack(self, ctx:PactorParser.PushFloatToStackContext):
        self.__ast.add_node(FloatNode(ctx.value.text))
        return self.visitChildren(ctx)

    def visitPushStringToStack(self, ctx:PactorParser.PushStringToStackContext):
        self.__ast.add_node(StringNode(ctx.value.text[1:-1]))
        return self.visitChildren(ctx)

    # Visit a parse tree produced by PactorParser#commandRun.
    def visitCommandRun(self, ctx:PactorParser.CommandRunContext):
        word = ctx.value.text
        if word == '+': self.__ast.add_node(AddNode())
        elif word == '-': self.__ast.add_node(MinusNode())
        elif word == '*': self.__ast.add_node(TimesNode())
        elif word == '/': self.__ast.add_node(DivideNode())
        elif word == 'dup': self.__ast.add_node(DupNode())
        elif word == 'swap': self.__ast.add_node(SwapNode())


        return self.visitChildren(ctx)