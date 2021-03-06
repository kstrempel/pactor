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
		T__9=10, T__10=11, T__11=12, COMMENT=13, EXPRESSIONS=14, NUMBER=15, FLOAT=16, 
		STRING=17, BOOLEAN=18, WORD=19, MATH_WORDS=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "COMMENT", "EXPRESSIONS", "NUMBER", "FLOAT", 
			"STRING", "BOOLEAN", "WORD", "MATH_WORDS", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'USING:'", "';'", "':'", "'('", "'--'", "')'", "'::'", "'{'", 
			"'}'", "'['", "']'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "COMMENT", "EXPRESSIONS", "NUMBER", "FLOAT", "STRING", "BOOLEAN", 
			"WORD", "MATH_WORDS", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u00b5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\6\16O\n\16\r\16\16\16P\3\16"+
		"\7\16T\n\16\f\16\16\16W\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17j\n\17\3\20\6\20m\n"+
		"\20\r\20\16\20n\3\20\3\20\7\20s\n\20\f\20\16\20v\13\20\3\21\7\21y\n\21"+
		"\f\21\16\21|\13\21\3\21\3\21\6\21\u0080\n\21\r\21\16\21\u0081\3\21\3\21"+
		"\6\21\u0086\n\21\r\21\16\21\u0087\7\21\u008a\n\21\f\21\16\21\u008d\13"+
		"\21\3\22\3\22\3\22\3\22\7\22\u0093\n\22\f\22\16\22\u0096\13\22\3\22\3"+
		"\22\3\23\3\23\3\24\6\24\u009d\n\24\r\24\16\24\u009e\3\24\7\24\u00a2\n"+
		"\24\f\24\16\24\u00a5\13\24\3\24\7\24\u00a8\n\24\f\24\16\24\u00ab\13\24"+
		"\3\25\3\25\3\26\6\26\u00b0\n\26\r\26\16\26\u00b1\3\26\3\26\2\2\27\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27\3\2\n\4\2\f\f\17\17\4\2GGgg\3\2$$\4\2hhvv\5"+
		"\2\62;aac|\6\2\62;@@aac|\5\2,-//\61\61\6\2\13\f\17\17\"\"..\2\u00c8\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5\64\3\2\2"+
		"\2\7\66\3\2\2\2\t8\3\2\2\2\13:\3\2\2\2\r=\3\2\2\2\17?\3\2\2\2\21B\3\2"+
		"\2\2\23D\3\2\2\2\25F\3\2\2\2\27H\3\2\2\2\31J\3\2\2\2\33N\3\2\2\2\35i\3"+
		"\2\2\2\37l\3\2\2\2!z\3\2\2\2#\u008e\3\2\2\2%\u0099\3\2\2\2\'\u009c\3\2"+
		"\2\2)\u00ac\3\2\2\2+\u00af\3\2\2\2-.\7W\2\2./\7U\2\2/\60\7K\2\2\60\61"+
		"\7P\2\2\61\62\7I\2\2\62\63\7<\2\2\63\4\3\2\2\2\64\65\7=\2\2\65\6\3\2\2"+
		"\2\66\67\7<\2\2\67\b\3\2\2\289\7*\2\29\n\3\2\2\2:;\7/\2\2;<\7/\2\2<\f"+
		"\3\2\2\2=>\7+\2\2>\16\3\2\2\2?@\7<\2\2@A\7<\2\2A\20\3\2\2\2BC\7}\2\2C"+
		"\22\3\2\2\2DE\7\177\2\2E\24\3\2\2\2FG\7]\2\2G\26\3\2\2\2HI\7_\2\2I\30"+
		"\3\2\2\2JK\7/\2\2KL\7@\2\2L\32\3\2\2\2MO\7%\2\2NM\3\2\2\2OP\3\2\2\2PN"+
		"\3\2\2\2PQ\3\2\2\2QU\3\2\2\2RT\n\2\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2U"+
		"V\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\b\16\2\2Y\34\3\2\2\2Zj\4>@\2[\\\7>\2\2"+
		"\\j\7?\2\2]^\7@\2\2^j\7?\2\2_`\7#\2\2`j\7?\2\2ab\7p\2\2bc\7q\2\2cj\7v"+
		"\2\2de\7c\2\2ef\7p\2\2fj\7f\2\2gh\7q\2\2hj\7t\2\2iZ\3\2\2\2i[\3\2\2\2"+
		"i]\3\2\2\2i_\3\2\2\2ia\3\2\2\2id\3\2\2\2ig\3\2\2\2j\36\3\2\2\2km\4\62"+
		";\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2ot\3\2\2\2pq\t\3\2\2qs\5\37"+
		"\20\2rp\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u \3\2\2\2vt\3\2\2\2wy\4"+
		"\62;\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}\177"+
		"\7\60\2\2~\u0080\4\62;\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3"+
		"\2\2\2\u0081\u0082\3\2\2\2\u0082\u008b\3\2\2\2\u0083\u0085\t\3\2\2\u0084"+
		"\u0086\4\62;\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0083\3\2\2\2\u008a"+
		"\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\"\3\2\2\2"+
		"\u008d\u008b\3\2\2\2\u008e\u0094\7$\2\2\u008f\u0093\n\4\2\2\u0090\u0091"+
		"\7^\2\2\u0091\u0093\7$\2\2\u0092\u008f\3\2\2\2\u0092\u0090\3\2\2\2\u0093"+
		"\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7$\2\2\u0098$\3\2\2\2\u0099\u009a"+
		"\t\5\2\2\u009a&\3\2\2\2\u009b\u009d\t\6\2\2\u009c\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a3\3\2"+
		"\2\2\u00a0\u00a2\t\7\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a9\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a6\u00a8\7A\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa(\3\2\2\2\u00ab\u00a9\3\2\2\2"+
		"\u00ac\u00ad\t\b\2\2\u00ad*\3\2\2\2\u00ae\u00b0\t\t\2\2\u00af\u00ae\3"+
		"\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b4\b\26\2\2\u00b4,\3\2\2\2\22\2PUintz\u0081\u0087"+
		"\u008b\u0092\u0094\u009e\u00a3\u00a9\u00b1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}