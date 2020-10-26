# Generated from Pactor.g4 by ANTLR 4.8
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\6")
        buf.write("\25\4\2\t\2\4\3\t\3\3\2\7\2\b\n\2\f\2\16\2\13\13\2\3\2")
        buf.write("\3\2\3\3\3\3\3\3\3\3\5\3\23\n\3\3\3\2\2\4\2\4\2\2\2\26")
        buf.write("\2\t\3\2\2\2\4\22\3\2\2\2\6\b\5\4\3\2\7\6\3\2\2\2\b\13")
        buf.write("\3\2\2\2\t\7\3\2\2\2\t\n\3\2\2\2\n\f\3\2\2\2\13\t\3\2")
        buf.write("\2\2\f\r\7\2\2\3\r\3\3\2\2\2\16\23\7\3\2\2\17\23\7\4\2")
        buf.write("\2\20\23\7\5\2\2\21\23\7\6\2\2\22\16\3\2\2\2\22\17\3\2")
        buf.write("\2\2\22\20\3\2\2\2\22\21\3\2\2\2\23\5\3\2\2\2\4\t\22")
        return buf.getvalue()


class PactorParser ( Parser ):

    grammarFileName = "Pactor.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [  ]

    symbolicNames = [ "<INVALID>", "NUMBER", "FLOAT", "STRING", "WORD" ]

    RULE_program = 0
    RULE_commands = 1

    ruleNames =  [ "program", "commands" ]

    EOF = Token.EOF
    NUMBER=1
    FLOAT=2
    STRING=3
    WORD=4

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.8")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(PactorParser.EOF, 0)

        def commands(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PactorParser.CommandsContext)
            else:
                return self.getTypedRuleContext(PactorParser.CommandsContext,i)


        def getRuleIndex(self):
            return PactorParser.RULE_program

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProgram" ):
                return visitor.visitProgram(self)
            else:
                return visitor.visitChildren(self)




    def program(self):

        localctx = PactorParser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 7
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << PactorParser.NUMBER) | (1 << PactorParser.FLOAT) | (1 << PactorParser.STRING) | (1 << PactorParser.WORD))) != 0):
                self.state = 4
                self.commands()
                self.state = 9
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 10
            self.match(PactorParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CommandsContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return PactorParser.RULE_commands

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class PushFloatToStackContext(CommandsContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PactorParser.CommandsContext
            super().__init__(parser)
            self.value = None # Token
            self.copyFrom(ctx)

        def FLOAT(self):
            return self.getToken(PactorParser.FLOAT, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPushFloatToStack" ):
                return visitor.visitPushFloatToStack(self)
            else:
                return visitor.visitChildren(self)


    class PushStringToStackContext(CommandsContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PactorParser.CommandsContext
            super().__init__(parser)
            self.value = None # Token
            self.copyFrom(ctx)

        def STRING(self):
            return self.getToken(PactorParser.STRING, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPushStringToStack" ):
                return visitor.visitPushStringToStack(self)
            else:
                return visitor.visitChildren(self)


    class PushNumberToStackContext(CommandsContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PactorParser.CommandsContext
            super().__init__(parser)
            self.value = None # Token
            self.copyFrom(ctx)

        def NUMBER(self):
            return self.getToken(PactorParser.NUMBER, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPushNumberToStack" ):
                return visitor.visitPushNumberToStack(self)
            else:
                return visitor.visitChildren(self)


    class CommandRunContext(CommandsContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PactorParser.CommandsContext
            super().__init__(parser)
            self.value = None # Token
            self.copyFrom(ctx)

        def WORD(self):
            return self.getToken(PactorParser.WORD, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCommandRun" ):
                return visitor.visitCommandRun(self)
            else:
                return visitor.visitChildren(self)



    def commands(self):

        localctx = PactorParser.CommandsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_commands)
        try:
            self.state = 16
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [PactorParser.NUMBER]:
                localctx = PactorParser.PushNumberToStackContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 12
                localctx.value = self.match(PactorParser.NUMBER)
                pass
            elif token in [PactorParser.FLOAT]:
                localctx = PactorParser.PushFloatToStackContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 13
                localctx.value = self.match(PactorParser.FLOAT)
                pass
            elif token in [PactorParser.STRING]:
                localctx = PactorParser.PushStringToStackContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 14
                localctx.value = self.match(PactorParser.STRING)
                pass
            elif token in [PactorParser.WORD]:
                localctx = PactorParser.CommandRunContext(self, localctx)
                self.enterOuterAlt(localctx, 4)
                self.state = 15
                localctx.value = self.match(PactorParser.WORD)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





