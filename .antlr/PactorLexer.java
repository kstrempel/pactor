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
		NUMBER=1, FLOAT=2, STRING=3, WORD=4, WS=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUMBER", "FLOAT", "STRING", "WORD", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER", "FLOAT", "STRING", "WORD", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\7J\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\17\n\2\r\2\16\2\20\3\2\3\2\7\2"+
		"\25\n\2\f\2\16\2\30\13\2\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\3\3\3\6\3\""+
		"\n\3\r\3\16\3#\3\3\3\3\6\3(\n\3\r\3\16\3)\7\3,\n\3\f\3\16\3/\13\3\3\4"+
		"\3\4\3\4\3\4\7\4\65\n\4\f\4\16\48\13\4\3\4\3\4\3\5\6\5=\n\5\r\5\16\5>"+
		"\3\5\5\5B\n\5\3\6\6\6E\n\6\r\6\16\6F\3\6\3\6\2\2\7\3\3\5\4\7\5\t\6\13"+
		"\7\3\2\7\4\2GGgg\3\2$$\3\2c|\5\2,-//\61\61\6\2\13\f\17\17\"\"..\2T\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\3\16\3\2\2\2"+
		"\5\34\3\2\2\2\7\60\3\2\2\2\tA\3\2\2\2\13D\3\2\2\2\r\17\4\62;\2\16\r\3"+
		"\2\2\2\17\20\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\26\3\2\2\2\22\23\t"+
		"\2\2\2\23\25\5\3\2\2\24\22\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3"+
		"\2\2\2\27\4\3\2\2\2\30\26\3\2\2\2\31\33\4\62;\2\32\31\3\2\2\2\33\36\3"+
		"\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37!\7\60"+
		"\2\2 \"\4\62;\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$-\3\2\2\2%\'"+
		"\t\2\2\2&(\4\62;\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2"+
		"+%\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\6\3\2\2\2/-\3\2\2\2\60\66\7"+
		"$\2\2\61\65\n\3\2\2\62\63\7^\2\2\63\65\7$\2\2\64\61\3\2\2\2\64\62\3\2"+
		"\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29"+
		":\7$\2\2:\b\3\2\2\2;=\t\4\2\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2"+
		"?B\3\2\2\2@B\t\5\2\2A<\3\2\2\2A@\3\2\2\2B\n\3\2\2\2CE\t\6\2\2DC\3\2\2"+
		"\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\b\6\2\2I\f\3\2\2\2\16\2\20"+
		"\26\34#)-\64\66>AF\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}