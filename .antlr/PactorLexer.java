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
		T__9=10, T__10=11, T__11=12, T__12=13, EXPRESSIONS=14, NUMBER=15, FLOAT=16, 
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
			"T__9", "T__10", "T__11", "T__12", "EXPRESSIONS", "NUMBER", "FLOAT", 
			"STRING", "BOOLEAN", "WORD", "MATH_WORDS", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'USING:'", "';'", "':'", "'('", "'--'", "')'", "'::'", "'if'", 
			"'when'", "'times'", "'['", "']'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "EXPRESSIONS", "NUMBER", "FLOAT", "STRING", "BOOLEAN", "WORD", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u00ac\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17g\n\17\3\20\6\20j\n\20\r\20\16\20k\3\20\3\20\7"+
		"\20p\n\20\f\20\16\20s\13\20\3\21\7\21v\n\21\f\21\16\21y\13\21\3\21\3\21"+
		"\6\21}\n\21\r\21\16\21~\3\21\3\21\6\21\u0083\n\21\r\21\16\21\u0084\7\21"+
		"\u0087\n\21\f\21\16\21\u008a\13\21\3\22\3\22\3\22\3\22\7\22\u0090\n\22"+
		"\f\22\16\22\u0093\13\22\3\22\3\22\3\23\3\23\3\24\6\24\u009a\n\24\r\24"+
		"\16\24\u009b\3\24\7\24\u009f\n\24\f\24\16\24\u00a2\13\24\3\25\3\25\3\26"+
		"\6\26\u00a7\n\26\r\26\16\26\u00a8\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27\3\2\b\4\2GGgg\3\2$$\4\2hhvv\5\2\62;aac|\5\2,-//\61\61\6\2"+
		"\13\f\17\17\"\"..\2\u00bc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\3-\3\2\2\2\5\64\3\2\2\2\7\66\3\2\2\2\t8\3\2\2\2\13:\3\2\2\2\r=\3"+
		"\2\2\2\17?\3\2\2\2\21B\3\2\2\2\23E\3\2\2\2\25J\3\2\2\2\27P\3\2\2\2\31"+
		"R\3\2\2\2\33T\3\2\2\2\35f\3\2\2\2\37i\3\2\2\2!w\3\2\2\2#\u008b\3\2\2\2"+
		"%\u0096\3\2\2\2\'\u0099\3\2\2\2)\u00a3\3\2\2\2+\u00a6\3\2\2\2-.\7W\2\2"+
		"./\7U\2\2/\60\7K\2\2\60\61\7P\2\2\61\62\7I\2\2\62\63\7<\2\2\63\4\3\2\2"+
		"\2\64\65\7=\2\2\65\6\3\2\2\2\66\67\7<\2\2\67\b\3\2\2\289\7*\2\29\n\3\2"+
		"\2\2:;\7/\2\2;<\7/\2\2<\f\3\2\2\2=>\7+\2\2>\16\3\2\2\2?@\7<\2\2@A\7<\2"+
		"\2A\20\3\2\2\2BC\7k\2\2CD\7h\2\2D\22\3\2\2\2EF\7y\2\2FG\7j\2\2GH\7g\2"+
		"\2HI\7p\2\2I\24\3\2\2\2JK\7v\2\2KL\7k\2\2LM\7o\2\2MN\7g\2\2NO\7u\2\2O"+
		"\26\3\2\2\2PQ\7]\2\2Q\30\3\2\2\2RS\7_\2\2S\32\3\2\2\2TU\7/\2\2UV\7@\2"+
		"\2V\34\3\2\2\2Wg\4>@\2XY\7>\2\2Yg\7?\2\2Z[\7@\2\2[g\7?\2\2\\]\7#\2\2]"+
		"g\7?\2\2^_\7p\2\2_`\7q\2\2`g\7v\2\2ab\7c\2\2bc\7p\2\2cg\7f\2\2de\7q\2"+
		"\2eg\7t\2\2fW\3\2\2\2fX\3\2\2\2fZ\3\2\2\2f\\\3\2\2\2f^\3\2\2\2fa\3\2\2"+
		"\2fd\3\2\2\2g\36\3\2\2\2hj\4\62;\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2"+
		"\2\2lq\3\2\2\2mn\t\2\2\2np\5\37\20\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3"+
		"\2\2\2r \3\2\2\2sq\3\2\2\2tv\4\62;\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3"+
		"\2\2\2xz\3\2\2\2yw\3\2\2\2z|\7\60\2\2{}\4\62;\2|{\3\2\2\2}~\3\2\2\2~|"+
		"\3\2\2\2~\177\3\2\2\2\177\u0088\3\2\2\2\u0080\u0082\t\2\2\2\u0081\u0083"+
		"\4\62;\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0080\3\2\2\2\u0087\u008a\3\2"+
		"\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\"\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008b\u0091\7$\2\2\u008c\u0090\n\3\2\2\u008d\u008e\7^\2\2\u008e"+
		"\u0090\7$\2\2\u008f\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0093\3\2"+
		"\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0094\u0095\7$\2\2\u0095$\3\2\2\2\u0096\u0097\t\4\2\2\u0097"+
		"&\3\2\2\2\u0098\u009a\t\5\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2"+
		"\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00a0\3\2\2\2\u009d\u009f"+
		"\7A\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1(\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\t\6\2\2"+
		"\u00a4*\3\2\2\2\u00a5\u00a7\t\7\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3"+
		"\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\b\26\2\2\u00ab,\3\2\2\2\17\2fkqw~\u0084\u0088\u008f\u0091\u009b"+
		"\u00a0\u00a8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}