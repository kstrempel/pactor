# Generated from Pactor.g4 by ANTLR 4.8
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\7")
        buf.write("J\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2")
        buf.write("\17\n\2\r\2\16\2\20\3\2\3\2\7\2\25\n\2\f\2\16\2\30\13")
        buf.write("\2\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\3\3\3\6\3\"\n\3\r")
        buf.write("\3\16\3#\3\3\3\3\6\3(\n\3\r\3\16\3)\7\3,\n\3\f\3\16\3")
        buf.write("/\13\3\3\4\3\4\3\4\3\4\7\4\65\n\4\f\4\16\48\13\4\3\4\3")
        buf.write("\4\3\5\6\5=\n\5\r\5\16\5>\3\5\5\5B\n\5\3\6\6\6E\n\6\r")
        buf.write("\6\16\6F\3\6\3\6\2\2\7\3\3\5\4\7\5\t\6\13\7\3\2\7\4\2")
        buf.write("GGgg\3\2$$\3\2c|\5\2,-//\61\61\6\2\13\f\17\17\"\"..\2")
        buf.write("T\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13")
        buf.write("\3\2\2\2\3\16\3\2\2\2\5\34\3\2\2\2\7\60\3\2\2\2\tA\3\2")
        buf.write("\2\2\13D\3\2\2\2\r\17\4\62;\2\16\r\3\2\2\2\17\20\3\2\2")
        buf.write("\2\20\16\3\2\2\2\20\21\3\2\2\2\21\26\3\2\2\2\22\23\t\2")
        buf.write("\2\2\23\25\5\3\2\2\24\22\3\2\2\2\25\30\3\2\2\2\26\24\3")
        buf.write("\2\2\2\26\27\3\2\2\2\27\4\3\2\2\2\30\26\3\2\2\2\31\33")
        buf.write("\4\62;\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34")
        buf.write("\35\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37!\7\60\2\2 ")
        buf.write("\"\4\62;\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$-")
        buf.write("\3\2\2\2%\'\t\2\2\2&(\4\62;\2\'&\3\2\2\2()\3\2\2\2)\'")
        buf.write("\3\2\2\2)*\3\2\2\2*,\3\2\2\2+%\3\2\2\2,/\3\2\2\2-+\3\2")
        buf.write("\2\2-.\3\2\2\2.\6\3\2\2\2/-\3\2\2\2\60\66\7$\2\2\61\65")
        buf.write("\n\3\2\2\62\63\7^\2\2\63\65\7$\2\2\64\61\3\2\2\2\64\62")
        buf.write("\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3")
        buf.write("\2\2\28\66\3\2\2\29:\7$\2\2:\b\3\2\2\2;=\t\4\2\2<;\3\2")
        buf.write("\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?B\3\2\2\2@B\t\5\2\2")
        buf.write("A<\3\2\2\2A@\3\2\2\2B\n\3\2\2\2CE\t\6\2\2DC\3\2\2\2EF")
        buf.write("\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\b\6\2\2I\f\3")
        buf.write("\2\2\2\16\2\20\26\34#)-\64\66>AF\3\b\2\2")
        return buf.getvalue()


class PactorLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    NUMBER = 1
    FLOAT = 2
    STRING = 3
    WORD = 4
    WS = 5

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
 ]

    symbolicNames = [ "<INVALID>",
            "NUMBER", "FLOAT", "STRING", "WORD", "WS" ]

    ruleNames = [ "NUMBER", "FLOAT", "STRING", "WORD", "WS" ]

    grammarFileName = "Pactor.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.8")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


