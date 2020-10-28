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
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24")
        buf.write("V\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\7\2\16\n")
        buf.write("\2\f\2\16\2\21\13\2\3\2\3\2\3\2\7\2\26\n\2\f\2\16\2\31")
        buf.write("\13\2\3\2\3\2\3\3\3\3\3\3\7\3 \n\3\f\3\16\3#\13\3\3\3")
        buf.write("\3\3\7\3\'\n\3\f\3\16\3*\13\3\3\3\3\3\3\3\3\3\3\3\7\3")
        buf.write("\61\n\3\f\3\16\3\64\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3")
        buf.write("\4\3\4\3\4\3\4\3\4\5\4B\n\4\3\5\3\5\3\5\7\5G\n\5\f\5\16")
        buf.write("\5J\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6T\n\6\3\6")
        buf.write("\2\2\7\2\4\6\b\n\2\3\3\2\22\23\2b\2\17\3\2\2\2\4\34\3")
        buf.write("\2\2\2\6A\3\2\2\2\bC\3\2\2\2\nS\3\2\2\2\f\16\5\4\3\2\r")
        buf.write("\f\3\2\2\2\16\21\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20")
        buf.write("\27\3\2\2\2\21\17\3\2\2\2\22\26\5\n\6\2\23\26\5\6\4\2")
        buf.write("\24\26\5\b\5\2\25\22\3\2\2\2\25\23\3\2\2\2\25\24\3\2\2")
        buf.write("\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\32\3\2")
        buf.write("\2\2\31\27\3\2\2\2\32\33\7\2\2\3\33\3\3\2\2\2\34\35\7")
        buf.write("\22\2\2\35!\7\3\2\2\36 \7\22\2\2\37\36\3\2\2\2 #\3\2\2")
        buf.write("\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$(\7\4\2")
        buf.write("\2%\'\7\22\2\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2")
        buf.write("\2)+\3\2\2\2*(\3\2\2\2+,\7\5\2\2,\62\7\6\2\2-\61\5\n\6")
        buf.write("\2.\61\5\6\4\2/\61\5\b\5\2\60-\3\2\2\2\60.\3\2\2\2\60")
        buf.write("/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63")
        buf.write("\65\3\2\2\2\64\62\3\2\2\2\65\66\7\7\2\2\66\5\3\2\2\2\67")
        buf.write("8\5\b\5\289\5\b\5\29:\7\b\2\2:B\3\2\2\2;<\5\b\5\2<=\7")
        buf.write("\t\2\2=B\3\2\2\2>?\5\b\5\2?@\7\n\2\2@B\3\2\2\2A\67\3\2")
        buf.write("\2\2A;\3\2\2\2A>\3\2\2\2B\7\3\2\2\2CH\7\13\2\2DG\5\b\5")
        buf.write("\2EG\5\n\6\2FD\3\2\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2H")
        buf.write("I\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\7\f\2\2L\t\3\2\2\2MT\7")
        buf.write("\16\2\2NT\7\17\2\2OT\7\20\2\2PT\7\r\2\2QT\7\21\2\2RT\t")
        buf.write("\2\2\2SM\3\2\2\2SN\3\2\2\2SO\3\2\2\2SP\3\2\2\2SQ\3\2\2")
        buf.write("\2SR\3\2\2\2T\13\3\2\2\2\r\17\25\27!(\60\62AFHS")
        return buf.getvalue()


class PactorParser ( Parser ):

    grammarFileName = "Pactor.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'('", "'--'", "')'", "':'", "';'", "'if'", 
                     "'when'", "'times'", "'['", "']'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "EXPRESSIONS", 
                      "NUMBER", "FLOAT", "STRING", "BOOLEAN", "WORD", "MATH_WORDS", 
                      "WS" ]

    RULE_program = 0
    RULE_create_words = 1
    RULE_commands = 2
    RULE_quote = 3
    RULE_statement = 4

    ruleNames =  [ "program", "create_words", "commands", "quote", "statement" ]

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
    EXPRESSIONS=11
    NUMBER=12
    FLOAT=13
    STRING=14
    BOOLEAN=15
    WORD=16
    MATH_WORDS=17
    WS=18

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
            self.state = 13
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,0,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 10
                    self.create_words() 
                self.state = 15
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,0,self._ctx)

            self.state = 21
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << PactorParser.T__8) | (1 << PactorParser.EXPRESSIONS) | (1 << PactorParser.NUMBER) | (1 << PactorParser.FLOAT) | (1 << PactorParser.STRING) | (1 << PactorParser.BOOLEAN) | (1 << PactorParser.WORD) | (1 << PactorParser.MATH_WORDS))) != 0):
                self.state = 19
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,1,self._ctx)
                if la_ == 1:
                    self.state = 16
                    self.statement()
                    pass

                elif la_ == 2:
                    self.state = 17
                    self.commands()
                    pass

                elif la_ == 3:
                    self.state = 18
                    self.quote()
                    pass


                self.state = 23
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 24
            self.match(PactorParser.EOF)
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
        self.enterRule(localctx, 2, self.RULE_create_words)
        self._la = 0 # Token type
        try:
            localctx = PactorParser.CreateWordContext(self, localctx)
            self.enterOuterAlt(localctx, 1)
            self.state = 26
            localctx.name = self.match(PactorParser.WORD)
            self.state = 27
            self.match(PactorParser.T__0)
            self.state = 31
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==PactorParser.WORD:
                self.state = 28
                localctx._WORD = self.match(PactorParser.WORD)
                localctx.params_in.append(localctx._WORD)
                self.state = 33
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 34
            self.match(PactorParser.T__1)
            self.state = 38
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==PactorParser.WORD:
                self.state = 35
                localctx._WORD = self.match(PactorParser.WORD)
                localctx.params_out.append(localctx._WORD)
                self.state = 40
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 41
            self.match(PactorParser.T__2)
            self.state = 42
            self.match(PactorParser.T__3)
            self.state = 48
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << PactorParser.T__8) | (1 << PactorParser.EXPRESSIONS) | (1 << PactorParser.NUMBER) | (1 << PactorParser.FLOAT) | (1 << PactorParser.STRING) | (1 << PactorParser.BOOLEAN) | (1 << PactorParser.WORD) | (1 << PactorParser.MATH_WORDS))) != 0):
                self.state = 46
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,5,self._ctx)
                if la_ == 1:
                    self.state = 43
                    self.statement()
                    pass

                elif la_ == 2:
                    self.state = 44
                    self.commands()
                    pass

                elif la_ == 3:
                    self.state = 45
                    self.quote()
                    pass


                self.state = 50
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 51
            self.match(PactorParser.T__4)
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
        self.enterRule(localctx, 4, self.RULE_commands)
        try:
            self.state = 63
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,7,self._ctx)
            if la_ == 1:
                localctx = PactorParser.CreateIfContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 53
                self.quote()
                self.state = 54
                self.quote()
                self.state = 55
                self.match(PactorParser.T__5)
                pass

            elif la_ == 2:
                localctx = PactorParser.CreateWhenContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 57
                self.quote()
                self.state = 58
                self.match(PactorParser.T__6)
                pass

            elif la_ == 3:
                localctx = PactorParser.CreateTimesContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 60
                self.quote()
                self.state = 61
                self.match(PactorParser.T__7)
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
        self.enterRule(localctx, 6, self.RULE_quote)
        self._la = 0 # Token type
        try:
            localctx = PactorParser.CreateQuoteContext(self, localctx)
            self.enterOuterAlt(localctx, 1)
            self.state = 65
            self.match(PactorParser.T__8)
            self.state = 70
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << PactorParser.T__8) | (1 << PactorParser.EXPRESSIONS) | (1 << PactorParser.NUMBER) | (1 << PactorParser.FLOAT) | (1 << PactorParser.STRING) | (1 << PactorParser.BOOLEAN) | (1 << PactorParser.WORD) | (1 << PactorParser.MATH_WORDS))) != 0):
                self.state = 68
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [PactorParser.T__8]:
                    self.state = 66
                    self.quote()
                    pass
                elif token in [PactorParser.EXPRESSIONS, PactorParser.NUMBER, PactorParser.FLOAT, PactorParser.STRING, PactorParser.BOOLEAN, PactorParser.WORD, PactorParser.MATH_WORDS]:
                    self.state = 67
                    self.statement()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 72
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 73
            self.match(PactorParser.T__9)
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
        self.enterRule(localctx, 8, self.RULE_statement)
        self._la = 0 # Token type
        try:
            self.state = 81
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [PactorParser.NUMBER]:
                localctx = PactorParser.PushNumberToStackContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 75
                localctx.value = self.match(PactorParser.NUMBER)
                pass
            elif token in [PactorParser.FLOAT]:
                localctx = PactorParser.PushFloatToStackContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 76
                localctx.value = self.match(PactorParser.FLOAT)
                pass
            elif token in [PactorParser.STRING]:
                localctx = PactorParser.PushStringToStackContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 77
                localctx.value = self.match(PactorParser.STRING)
                pass
            elif token in [PactorParser.EXPRESSIONS]:
                localctx = PactorParser.PushExpressionToStackContext(self, localctx)
                self.enterOuterAlt(localctx, 4)
                self.state = 78
                localctx.value = self.match(PactorParser.EXPRESSIONS)
                pass
            elif token in [PactorParser.BOOLEAN]:
                localctx = PactorParser.PushBooleanToStackContext(self, localctx)
                self.enterOuterAlt(localctx, 5)
                self.state = 79
                localctx.value = self.match(PactorParser.BOOLEAN)
                pass
            elif token in [PactorParser.WORD, PactorParser.MATH_WORDS]:
                localctx = PactorParser.CommandRunContext(self, localctx)
                self.enterOuterAlt(localctx, 6)
                self.state = 80
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





