// Generated from /home/kai/Projects/pactor/Pactor.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PactorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, EXPRESSIONS=22, NUMBER=23, FLOAT=24, 
		STRING=25, BOOLEAN=26, WORD=27, MATH_WORDS=28, WS=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "EXPRESSIONS", "NUMBER", "FLOAT", 
			"STRING", "BOOLEAN", "WORD", "MATH_WORDS", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'USING:'", "';'", "':'", "'('", "'--'", "')'", "'::'", "'if'", 
			"'when'", "'times'", "'each'", "'filter'", "'reduce'", "'keys'", "'set'", 
			"'get'", "'{'", "'}'", "'['", "']'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "EXPRESSIONS", 
			"NUMBER", "FLOAT", "STRING", "BOOLEAN", "WORD", "MATH_WORDS", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public PactorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pactor.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00e0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u009b"+
		"\n\27\3\30\6\30\u009e\n\30\r\30\16\30\u009f\3\30\3\30\7\30\u00a4\n\30"+
		"\f\30\16\30\u00a7\13\30\3\31\7\31\u00aa\n\31\f\31\16\31\u00ad\13\31\3"+
		"\31\3\31\6\31\u00b1\n\31\r\31\16\31\u00b2\3\31\3\31\6\31\u00b7\n\31\r"+
		"\31\16\31\u00b8\7\31\u00bb\n\31\f\31\16\31\u00be\13\31\3\32\3\32\3\32"+
		"\3\32\7\32\u00c4\n\32\f\32\16\32\u00c7\13\32\3\32\3\32\3\33\3\33\3\34"+
		"\6\34\u00ce\n\34\r\34\16\34\u00cf\3\34\7\34\u00d3\n\34\f\34\16\34\u00d6"+
		"\13\34\3\35\3\35\3\36\6\36\u00db\n\36\r\36\16\36\u00dc\3\36\3\36\2\2\37"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"\3\2\b\4\2GGgg\3\2$$\4\2hhvv\5\2\62;aac|\5\2,-//\61\61\6\2\13\f\17\17"+
		"\"\"..\2\u00f0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5D\3\2\2\2\7F\3\2\2\2\tH\3\2\2\2\13J\3"+
		"\2\2\2\rM\3\2\2\2\17O\3\2\2\2\21R\3\2\2\2\23U\3\2\2\2\25Z\3\2\2\2\27`"+
		"\3\2\2\2\31e\3\2\2\2\33l\3\2\2\2\35s\3\2\2\2\37x\3\2\2\2!|\3\2\2\2#\u0080"+
		"\3\2\2\2%\u0082\3\2\2\2\'\u0084\3\2\2\2)\u0086\3\2\2\2+\u0088\3\2\2\2"+
		"-\u009a\3\2\2\2/\u009d\3\2\2\2\61\u00ab\3\2\2\2\63\u00bf\3\2\2\2\65\u00ca"+
		"\3\2\2\2\67\u00cd\3\2\2\29\u00d7\3\2\2\2;\u00da\3\2\2\2=>\7W\2\2>?\7U"+
		"\2\2?@\7K\2\2@A\7P\2\2AB\7I\2\2BC\7<\2\2C\4\3\2\2\2DE\7=\2\2E\6\3\2\2"+
		"\2FG\7<\2\2G\b\3\2\2\2HI\7*\2\2I\n\3\2\2\2JK\7/\2\2KL\7/\2\2L\f\3\2\2"+
		"\2MN\7+\2\2N\16\3\2\2\2OP\7<\2\2PQ\7<\2\2Q\20\3\2\2\2RS\7k\2\2ST\7h\2"+
		"\2T\22\3\2\2\2UV\7y\2\2VW\7j\2\2WX\7g\2\2XY\7p\2\2Y\24\3\2\2\2Z[\7v\2"+
		"\2[\\\7k\2\2\\]\7o\2\2]^\7g\2\2^_\7u\2\2_\26\3\2\2\2`a\7g\2\2ab\7c\2\2"+
		"bc\7e\2\2cd\7j\2\2d\30\3\2\2\2ef\7h\2\2fg\7k\2\2gh\7n\2\2hi\7v\2\2ij\7"+
		"g\2\2jk\7t\2\2k\32\3\2\2\2lm\7t\2\2mn\7g\2\2no\7f\2\2op\7w\2\2pq\7e\2"+
		"\2qr\7g\2\2r\34\3\2\2\2st\7m\2\2tu\7g\2\2uv\7{\2\2vw\7u\2\2w\36\3\2\2"+
		"\2xy\7u\2\2yz\7g\2\2z{\7v\2\2{ \3\2\2\2|}\7i\2\2}~\7g\2\2~\177\7v\2\2"+
		"\177\"\3\2\2\2\u0080\u0081\7}\2\2\u0081$\3\2\2\2\u0082\u0083\7\177\2\2"+
		"\u0083&\3\2\2\2\u0084\u0085\7]\2\2\u0085(\3\2\2\2\u0086\u0087\7_\2\2\u0087"+
		"*\3\2\2\2\u0088\u0089\7/\2\2\u0089\u008a\7@\2\2\u008a,\3\2\2\2\u008b\u009b"+
		"\4>@\2\u008c\u008d\7>\2\2\u008d\u009b\7?\2\2\u008e\u008f\7@\2\2\u008f"+
		"\u009b\7?\2\2\u0090\u0091\7#\2\2\u0091\u009b\7?\2\2\u0092\u0093\7p\2\2"+
		"\u0093\u0094\7q\2\2\u0094\u009b\7v\2\2\u0095\u0096\7c\2\2\u0096\u0097"+
		"\7p\2\2\u0097\u009b\7f\2\2\u0098\u0099\7q\2\2\u0099\u009b\7t\2\2\u009a"+
		"\u008b\3\2\2\2\u009a\u008c\3\2\2\2\u009a\u008e\3\2\2\2\u009a\u0090\3\2"+
		"\2\2\u009a\u0092\3\2\2\2\u009a\u0095\3\2\2\2\u009a\u0098\3\2\2\2\u009b"+
		".\3\2\2\2\u009c\u009e\4\62;\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2"+
		"\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a5\3\2\2\2\u00a1\u00a2"+
		"\t\2\2\2\u00a2\u00a4\5/\30\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\60\3\2\2\2\u00a7\u00a5\3\2\2"+
		"\2\u00a8\u00aa\4\62;\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\u00b0\7\60\2\2\u00af\u00b1\4\62;\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3"+
		"\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00bc\3\2\2\2\u00b4"+
		"\u00b6\t\2\2\2\u00b5\u00b7\4\62;\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba"+
		"\u00b4\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\62\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c5\7$\2\2\u00c0\u00c4"+
		"\n\3\2\2\u00c1\u00c2\7^\2\2\u00c2\u00c4\7$\2\2\u00c3\u00c0\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7$\2\2\u00c9"+
		"\64\3\2\2\2\u00ca\u00cb\t\4\2\2\u00cb\66\3\2\2\2\u00cc\u00ce\t\5\2\2\u00cd"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d4\3\2\2\2\u00d1\u00d3\7A\2\2\u00d2\u00d1\3\2\2\2\u00d3"+
		"\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d58\3\2\2\2"+
		"\u00d6\u00d4\3\2\2\2\u00d7\u00d8\t\6\2\2\u00d8:\3\2\2\2\u00d9\u00db\t"+
		"\7\2\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\b\36\2\2\u00df<\3\2\2\2"+
		"\17\2\u009a\u009f\u00a5\u00ab\u00b2\u00b8\u00bc\u00c3\u00c5\u00cf\u00d4"+
		"\u00dc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}