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
			"BOOLEAN", "WORD", "PACKAGES", "MATH_WORDS", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u00ab\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16d\n\16\3\17\6\17g\n\17\r\17\16\17h\3\17\3\17\7\17m\n\17\f\17\16"+
		"\17p\13\17\3\20\7\20s\n\20\f\20\16\20v\13\20\3\20\3\20\6\20z\n\20\r\20"+
		"\16\20{\3\20\3\20\6\20\u0080\n\20\r\20\16\20\u0081\7\20\u0084\n\20\f\20"+
		"\16\20\u0087\13\20\3\21\3\21\3\21\3\21\7\21\u008d\n\21\f\21\16\21\u0090"+
		"\13\21\3\21\3\21\3\22\3\22\3\23\6\23\u0097\n\23\r\23\16\23\u0098\3\24"+
		"\3\24\6\24\u009d\n\24\r\24\16\24\u009e\5\24\u00a1\n\24\3\25\3\25\3\26"+
		"\6\26\u00a6\n\26\r\26\16\26\u00a7\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\2)\25+\26\3\2\t\4\2GGgg\3\2$$\4\2hhvv\4\2\62;c|\5\2\60\60\62;c|\5\2,"+
		"-//\61\61\6\2\13\f\17\17\"\"..\2\u00bb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\3-\3\2\2\2\5\64\3\2\2\2\7\66\3\2\2\2\t8\3\2\2\2\13:\3\2\2\2\r=\3"+
		"\2\2\2\17?\3\2\2\2\21B\3\2\2\2\23E\3\2\2\2\25J\3\2\2\2\27P\3\2\2\2\31"+
		"R\3\2\2\2\33c\3\2\2\2\35f\3\2\2\2\37t\3\2\2\2!\u0088\3\2\2\2#\u0093\3"+
		"\2\2\2%\u0096\3\2\2\2\'\u00a0\3\2\2\2)\u00a2\3\2\2\2+\u00a5\3\2\2\2-."+
		"\7W\2\2./\7U\2\2/\60\7K\2\2\60\61\7P\2\2\61\62\7I\2\2\62\63\7<\2\2\63"+
		"\4\3\2\2\2\64\65\7=\2\2\65\6\3\2\2\2\66\67\7<\2\2\67\b\3\2\2\289\7*\2"+
		"\29\n\3\2\2\2:;\7/\2\2;<\7/\2\2<\f\3\2\2\2=>\7+\2\2>\16\3\2\2\2?@\7<\2"+
		"\2@A\7<\2\2A\20\3\2\2\2BC\7k\2\2CD\7h\2\2D\22\3\2\2\2EF\7y\2\2FG\7j\2"+
		"\2GH\7g\2\2HI\7p\2\2I\24\3\2\2\2JK\7v\2\2KL\7k\2\2LM\7o\2\2MN\7g\2\2N"+
		"O\7u\2\2O\26\3\2\2\2PQ\7]\2\2Q\30\3\2\2\2RS\7_\2\2S\32\3\2\2\2Td\4>@\2"+
		"UV\7>\2\2Vd\7?\2\2WX\7@\2\2Xd\7?\2\2YZ\7#\2\2Zd\7?\2\2[\\\7p\2\2\\]\7"+
		"q\2\2]d\7v\2\2^_\7c\2\2_`\7p\2\2`d\7f\2\2ab\7q\2\2bd\7t\2\2cT\3\2\2\2"+
		"cU\3\2\2\2cW\3\2\2\2cY\3\2\2\2c[\3\2\2\2c^\3\2\2\2ca\3\2\2\2d\34\3\2\2"+
		"\2eg\4\62;\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2in\3\2\2\2jk\t\2\2"+
		"\2km\5\35\17\2lj\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\36\3\2\2\2pn\3"+
		"\2\2\2qs\4\62;\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3"+
		"\2\2\2wy\7\60\2\2xz\4\62;\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\u0085"+
		"\3\2\2\2}\177\t\2\2\2~\u0080\4\62;\2\177~\3\2\2\2\u0080\u0081\3\2\2\2"+
		"\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083}\3\2"+
		"\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		" \3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008e\7$\2\2\u0089\u008d\n\3\2\2\u008a"+
		"\u008b\7^\2\2\u008b\u008d\7$\2\2\u008c\u0089\3\2\2\2\u008c\u008a\3\2\2"+
		"\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091"+
		"\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7$\2\2\u0092\"\3\2\2\2\u0093"+
		"\u0094\t\4\2\2\u0094$\3\2\2\2\u0095\u0097\t\5\2\2\u0096\u0095\3\2\2\2"+
		"\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099&\3"+
		"\2\2\2\u009a\u00a1\3\2\2\2\u009b\u009d\t\6\2\2\u009c\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2"+
		"\2\2\u00a0\u009a\3\2\2\2\u00a0\u009c\3\2\2\2\u00a1(\3\2\2\2\u00a2\u00a3"+
		"\t\7\2\2\u00a3*\3\2\2\2\u00a4\u00a6\t\b\2\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00aa\b\26\2\2\u00aa,\3\2\2\2\21\2chnt{\u0081\u0085\u008c\u008e"+
		"\u0098\u009c\u009e\u00a0\u00a7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}