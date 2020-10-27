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
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r")
        buf.write(".\4\2\t\2\4\3\t\3\3\2\7\2\b\n\2\f\2\16\2\13\13\2\3\2\3")
        buf.write("\2\3\3\3\3\3\3\7\3\22\n\3\f\3\16\3\25\13\3\3\3\3\3\7\3")
        buf.write("\31\n\3\f\3\16\3\34\13\3\3\3\3\3\3\3\6\3!\n\3\r\3\16\3")
        buf.write("\"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3,\n\3\3\3\2\2\4\2\4")
        buf.write("\2\3\3\2\13\f\2\64\2\t\3\2\2\2\4+\3\2\2\2\6\b\5\4\3\2")
        buf.write("\7\6\3\2\2\2\b\13\3\2\2\2\t\7\3\2\2\2\t\n\3\2\2\2\n\f")
        buf.write("\3\2\2\2\13\t\3\2\2\2\f\r\7\2\2\3\r\3\3\2\2\2\16\17\7")
        buf.write("\13\2\2\17\23\7\3\2\2\20\22\7\13\2\2\21\20\3\2\2\2\22")
        buf.write("\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\26\3\2\2\2")
        buf.write("\25\23\3\2\2\2\26\32\7\4\2\2\27\31\7\13\2\2\30\27\3\2")
        buf.write("\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\35\3")
        buf.write("\2\2\2\34\32\3\2\2\2\35\36\7\5\2\2\36 \7\6\2\2\37!\5\4")
        buf.write("\3\2 \37\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#$\3")
        buf.write("\2\2\2$%\7\7\2\2%,\3\2\2\2&,\7\b\2\2\',\7\t\2\2(,\7\n")
        buf.write("\2\2),\t\2\2\2*,\7\r\2\2+\16\3\2\2\2+&\3\2\2\2+\'\3\2")
        buf.write("\2\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,\5\3\2\2\2\7\t\23\32")
        buf.write("\"+")
        return buf.getvalue()


class PactorParser ( Parser ):

    grammarFileName = "Pactor.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'('", "'--'", "')'", "':'", "';'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "NUMBER", "FLOAT", "STRING", 
                      "WORD", "MATH_WORDS", "WS" ]

    RULE_program = 0
    RULE_commands = 1

    ruleNames =  [ "program", "commands" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    NUMBER=6
    FLOAT=7
    STRING=8
    WORD=9
    MATH_WORDS=10
    WS=11

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
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << PactorParser.NUMBER) | (1 << PactorParser.FLOAT) | (1 << PactorParser.STRING) | (1 << PactorParser.WORD) | (1 << PactorParser.MATH_WORDS) | (1 << PactorParser.WS))) != 0):
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


    class CreateWordContext(CommandsContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PactorParser.CommandsContext
            super().__init__(parser)
            self.name = None # Token
            self._WORD = None # Token
            self.params_in = list() # of Tokens
            self.params_out = list() # of Tokens
            self.body = None # CommandsContext
            self.copyFrom(ctx)

        def WORD(self, i:int=None):
            if i is None:
                return self.getTokens(PactorParser.WORD)
            else:
                return self.getToken(PactorParser.WORD, i)
        def commands(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PactorParser.CommandsContext)
            else:
                return self.getTypedRuleContext(PactorParser.CommandsContext,i)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCreateWord" ):
                return visitor.visitCreateWord(self)
            else:
                return visitor.visitChildren(self)


    class CommandIgnoreContext(CommandsContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PactorParser.CommandsContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def WS(self):
            return self.getToken(PactorParser.WS, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCommandIgnore" ):
                return visitor.visitCommandIgnore(self)
            else:
                return visitor.visitChildren(self)


    class CommandRunContext(CommandsContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PactorParser.CommandsContext
            super().__init__(parser)
            self.value = None # Token
            self.copyFrom(ctx)

        def WORD(self):
            return self.getToken(PactorParser.WORD, 0)
        def MATH_WORDS(self):
            return self.getToken(PactorParser.MATH_WORDS, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCommandRun" ):
                return visitor.visitCommandRun(self)
            else:
                return visitor.visitChildren(self)



    def commands(self):

        localctx = PactorParser.CommandsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_commands)
        self._la = 0 # Token type
        try:
            self.state = 41
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,4,self._ctx)
            if la_ == 1:
                localctx = PactorParser.CreateWordContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 12
                localctx.name = self.match(PactorParser.WORD)
                self.state = 13
                self.match(PactorParser.T__0)
                self.state = 17
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==PactorParser.WORD:
                    self.state = 14
                    localctx._WORD = self.match(PactorParser.WORD)
                    localctx.params_in.append(localctx._WORD)
                    self.state = 19
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 20
                self.match(PactorParser.T__1)
                self.state = 24
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==PactorParser.WORD:
                    self.state = 21
                    localctx._WORD = self.match(PactorParser.WORD)
                    localctx.params_out.append(localctx._WORD)
                    self.state = 26
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 27
                self.match(PactorParser.T__2)
                self.state = 28
                self.match(PactorParser.T__3)
                self.state = 30 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 29
                    localctx.body = self.commands()
                    self.state = 32 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << PactorParser.NUMBER) | (1 << PactorParser.FLOAT) | (1 << PactorParser.STRING) | (1 << PactorParser.WORD) | (1 << PactorParser.MATH_WORDS) | (1 << PactorParser.WS))) != 0)):
                        break

                self.state = 34
                self.match(PactorParser.T__4)
                pass

            elif la_ == 2:
                localctx = PactorParser.PushNumberToStackContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 36
                localctx.value = self.match(PactorParser.NUMBER)
                pass

            elif la_ == 3:
                localctx = PactorParser.PushFloatToStackContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 37
                localctx.value = self.match(PactorParser.FLOAT)
                pass

            elif la_ == 4:
                localctx = PactorParser.PushStringToStackContext(self, localctx)
                self.enterOuterAlt(localctx, 4)
                self.state = 38
                localctx.value = self.match(PactorParser.STRING)
                pass

            elif la_ == 5:
                localctx = PactorParser.CommandRunContext(self, localctx)
                self.enterOuterAlt(localctx, 5)
                self.state = 39
                localctx.value = self._input.LT(1)
                _la = self._input.LA(1)
                if not(_la==PactorParser.WORD or _la==PactorParser.MATH_WORDS):
                    localctx.value = self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                pass

            elif la_ == 6:
                localctx = PactorParser.CommandIgnoreContext(self, localctx)
                self.enterOuterAlt(localctx, 6)
                self.state = 40
                self.match(PactorParser.WS)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





