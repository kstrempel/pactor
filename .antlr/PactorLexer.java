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
		T__9=10, T__10=11, T__11=12, EXPRESSIONS=13, NUMBER=14, FLOAT=15, STRING=16, 
		BOOLEAN=17, WORD=18, MATH_WORDS=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "EXPRESSIONS", "NUMBER", "FLOAT", "STRING", 
			"BOOLEAN", "WORD", "MATH_WORDS", "WS"
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
			null, "EXPRESSIONS", "NUMBER", "FLOAT", "STRING", "BOOLEAN", "WORD", 
			"MATH_WORDS", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u00a6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16[\n\16\3\17\6\17^\n\17\r\17\16\17_"+
		"\3\17\3\17\7\17d\n\17\f\17\16\17g\13\17\3\20\7\20j\n\20\f\20\16\20m\13"+
		"\20\3\20\3\20\6\20q\n\20\r\20\16\20r\3\20\3\20\6\20w\n\20\r\20\16\20x"+
		"\7\20{\n\20\f\20\16\20~\13\20\3\21\3\21\3\21\3\21\7\21\u0084\n\21\f\21"+
		"\16\21\u0087\13\21\3\21\3\21\3\22\3\22\3\23\6\23\u008e\n\23\r\23\16\23"+
		"\u008f\3\23\7\23\u0093\n\23\f\23\16\23\u0096\13\23\3\23\7\23\u0099\n\23"+
		"\f\23\16\23\u009c\13\23\3\24\3\24\3\25\6\25\u00a1\n\25\r\25\16\25\u00a2"+
		"\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\t\4\2GGgg\3\2$$\4\2hhv"+
		"v\5\2\62;aac|\6\2\62;@@aac|\5\2,-//\61\61\6\2\13\f\17\17\"\"..\2\u00b7"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5\62\3\2\2\2\7\64\3"+
		"\2\2\2\t\66\3\2\2\2\138\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2\21@\3\2\2\2\23"+
		"B\3\2\2\2\25D\3\2\2\2\27F\3\2\2\2\31H\3\2\2\2\33Z\3\2\2\2\35]\3\2\2\2"+
		"\37k\3\2\2\2!\177\3\2\2\2#\u008a\3\2\2\2%\u008d\3\2\2\2\'\u009d\3\2\2"+
		"\2)\u00a0\3\2\2\2+,\7W\2\2,-\7U\2\2-.\7K\2\2./\7P\2\2/\60\7I\2\2\60\61"+
		"\7<\2\2\61\4\3\2\2\2\62\63\7=\2\2\63\6\3\2\2\2\64\65\7<\2\2\65\b\3\2\2"+
		"\2\66\67\7*\2\2\67\n\3\2\2\289\7/\2\29:\7/\2\2:\f\3\2\2\2;<\7+\2\2<\16"+
		"\3\2\2\2=>\7<\2\2>?\7<\2\2?\20\3\2\2\2@A\7}\2\2A\22\3\2\2\2BC\7\177\2"+
		"\2C\24\3\2\2\2DE\7]\2\2E\26\3\2\2\2FG\7_\2\2G\30\3\2\2\2HI\7/\2\2IJ\7"+
		"@\2\2J\32\3\2\2\2K[\4>@\2LM\7>\2\2M[\7?\2\2NO\7@\2\2O[\7?\2\2PQ\7#\2\2"+
		"Q[\7?\2\2RS\7p\2\2ST\7q\2\2T[\7v\2\2UV\7c\2\2VW\7p\2\2W[\7f\2\2XY\7q\2"+
		"\2Y[\7t\2\2ZK\3\2\2\2ZL\3\2\2\2ZN\3\2\2\2ZP\3\2\2\2ZR\3\2\2\2ZU\3\2\2"+
		"\2ZX\3\2\2\2[\34\3\2\2\2\\^\4\62;\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3"+
		"\2\2\2`e\3\2\2\2ab\t\2\2\2bd\5\35\17\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2e"+
		"f\3\2\2\2f\36\3\2\2\2ge\3\2\2\2hj\4\62;\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2"+
		"\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2np\7\60\2\2oq\4\62;\2po\3\2\2\2qr\3\2"+
		"\2\2rp\3\2\2\2rs\3\2\2\2s|\3\2\2\2tv\t\2\2\2uw\4\62;\2vu\3\2\2\2wx\3\2"+
		"\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zt\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2"+
		"\2\2} \3\2\2\2~|\3\2\2\2\177\u0085\7$\2\2\u0080\u0084\n\3\2\2\u0081\u0082"+
		"\7^\2\2\u0082\u0084\7$\2\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7$\2\2\u0089\"\3\2\2\2\u008a\u008b"+
		"\t\4\2\2\u008b$\3\2\2\2\u008c\u008e\t\5\2\2\u008d\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0094\3\2"+
		"\2\2\u0091\u0093\t\6\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u009a\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0097\u0099\7A\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b&\3\2\2\2\u009c\u009a\3\2\2\2"+
		"\u009d\u009e\t\7\2\2\u009e(\3\2\2\2\u009f\u00a1\t\b\2\2\u00a0\u009f\3"+
		"\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a5\b\25\2\2\u00a5*\3\2\2\2\20\2Z_ekrx|\u0083\u0085"+
		"\u008f\u0094\u009a\u00a2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}