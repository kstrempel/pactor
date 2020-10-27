# Generated from Pactor.g4 by ANTLR 4.8
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\6")
        buf.write("A\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\6\2\r\n\2\r")
        buf.write("\2\16\2\16\3\2\3\2\7\2\23\n\2\f\2\16\2\26\13\2\3\3\7\3")
        buf.write("\31\n\3\f\3\16\3\34\13\3\3\3\3\3\6\3 \n\3\r\3\16\3!\3")
        buf.write("\3\3\3\6\3&\n\3\r\3\16\3\'\7\3*\n\3\f\3\16\3-\13\3\3\4")
        buf.write("\3\4\3\4\3\4\7\4\63\n\4\f\4\16\4\66\13\4\3\4\3\4\3\5\6")
        buf.write("\5;\n\5\r\5\16\5<\3\5\5\5@\n\5\2\2\6\3\3\5\4\7\5\t\6\3")
        buf.write("\2\6\4\2GGgg\3\2$$\3\2c|\5\2,-//\61\61\2J\2\3\3\2\2\2")
        buf.write("\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\3\f\3\2\2\2\5\32")
        buf.write("\3\2\2\2\7.\3\2\2\2\t?\3\2\2\2\13\r\4\62;\2\f\13\3\2\2")
        buf.write("\2\r\16\3\2\2\2\16\f\3\2\2\2\16\17\3\2\2\2\17\24\3\2\2")
        buf.write("\2\20\21\t\2\2\2\21\23\5\3\2\2\22\20\3\2\2\2\23\26\3\2")
        buf.write("\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\4\3\2\2\2\26\24\3")
        buf.write("\2\2\2\27\31\4\62;\2\30\27\3\2\2\2\31\34\3\2\2\2\32\30")
        buf.write("\3\2\2\2\32\33\3\2\2\2\33\35\3\2\2\2\34\32\3\2\2\2\35")
        buf.write("\37\7\60\2\2\36 \4\62;\2\37\36\3\2\2\2 !\3\2\2\2!\37\3")
        buf.write("\2\2\2!\"\3\2\2\2\"+\3\2\2\2#%\t\2\2\2$&\4\62;\2%$\3\2")
        buf.write("\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)#\3\2")
        buf.write("\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\6\3\2\2\2-+\3\2\2")
        buf.write("\2.\64\7$\2\2/\63\n\3\2\2\60\61\7^\2\2\61\63\7$\2\2\62")
        buf.write("/\3\2\2\2\62\60\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64")
        buf.write("\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\7$\2\28\b")
        buf.write("\3\2\2\29;\t\4\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2")
        buf.write("\2\2=@\3\2\2\2>@\t\5\2\2?:\3\2\2\2?>\3\2\2\2@\n\3\2\2")
        buf.write("\2\r\2\16\24\32!\'+\62\64<?\2")
        return buf.getvalue()


class PactorLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    NUMBER = 1
    FLOAT = 2
    STRING = 3
    WORD = 4

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
 ]

    symbolicNames = [ "<INVALID>",
            "NUMBER", "FLOAT", "STRING", "WORD" ]

    ruleNames = [ "NUMBER", "FLOAT", "STRING", "WORD" ]

    grammarFileName = "Pactor.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.8")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


