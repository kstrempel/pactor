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
		T__9=10, EXPRESSIONS=11, NUMBER=12, FLOAT=13, STRING=14, BOOLEAN=15, WORD=16, 
		MATH_WORDS=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "EXPRESSIONS", "NUMBER", "FLOAT", "STRING", "BOOLEAN", "WORD", 
			"MATH_WORDS", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "'--'", "')'", "':'", "';'", "'if'", "'when'", "'times'", 
			"'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "EXPRESSIONS", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u0093\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fT\n\f\3\r\6"+
		"\rW\n\r\r\r\16\rX\3\r\3\r\7\r]\n\r\f\r\16\r`\13\r\3\16\7\16c\n\16\f\16"+
		"\16\16f\13\16\3\16\3\16\6\16j\n\16\r\16\16\16k\3\16\3\16\6\16p\n\16\r"+
		"\16\16\16q\7\16t\n\16\f\16\16\16w\13\16\3\17\3\17\3\17\3\17\7\17}\n\17"+
		"\f\17\16\17\u0080\13\17\3\17\3\17\3\20\3\20\3\21\6\21\u0087\n\21\r\21"+
		"\16\21\u0088\3\22\3\22\3\23\6\23\u008e\n\23\r\23\16\23\u008f\3\23\3\23"+
		"\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\3\2\b\4\2GGgg\3\2$$\4\2hhvv\4\2\62;c|\5\2,-/"+
		"/\61\61\6\2\13\f\17\17\"\"..\2\u00a2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5)\3\2"+
		"\2\2\7,\3\2\2\2\t.\3\2\2\2\13\60\3\2\2\2\r\62\3\2\2\2\17\65\3\2\2\2\21"+
		":\3\2\2\2\23@\3\2\2\2\25B\3\2\2\2\27S\3\2\2\2\31V\3\2\2\2\33d\3\2\2\2"+
		"\35x\3\2\2\2\37\u0083\3\2\2\2!\u0086\3\2\2\2#\u008a\3\2\2\2%\u008d\3\2"+
		"\2\2\'(\7*\2\2(\4\3\2\2\2)*\7/\2\2*+\7/\2\2+\6\3\2\2\2,-\7+\2\2-\b\3\2"+
		"\2\2./\7<\2\2/\n\3\2\2\2\60\61\7=\2\2\61\f\3\2\2\2\62\63\7k\2\2\63\64"+
		"\7h\2\2\64\16\3\2\2\2\65\66\7y\2\2\66\67\7j\2\2\678\7g\2\289\7p\2\29\20"+
		"\3\2\2\2:;\7v\2\2;<\7k\2\2<=\7o\2\2=>\7g\2\2>?\7u\2\2?\22\3\2\2\2@A\7"+
		"]\2\2A\24\3\2\2\2BC\7_\2\2C\26\3\2\2\2DT\4>@\2EF\7>\2\2FT\7?\2\2GH\7@"+
		"\2\2HT\7?\2\2IJ\7#\2\2JT\7?\2\2KL\7p\2\2LM\7q\2\2MT\7v\2\2NO\7c\2\2OP"+
		"\7p\2\2PT\7f\2\2QR\7q\2\2RT\7t\2\2SD\3\2\2\2SE\3\2\2\2SG\3\2\2\2SI\3\2"+
		"\2\2SK\3\2\2\2SN\3\2\2\2SQ\3\2\2\2T\30\3\2\2\2UW\4\62;\2VU\3\2\2\2WX\3"+
		"\2\2\2XV\3\2\2\2XY\3\2\2\2Y^\3\2\2\2Z[\t\2\2\2[]\5\31\r\2\\Z\3\2\2\2]"+
		"`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\32\3\2\2\2`^\3\2\2\2ac\4\62;\2ba\3\2\2"+
		"\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gi\7\60\2\2hj\4\62"+
		";\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lu\3\2\2\2mo\t\2\2\2np\4\62"+
		";\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sm\3\2\2\2tw\3\2"+
		"\2\2us\3\2\2\2uv\3\2\2\2v\34\3\2\2\2wu\3\2\2\2x~\7$\2\2y}\n\3\2\2z{\7"+
		"^\2\2{}\7$\2\2|y\3\2\2\2|z\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2"+
		"\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7$\2\2\u0082\36\3\2\2"+
		"\2\u0083\u0084\t\4\2\2\u0084 \3\2\2\2\u0085\u0087\t\5\2\2\u0086\u0085"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\"\3\2\2\2\u008a\u008b\t\6\2\2\u008b$\3\2\2\2\u008c\u008e\t\7\2\2\u008d"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\u0092\b\23\2\2\u0092&\3\2\2\2\16\2SX^d"+
		"kqu|~\u0088\u008f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}