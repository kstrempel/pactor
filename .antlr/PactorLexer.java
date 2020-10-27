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
		T__9=10, NUMBER=11, FLOAT=12, STRING=13, BOOLEAN=14, WORD=15, MATH_WORDS=16, 
		WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "NUMBER", "FLOAT", "STRING", "BOOLEAN", "WORD", "MATH_WORDS", 
			"WS"
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
			null, null, null, null, null, null, null, null, null, null, null, "NUMBER", 
			"FLOAT", "STRING", "BOOLEAN", "WORD", "MATH_WORDS", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u0080\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\6\fD\n\f\r"+
		"\f\16\fE\3\f\3\f\7\fJ\n\f\f\f\16\fM\13\f\3\r\7\rP\n\r\f\r\16\rS\13\r\3"+
		"\r\3\r\6\rW\n\r\r\r\16\rX\3\r\3\r\6\r]\n\r\r\r\16\r^\7\ra\n\r\f\r\16\r"+
		"d\13\r\3\16\3\16\3\16\3\16\7\16j\n\16\f\16\16\16m\13\16\3\16\3\16\3\17"+
		"\3\17\3\20\6\20t\n\20\r\20\16\20u\3\21\3\21\3\22\6\22{\n\22\r\22\16\22"+
		"|\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23\3\2\b\4\2GGgg\3\2$$\4\2hhvv\4\2\62;c"+
		"|\5\2,-//\61\61\6\2\13\f\17\17\"\"..\2\u0089\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5\'\3\2\2"+
		"\2\7*\3\2\2\2\t,\3\2\2\2\13.\3\2\2\2\r\60\3\2\2\2\17\63\3\2\2\2\218\3"+
		"\2\2\2\23>\3\2\2\2\25@\3\2\2\2\27C\3\2\2\2\31Q\3\2\2\2\33e\3\2\2\2\35"+
		"p\3\2\2\2\37s\3\2\2\2!w\3\2\2\2#z\3\2\2\2%&\7*\2\2&\4\3\2\2\2\'(\7/\2"+
		"\2()\7/\2\2)\6\3\2\2\2*+\7+\2\2+\b\3\2\2\2,-\7<\2\2-\n\3\2\2\2./\7=\2"+
		"\2/\f\3\2\2\2\60\61\7k\2\2\61\62\7h\2\2\62\16\3\2\2\2\63\64\7y\2\2\64"+
		"\65\7j\2\2\65\66\7g\2\2\66\67\7p\2\2\67\20\3\2\2\289\7v\2\29:\7k\2\2:"+
		";\7o\2\2;<\7g\2\2<=\7u\2\2=\22\3\2\2\2>?\7]\2\2?\24\3\2\2\2@A\7_\2\2A"+
		"\26\3\2\2\2BD\4\62;\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FK\3\2\2"+
		"\2GH\t\2\2\2HJ\5\27\f\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\30\3"+
		"\2\2\2MK\3\2\2\2NP\4\62;\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3"+
		"\2\2\2SQ\3\2\2\2TV\7\60\2\2UW\4\62;\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY"+
		"\3\2\2\2Yb\3\2\2\2Z\\\t\2\2\2[]\4\62;\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2"+
		"\2^_\3\2\2\2_a\3\2\2\2`Z\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\32\3\2"+
		"\2\2db\3\2\2\2ek\7$\2\2fj\n\3\2\2gh\7^\2\2hj\7$\2\2if\3\2\2\2ig\3\2\2"+
		"\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7$\2\2o\34\3\2"+
		"\2\2pq\t\4\2\2q\36\3\2\2\2rt\t\5\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3"+
		"\2\2\2v \3\2\2\2wx\t\6\2\2x\"\3\2\2\2y{\t\7\2\2zy\3\2\2\2{|\3\2\2\2|z"+
		"\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\b\22\2\2\177$\3\2\2\2\r\2EKQX^biku|"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}