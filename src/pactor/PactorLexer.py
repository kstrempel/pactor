# Generated from Pactor.g4 by ANTLR 4.8
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\r")
        buf.write("`\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\3\2\3\2\3\3")
        buf.write("\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\6\7&\n\7\r\7\16\7")
        buf.write("\'\3\7\3\7\7\7,\n\7\f\7\16\7/\13\7\3\b\7\b\62\n\b\f\b")
        buf.write("\16\b\65\13\b\3\b\3\b\6\b9\n\b\r\b\16\b:\3\b\3\b\6\b?")
        buf.write("\n\b\r\b\16\b@\7\bC\n\b\f\b\16\bF\13\b\3\t\3\t\3\t\3\t")
        buf.write("\7\tL\n\t\f\t\16\tO\13\t\3\t\3\t\3\n\6\nT\n\n\r\n\16\n")
        buf.write("U\3\13\3\13\3\f\6\f[\n\f\r\f\16\f\\\3\f\3\f\2\2\r\3\3")
        buf.write("\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\3\2\7")
        buf.write("\4\2GGgg\3\2$$\4\2\62;c|\5\2,-//\61\61\6\2\13\f\17\17")
        buf.write("\"\"..\2i\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2")
        buf.write("\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2")
        buf.write("\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2")
        buf.write("\5\33\3\2\2\2\7\36\3\2\2\2\t \3\2\2\2\13\"\3\2\2\2\r%")
        buf.write("\3\2\2\2\17\63\3\2\2\2\21G\3\2\2\2\23S\3\2\2\2\25W\3\2")
        buf.write("\2\2\27Z\3\2\2\2\31\32\7*\2\2\32\4\3\2\2\2\33\34\7/\2")
        buf.write("\2\34\35\7/\2\2\35\6\3\2\2\2\36\37\7+\2\2\37\b\3\2\2\2")
        buf.write(" !\7<\2\2!\n\3\2\2\2\"#\7=\2\2#\f\3\2\2\2$&\4\62;\2%$")
        buf.write("\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(-\3\2\2\2)*")
        buf.write("\t\2\2\2*,\5\r\7\2+)\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2")
        buf.write("\2\2.\16\3\2\2\2/-\3\2\2\2\60\62\4\62;\2\61\60\3\2\2\2")
        buf.write("\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2")
        buf.write("\2\65\63\3\2\2\2\668\7\60\2\2\679\4\62;\28\67\3\2\2\2")
        buf.write("9:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;D\3\2\2\2<>\t\2\2\2=?\4")
        buf.write("\62;\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2")
        buf.write("\2B<\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\20\3\2\2\2")
        buf.write("FD\3\2\2\2GM\7$\2\2HL\n\3\2\2IJ\7^\2\2JL\7$\2\2KH\3\2")
        buf.write("\2\2KI\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2")
        buf.write("OM\3\2\2\2PQ\7$\2\2Q\22\3\2\2\2RT\t\4\2\2SR\3\2\2\2TU")
        buf.write("\3\2\2\2US\3\2\2\2UV\3\2\2\2V\24\3\2\2\2WX\t\5\2\2X\26")
        buf.write("\3\2\2\2Y[\t\6\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]")
        buf.write("\3\2\2\2]^\3\2\2\2^_\b\f\2\2_\30\3\2\2\2\r\2\'-\63:@D")
        buf.write("KMU\\\3\b\2\2")
        return buf.getvalue()


class PactorLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    T__1 = 2
    T__2 = 3
    T__3 = 4
    T__4 = 5
    NUMBER = 6
    FLOAT = 7
    STRING = 8
    WORD = 9
    MATH_WORDS = 10
    WS = 11

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'('", "'--'", "')'", "':'", "';'" ]

    symbolicNames = [ "<INVALID>",
            "NUMBER", "FLOAT", "STRING", "WORD", "MATH_WORDS", "WS" ]

    ruleNames = [ "T__0", "T__1", "T__2", "T__3", "T__4", "NUMBER", "FLOAT", 
                  "STRING", "WORD", "MATH_WORDS", "WS" ]

    grammarFileName = "Pactor.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.8")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


