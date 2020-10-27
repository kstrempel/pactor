# Generated from Pactor.g4 by ANTLR 4.8
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17")
        buf.write("h\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16")
        buf.write("\t\16\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7")
        buf.write("\3\7\3\b\3\b\3\t\6\t.\n\t\r\t\16\t/\3\t\3\t\7\t\64\n\t")
        buf.write("\f\t\16\t\67\13\t\3\n\7\n:\n\n\f\n\16\n=\13\n\3\n\3\n")
        buf.write("\6\nA\n\n\r\n\16\nB\3\n\3\n\6\nG\n\n\r\n\16\nH\7\nK\n")
        buf.write("\n\f\n\16\nN\13\n\3\13\3\13\3\13\3\13\7\13T\n\13\f\13")
        buf.write("\16\13W\13\13\3\13\3\13\3\f\6\f\\\n\f\r\f\16\f]\3\r\3")
        buf.write("\r\3\16\6\16c\n\16\r\16\16\16d\3\16\3\16\2\2\17\3\3\5")
        buf.write("\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33")
        buf.write("\17\3\2\7\4\2GGgg\3\2$$\4\2\62;c|\5\2,-//\61\61\6\2\13")
        buf.write("\f\17\17\"\"..\2q\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2")
        buf.write("\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21")
        buf.write("\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3")
        buf.write("\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5\37\3\2\2\2\7\"\3\2")
        buf.write("\2\2\t$\3\2\2\2\13&\3\2\2\2\r(\3\2\2\2\17*\3\2\2\2\21")
        buf.write("-\3\2\2\2\23;\3\2\2\2\25O\3\2\2\2\27[\3\2\2\2\31_\3\2")
        buf.write("\2\2\33b\3\2\2\2\35\36\7*\2\2\36\4\3\2\2\2\37 \7/\2\2")
        buf.write(" !\7/\2\2!\6\3\2\2\2\"#\7+\2\2#\b\3\2\2\2$%\7<\2\2%\n")
        buf.write("\3\2\2\2&\'\7=\2\2\'\f\3\2\2\2()\7]\2\2)\16\3\2\2\2*+")
        buf.write("\7_\2\2+\20\3\2\2\2,.\4\62;\2-,\3\2\2\2./\3\2\2\2/-\3")
        buf.write("\2\2\2/\60\3\2\2\2\60\65\3\2\2\2\61\62\t\2\2\2\62\64\5")
        buf.write("\21\t\2\63\61\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66")
        buf.write("\3\2\2\2\66\22\3\2\2\2\67\65\3\2\2\28:\4\62;\298\3\2\2")
        buf.write("\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>")
        buf.write("@\7\60\2\2?A\4\62;\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3")
        buf.write("\2\2\2CL\3\2\2\2DF\t\2\2\2EG\4\62;\2FE\3\2\2\2GH\3\2\2")
        buf.write("\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JD\3\2\2\2KN\3\2\2\2L")
        buf.write("J\3\2\2\2LM\3\2\2\2M\24\3\2\2\2NL\3\2\2\2OU\7$\2\2PT\n")
        buf.write("\3\2\2QR\7^\2\2RT\7$\2\2SP\3\2\2\2SQ\3\2\2\2TW\3\2\2\2")
        buf.write("US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7$\2\2Y\26")
        buf.write("\3\2\2\2Z\\\t\4\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3")
        buf.write("\2\2\2^\30\3\2\2\2_`\t\5\2\2`\32\3\2\2\2ac\t\6\2\2ba\3")
        buf.write("\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\b\16")
        buf.write("\2\2g\34\3\2\2\2\r\2/\65;BHLSU]d\3\b\2\2")
        return buf.getvalue()


class PactorLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    T__1 = 2
    T__2 = 3
    T__3 = 4
    T__4 = 5
    T__5 = 6
    T__6 = 7
    NUMBER = 8
    FLOAT = 9
    STRING = 10
    WORD = 11
    MATH_WORDS = 12
    WS = 13

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'('", "'--'", "')'", "':'", "';'", "'['", "']'" ]

    symbolicNames = [ "<INVALID>",
            "NUMBER", "FLOAT", "STRING", "WORD", "MATH_WORDS", "WS" ]

    ruleNames = [ "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", 
                  "NUMBER", "FLOAT", "STRING", "WORD", "MATH_WORDS", "WS" ]

    grammarFileName = "Pactor.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.8")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


