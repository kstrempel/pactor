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
			null, "'USING:'", "';'", "':'", "'('", "'--'", "')'", "'::'", "'if'", 
			"'when'", "'times'", "'['", "']'"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u00a1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16b"+
		"\n\16\3\17\6\17e\n\17\r\17\16\17f\3\17\3\17\7\17k\n\17\f\17\16\17n\13"+
		"\17\3\20\7\20q\n\20\f\20\16\20t\13\20\3\20\3\20\6\20x\n\20\r\20\16\20"+
		"y\3\20\3\20\6\20~\n\20\r\20\16\20\177\7\20\u0082\n\20\f\20\16\20\u0085"+
		"\13\20\3\21\3\21\3\21\3\21\7\21\u008b\n\21\f\21\16\21\u008e\13\21\3\21"+
		"\3\21\3\22\3\22\3\23\6\23\u0095\n\23\r\23\16\23\u0096\3\24\3\24\3\25\6"+
		"\25\u009c\n\25\r\25\16\25\u009d\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26\3\2\b\4\2GGgg\3\2$$\4\2hhvv\5\2\62;aac|\5\2,-//\61\61\6\2\13\f\17"+
		"\17\"\"..\2\u00b0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5\62"+
		"\3\2\2\2\7\64\3\2\2\2\t\66\3\2\2\2\138\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2"+
		"\21@\3\2\2\2\23C\3\2\2\2\25H\3\2\2\2\27N\3\2\2\2\31P\3\2\2\2\33a\3\2\2"+
		"\2\35d\3\2\2\2\37r\3\2\2\2!\u0086\3\2\2\2#\u0091\3\2\2\2%\u0094\3\2\2"+
		"\2\'\u0098\3\2\2\2)\u009b\3\2\2\2+,\7W\2\2,-\7U\2\2-.\7K\2\2./\7P\2\2"+
		"/\60\7I\2\2\60\61\7<\2\2\61\4\3\2\2\2\62\63\7=\2\2\63\6\3\2\2\2\64\65"+
		"\7<\2\2\65\b\3\2\2\2\66\67\7*\2\2\67\n\3\2\2\289\7/\2\29:\7/\2\2:\f\3"+
		"\2\2\2;<\7+\2\2<\16\3\2\2\2=>\7<\2\2>?\7<\2\2?\20\3\2\2\2@A\7k\2\2AB\7"+
		"h\2\2B\22\3\2\2\2CD\7y\2\2DE\7j\2\2EF\7g\2\2FG\7p\2\2G\24\3\2\2\2HI\7"+
		"v\2\2IJ\7k\2\2JK\7o\2\2KL\7g\2\2LM\7u\2\2M\26\3\2\2\2NO\7]\2\2O\30\3\2"+
		"\2\2PQ\7_\2\2Q\32\3\2\2\2Rb\4>@\2ST\7>\2\2Tb\7?\2\2UV\7@\2\2Vb\7?\2\2"+
		"WX\7#\2\2Xb\7?\2\2YZ\7p\2\2Z[\7q\2\2[b\7v\2\2\\]\7c\2\2]^\7p\2\2^b\7f"+
		"\2\2_`\7q\2\2`b\7t\2\2aR\3\2\2\2aS\3\2\2\2aU\3\2\2\2aW\3\2\2\2aY\3\2\2"+
		"\2a\\\3\2\2\2a_\3\2\2\2b\34\3\2\2\2ce\4\62;\2dc\3\2\2\2ef\3\2\2\2fd\3"+
		"\2\2\2fg\3\2\2\2gl\3\2\2\2hi\t\2\2\2ik\5\35\17\2jh\3\2\2\2kn\3\2\2\2l"+
		"j\3\2\2\2lm\3\2\2\2m\36\3\2\2\2nl\3\2\2\2oq\4\62;\2po\3\2\2\2qt\3\2\2"+
		"\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uw\7\60\2\2vx\4\62;\2wv\3\2"+
		"\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\u0083\3\2\2\2{}\t\2\2\2|~\4\62;\2"+
		"}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2"+
		"\2\2\u0081{\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084 \3\2\2\2\u0085\u0083\3\2\2\2\u0086\u008c\7$\2\2\u0087\u008b"+
		"\n\3\2\2\u0088\u0089\7^\2\2\u0089\u008b\7$\2\2\u008a\u0087\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7$\2\2\u0090"+
		"\"\3\2\2\2\u0091\u0092\t\4\2\2\u0092$\3\2\2\2\u0093\u0095\t\5\2\2\u0094"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097&\3\2\2\2\u0098\u0099\t\6\2\2\u0099(\3\2\2\2\u009a\u009c\t\7"+
		"\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\b\25\2\2\u00a0*\3\2\2\2"+
		"\16\2aflry\177\u0083\u008a\u008c\u0096\u009d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}