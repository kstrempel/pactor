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
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26")
        buf.write("g\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2")
        buf.write("\7\2\20\n\2\f\2\16\2\23\13\2\3\2\7\2\26\n\2\f\2\16\2\31")
        buf.write("\13\2\3\2\3\2\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\3\2\3")
        buf.write("\3\3\3\7\3\'\n\3\f\3\16\3*\13\3\3\3\3\3\3\4\3\4\3\4\3")
        buf.write("\4\7\4\62\n\4\f\4\16\4\65\13\4\3\4\3\4\7\49\n\4\f\4\16")
        buf.write("\4<\13\4\3\4\3\4\3\4\3\4\7\4B\n\4\f\4\16\4E\13\4\3\4\3")
        buf.write("\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5S\n\5\3")
        buf.write("\6\3\6\3\6\7\6X\n\6\f\6\16\6[\13\6\3\6\3\6\3\7\3\7\3\7")
        buf.write("\3\7\3\7\3\7\5\7e\n\7\3\7\2\2\b\2\4\6\b\n\f\2\3\4\2\23")
        buf.write("\23\25\25\2t\2\21\3\2\2\2\4$\3\2\2\2\6-\3\2\2\2\bR\3\2")
        buf.write("\2\2\nT\3\2\2\2\fd\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2")
        buf.write("\20\23\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\27\3\2\2")
        buf.write("\2\23\21\3\2\2\2\24\26\5\6\4\2\25\24\3\2\2\2\26\31\3\2")
        buf.write("\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\37\3\2\2\2\31\27\3")
        buf.write("\2\2\2\32\36\5\f\7\2\33\36\5\b\5\2\34\36\5\n\6\2\35\32")
        buf.write("\3\2\2\2\35\33\3\2\2\2\35\34\3\2\2\2\36!\3\2\2\2\37\35")
        buf.write("\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\7\2\2\3")
        buf.write("#\3\3\2\2\2$(\7\3\2\2%\'\7\24\2\2&%\3\2\2\2\'*\3\2\2\2")
        buf.write("(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\7\4\2\2,\5")
        buf.write("\3\2\2\2-.\7\5\2\2./\7\23\2\2/\63\7\6\2\2\60\62\7\23\2")
        buf.write("\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2")
        buf.write("\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66:\7\7\2\2\679\7\23")
        buf.write("\2\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2")
        buf.write("\2<:\3\2\2\2=C\7\b\2\2>B\5\f\7\2?B\5\b\5\2@B\5\n\6\2A")
        buf.write(">\3\2\2\2A?\3\2\2\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3")
        buf.write("\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7\4\2\2G\7\3\2\2\2HI\5\n")
        buf.write("\6\2IJ\5\n\6\2JK\7\t\2\2KS\3\2\2\2LM\5\n\6\2MN\7\n\2\2")
        buf.write("NS\3\2\2\2OP\5\n\6\2PQ\7\13\2\2QS\3\2\2\2RH\3\2\2\2RL")
        buf.write("\3\2\2\2RO\3\2\2\2S\t\3\2\2\2TY\7\f\2\2UX\5\n\6\2VX\5")
        buf.write("\f\7\2WU\3\2\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2")
        buf.write("\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7\r\2\2]\13\3\2\2\2^e\7\17")
        buf.write("\2\2_e\7\20\2\2`e\7\21\2\2ae\7\16\2\2be\7\22\2\2ce\t\2")
        buf.write("\2\2d^\3\2\2\2d_\3\2\2\2d`\3\2\2\2da\3\2\2\2db\3\2\2\2")
        buf.write("dc\3\2\2\2e\r\3\2\2\2\17\21\27\35\37(\63:ACRWYd")
        return buf.getvalue()


class PactorParser ( Parser ):

    grammarFileName = "Pactor.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'USING:'", "';'", "':'", "'('", "'--'", 
                     "')'", "'if'", "'when'", "'times'", "'['", "']'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "EXPRESSIONS", "NUMBER", "FLOAT", "STRING", "BOOLEAN", 
                      "WORD", "PACKAGES", "MATH_WORDS", "WS" ]

    RULE_program = 0
    RULE_using = 1
    RULE_create_words = 2
    RULE_commands = 3
    RULE_quote = 4
    RULE_statement = 5

    ruleNames =  [ "program", "using", "create_words", "commands", "quote", 
                   "statement" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    EXPRESSIONS=12
    NUMBER=13
    FLOAT=14
    STRING=15
    BOOLEAN=16
    WORD=17
    PACKAGES=18
    MATH_WORDS=19
    WS=20

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

        def using(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PactorParser.UsingContext)
            else:
                return self.getTypedRuleContext(PactorParser.UsingContext,i)


        def create_words(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PactorParser.Create_wordsContext)
            else:
                return self.getTypedRuleContext(PactorParser.Create_wordsContext,i)


        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PactorParser.StatementContext)
            else:
                return self.getTypedRuleContext(PactorParser.StatementContext,i)


        def commands(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PactorParser.CommandsContext)
            else:
                return self.getTypedRuleContext(PactorParser.CommandsContext,i)


        def quote(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PactorParser.QuoteContext)
            else:
                return self.getTypedRuleContext(PactorParser.QuoteContext,i)


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
            self.state = 15
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==PactorParser.T__0:
                self.state = 12
                self.using()
                self.state = 17
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 21
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==PactorParser.T__2:
                self.state = 18
                self.create_words()
                self.state = 23
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 29
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << PactorParser.T__9) | (1 << PactorParser.EXPRESSIONS) | (1 << PactorParser.NUMBER) | (1 << PactorParser.FLOAT) | (1 << PactorParser.STRING) | (1 << PactorParser.BOOLEAN) | (1 << PactorParser.WORD) | (1 << PactorParser.MATH_WORDS))) != 0):
                self.state = 27
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,2,self._ctx)
                if la_ == 1:
                    self.state = 24
                    self.statement()
                    pass

                elif la_ == 2:
                    self.state = 25
                    self.commands()
                    pass

                elif la_ == 3:
                    self.state = 26
                    self.quote()
                    pass


                self.state = 31
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 32
            self.match(PactorParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class UsingContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PACKAGES(self, i:int=None):
            if i is None:
                return self.getTokens(PactorParser.PACKAGES)
            else:
                return self.getToken(PactorParser.PACKAGES, i)

        def getRuleIndex(self):
            return PactorParser.RULE_using

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitUsing" ):
                return visitor.visitUsing(self)
            else:
                return visitor.visitChildren(self)




    def using(self):

        localctx = PactorParser.UsingContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_using)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 34
            self.match(PactorParser.T__0)
            self.state = 38
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==PactorParser.PACKAGES:
                self.state = 35
                self.match(PactorParser.PACKAGES)
                self.state = 40
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 41
            self.match(PactorParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Create_wordsContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return PactorParser.RULE_create_words

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class CreateWordContext(Create_wordsContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PactorParser.Create_wordsContext
            super().__init__(parser)
            self.name = None # Token
            self._WORD = None # Token
            self.params_in = list() # of Tokens
            self.params_out = list() # of Tokens
            self.copyFrom(ctx)

        def WORD(self, i:int=None):
            if i is None:
                return self.getTokens(PactorParser.WORD)
            else:
                return self.getToken(PactorParser.WORD, i)
        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PactorParser.StatementContext)
            else:
                return self.getTypedRuleContext(PactorParser.StatementContext,i)

        def commands(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PactorParser.CommandsContext)
            else:
                return self.getTypedRuleContext(PactorParser.CommandsContext,i)

        def quote(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PactorParser.QuoteContext)
            else:
                return self.getTypedRuleContext(PactorParser.QuoteContext,i)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCreateWord" ):
                return visitor.visitCreateWord(self)
            else:
                return visitor.visitChildren(self)



    def create_words(self):

        localctx = PactorParser.Create_wordsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_create_words)
        self._la = 0 # Token type
        try:
            localctx = PactorParser.CreateWordContext(self, localctx)
            self.enterOuterAlt(localctx, 1)
            self.state = 43
            self.match(PactorParser.T__2)
            self.state = 44
            localctx.name = self.match(PactorParser.WORD)
            self.state = 45
            self.match(PactorParser.T__3)
            self.state = 49
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==PactorParser.WORD:
                self.state = 46
                localctx._WORD = self.match(PactorParser.WORD)
                localctx.params_in.append(localctx._WORD)
                self.state = 51
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 52
            self.match(PactorParser.T__4)
            self.state = 56
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==PactorParser.WORD:
                self.state = 53
                localctx._WORD = self.match(PactorParser.WORD)
                localctx.params_out.append(localctx._WORD)
                self.state = 58
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 59
            self.match(PactorParser.T__5)
            self.state = 65
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << PactorParser.T__9) | (1 << PactorParser.EXPRESSIONS) | (1 << PactorParser.NUMBER) | (1 << PactorParser.FLOAT) | (1 << PactorParser.STRING) | (1 << PactorParser.BOOLEAN) | (1 << PactorParser.WORD) | (1 << PactorParser.MATH_WORDS))) != 0):
                self.state = 63
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,7,self._ctx)
                if la_ == 1:
                    self.state = 60
                    self.statement()
                    pass

                elif la_ == 2:
                    self.state = 61
                    self.commands()
                    pass

                elif la_ == 3:
                    self.state = 62
                    self.quote()
                    pass


                self.state = 67
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 68
            self.match(PactorParser.T__1)
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



    class CreateIfContext(CommandsContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PactorParser.CommandsContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def quote(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PactorParser.QuoteContext)
            else:
                return self.getTypedRuleContext(PactorParser.QuoteContext,i)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCreateIf" ):
                return visitor.visitCreateIf(self)
            else:
                return visitor.visitChildren(self)


    class CreateWhenContext(CommandsContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PactorParser.CommandsContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def quote(self):
            return self.getTypedRuleContext(PactorParser.QuoteContext,0)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCreateWhen" ):
                return visitor.visitCreateWhen(self)
            else:
                return visitor.visitChildren(self)


    class CreateTimesContext(CommandsContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PactorParser.CommandsContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def quote(self):
            return self.getTypedRuleContext(PactorParser.QuoteContext,0)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCreateTimes" ):
                return visitor.visitCreateTimes(self)
            else:
                return visitor.visitChildren(self)



    def commands(self):

        localctx = PactorParser.CommandsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_commands)
        try:
            self.state = 80
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,9,self._ctx)
            if la_ == 1:
                localctx = PactorParser.CreateIfContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 70
                self.quote()
                self.state = 71
                self.quote()
                self.state = 72
                self.match(PactorParser.T__6)
                pass

            elif la_ == 2:
                localctx = PactorParser.CreateWhenContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 74
                self.quote()
                self.state = 75
                self.match(PactorParser.T__7)
                pass

            elif la_ == 3:
                localctx = PactorParser.CreateTimesContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 77
                self.quote()
                self.state = 78
                self.match(PactorParser.T__8)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class QuoteContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return PactorParser.RULE_quote

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class CreateQuoteContext(QuoteContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PactorParser.QuoteContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def quote(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PactorParser.QuoteContext)
            else:
                return self.getTypedRuleContext(PactorParser.QuoteContext,i)

        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PactorParser.StatementContext)
            else:
                return self.getTypedRuleContext(PactorParser.StatementContext,i)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCreateQuote" ):
                return visitor.visitCreateQuote(self)
            else:
                return visitor.visitChildren(self)



    def quote(self):

        localctx = PactorParser.QuoteContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_quote)
        self._la = 0 # Token type
        try:
            localctx = PactorParser.CreateQuoteContext(self, localctx)
            self.enterOuterAlt(localctx, 1)
            self.state = 82
            self.match(PactorParser.T__9)
            self.state = 87
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << PactorParser.T__9) | (1 << PactorParser.EXPRESSIONS) | (1 << PactorParser.NUMBER) | (1 << PactorParser.FLOAT) | (1 << PactorParser.STRING) | (1 << PactorParser.BOOLEAN) | (1 << PactorParser.WORD) | (1 << PactorParser.MATH_WORDS))) != 0):
                self.state = 85
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [PactorParser.T__9]:
                    self.state = 83
                    self.quote()
                    pass
                elif token in [PactorParser.EXPRESSIONS, PactorParser.NUMBER, PactorParser.FLOAT, PactorParser.STRING, PactorParser.BOOLEAN, PactorParser.WORD, PactorParser.MATH_WORDS]:
                    self.state = 84
                    self.statement()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 89
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 90
            self.match(PactorParser.T__10)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StatementContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return PactorParser.RULE_statement

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class PushFloatToStackContext(StatementContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PactorParser.StatementContext
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


    class PushStringToStackContext(StatementContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PactorParser.StatementContext
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


    class PushNumberToStackContext(StatementContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PactorParser.StatementContext
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


    class PushBooleanToStackContext(StatementContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PactorParser.StatementContext
            super().__init__(parser)
            self.value = None # Token
            self.copyFrom(ctx)

        def BOOLEAN(self):
            return self.getToken(PactorParser.BOOLEAN, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPushBooleanToStack" ):
                return visitor.visitPushBooleanToStack(self)
            else:
                return visitor.visitChildren(self)


    class PushExpressionToStackContext(StatementContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PactorParser.StatementContext
            super().__init__(parser)
            self.value = None # Token
            self.copyFrom(ctx)

        def EXPRESSIONS(self):
            return self.getToken(PactorParser.EXPRESSIONS, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPushExpressionToStack" ):
                return visitor.visitPushExpressionToStack(self)
            else:
                return visitor.visitChildren(self)


    class CommandRunContext(StatementContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PactorParser.StatementContext
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



    def statement(self):

        localctx = PactorParser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_statement)
        self._la = 0 # Token type
        try:
            self.state = 98
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [PactorParser.NUMBER]:
                localctx = PactorParser.PushNumberToStackContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 92
                localctx.value = self.match(PactorParser.NUMBER)
                pass
            elif token in [PactorParser.FLOAT]:
                localctx = PactorParser.PushFloatToStackContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 93
                localctx.value = self.match(PactorParser.FLOAT)
                pass
            elif token in [PactorParser.STRING]:
                localctx = PactorParser.PushStringToStackContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 94
                localctx.value = self.match(PactorParser.STRING)
                pass
            elif token in [PactorParser.EXPRESSIONS]:
                localctx = PactorParser.PushExpressionToStackContext(self, localctx)
                self.enterOuterAlt(localctx, 4)
                self.state = 95
                localctx.value = self.match(PactorParser.EXPRESSIONS)
                pass
            elif token in [PactorParser.BOOLEAN]:
                localctx = PactorParser.PushBooleanToStackContext(self, localctx)
                self.enterOuterAlt(localctx, 5)
                self.state = 96
                localctx.value = self.match(PactorParser.BOOLEAN)
                pass
            elif token in [PactorParser.WORD, PactorParser.MATH_WORDS]:
                localctx = PactorParser.CommandRunContext(self, localctx)
                self.enterOuterAlt(localctx, 6)
                self.state = 97
                localctx.value = self._input.LT(1)
                _la = self._input.LA(1)
                if not(_la==PactorParser.WORD or _la==PactorParser.MATH_WORDS):
                    localctx.value = self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
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





