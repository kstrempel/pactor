# Generated from Pactor.g4 by ANTLR 4.8
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .PactorParser import PactorParser
else:
    from PactorParser import PactorParser

# This class defines a complete generic visitor for a parse tree produced by PactorParser.

class PactorVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by PactorParser#program.
    def visitProgram(self, ctx:PactorParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PactorParser#createUsing.
    def visitCreateUsing(self, ctx:PactorParser.CreateUsingContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PactorParser#createWord.
    def visitCreateWord(self, ctx:PactorParser.CreateWordContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PactorParser#createVariableWord.
    def visitCreateVariableWord(self, ctx:PactorParser.CreateVariableWordContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PactorParser#block.
    def visitBlock(self, ctx:PactorParser.BlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PactorParser#createArray.
    def visitCreateArray(self, ctx:PactorParser.CreateArrayContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PactorParser#createDictionary.
    def visitCreateDictionary(self, ctx:PactorParser.CreateDictionaryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PactorParser#createQuote.
    def visitCreateQuote(self, ctx:PactorParser.CreateQuoteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PactorParser#createLocalVars.
    def visitCreateLocalVars(self, ctx:PactorParser.CreateLocalVarsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PactorParser#pushNumberToStack.
    def visitPushNumberToStack(self, ctx:PactorParser.PushNumberToStackContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PactorParser#pushFloatToStack.
    def visitPushFloatToStack(self, ctx:PactorParser.PushFloatToStackContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PactorParser#pushStringToStack.
    def visitPushStringToStack(self, ctx:PactorParser.PushStringToStackContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PactorParser#pushExpressionToStack.
    def visitPushExpressionToStack(self, ctx:PactorParser.PushExpressionToStackContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PactorParser#pushBooleanToStack.
    def visitPushBooleanToStack(self, ctx:PactorParser.PushBooleanToStackContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PactorParser#commandRun.
    def visitCommandRun(self, ctx:PactorParser.CommandRunContext):
        return self.visitChildren(ctx)



del PactorParser