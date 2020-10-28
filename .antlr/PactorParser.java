// Generated from /home/kai/Projects/pactor/Pactor.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PactorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, NUMBER=11, FLOAT=12, STRING=13, BOOLEAN=14, WORD=15, MATH_WORDS=16, 
		WS=17;
	public static final int
		RULE_program = 0, RULE_create_words = 1, RULE_commands = 2, RULE_quote = 3, 
		RULE_statement = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "create_words", "commands", "quote", "statement"
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

	@Override
	public String getGrammarFileName() { return "Pactor.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PactorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PactorParser.EOF, 0); }
		public List<Create_wordsContext> create_words() {
			return getRuleContexts(Create_wordsContext.class);
		}
		public Create_wordsContext create_words(int i) {
			return getRuleContext(Create_wordsContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public List<QuoteContext> quote() {
			return getRuleContexts(QuoteContext.class);
		}
		public QuoteContext quote(int i) {
			return getRuleContext(QuoteContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(10);
					create_words();
					}
					} 
				}
				setState(15);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << NUMBER) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN) | (1L << WORD) | (1L << MATH_WORDS))) != 0)) {
				{
				setState(19);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(16);
					statement();
					}
					break;
				case 2:
					{
					setState(17);
					commands();
					}
					break;
				case 3:
					{
					setState(18);
					quote();
					}
					break;
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_wordsContext extends ParserRuleContext {
		public Create_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_words; }
	 
		public Create_wordsContext() { }
		public void copyFrom(Create_wordsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateWordContext extends Create_wordsContext {
		public Token name;
		public Token WORD;
		public List<Token> params_in = new ArrayList<Token>();
		public List<Token> params_out = new ArrayList<Token>();
		public StatementContext body;
		public List<TerminalNode> WORD() { return getTokens(PactorParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(PactorParser.WORD, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CreateWordContext(Create_wordsContext ctx) { copyFrom(ctx); }
	}

	public final Create_wordsContext create_words() throws RecognitionException {
		Create_wordsContext _localctx = new Create_wordsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_create_words);
		int _la;
		try {
			_localctx = new CreateWordContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			((CreateWordContext)_localctx).name = match(WORD);
			setState(27);
			match(T__0);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD) {
				{
				{
				setState(28);
				((CreateWordContext)_localctx).WORD = match(WORD);
				((CreateWordContext)_localctx).params_in.add(((CreateWordContext)_localctx).WORD);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			match(T__1);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD) {
				{
				{
				setState(35);
				((CreateWordContext)_localctx).WORD = match(WORD);
				((CreateWordContext)_localctx).params_out.add(((CreateWordContext)_localctx).WORD);
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
			match(T__2);
			setState(42);
			match(T__3);
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				((CreateWordContext)_localctx).body = statement();
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN) | (1L << WORD) | (1L << MATH_WORDS))) != 0) );
			setState(48);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandsContext extends ParserRuleContext {
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
	 
		public CommandsContext() { }
		public void copyFrom(CommandsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateIfContext extends CommandsContext {
		public QuoteContext truepath;
		public QuoteContext falsepath;
		public List<QuoteContext> quote() {
			return getRuleContexts(QuoteContext.class);
		}
		public QuoteContext quote(int i) {
			return getRuleContext(QuoteContext.class,i);
		}
		public CreateIfContext(CommandsContext ctx) { copyFrom(ctx); }
	}
	public static class CreateWhenContext extends CommandsContext {
		public QuoteContext quote() {
			return getRuleContext(QuoteContext.class,0);
		}
		public CreateWhenContext(CommandsContext ctx) { copyFrom(ctx); }
	}
	public static class CreateTimesContext extends CommandsContext {
		public QuoteContext quote() {
			return getRuleContext(QuoteContext.class,0);
		}
		public CreateTimesContext(CommandsContext ctx) { copyFrom(ctx); }
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_commands);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new CreateIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				((CreateIfContext)_localctx).truepath = quote();
				setState(51);
				((CreateIfContext)_localctx).falsepath = quote();
				setState(52);
				match(T__5);
				}
				break;
			case 2:
				_localctx = new CreateWhenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				quote();
				setState(55);
				match(T__6);
				}
				break;
			case 3:
				_localctx = new CreateTimesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				quote();
				setState(58);
				match(T__7);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuoteContext extends ParserRuleContext {
		public QuoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quote; }
	 
		public QuoteContext() { }
		public void copyFrom(QuoteContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateQuoteContext extends QuoteContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CreateQuoteContext(QuoteContext ctx) { copyFrom(ctx); }
	}

	public final QuoteContext quote() throws RecognitionException {
		QuoteContext _localctx = new QuoteContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_quote);
		int _la;
		try {
			_localctx = new CreateQuoteContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__8);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN) | (1L << WORD) | (1L << MATH_WORDS))) != 0)) {
				{
				{
				setState(63);
				statement();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PushFloatToStackContext extends StatementContext {
		public Token value;
		public TerminalNode FLOAT() { return getToken(PactorParser.FLOAT, 0); }
		public PushFloatToStackContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class PushStringToStackContext extends StatementContext {
		public Token value;
		public TerminalNode STRING() { return getToken(PactorParser.STRING, 0); }
		public PushStringToStackContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class PushNumberToStackContext extends StatementContext {
		public Token value;
		public TerminalNode NUMBER() { return getToken(PactorParser.NUMBER, 0); }
		public PushNumberToStackContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class PushBooleanToStackContext extends StatementContext {
		public Token value;
		public TerminalNode BOOLEAN() { return getToken(PactorParser.BOOLEAN, 0); }
		public PushBooleanToStackContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class CommandRunContext extends StatementContext {
		public Token value;
		public TerminalNode WORD() { return getToken(PactorParser.WORD, 0); }
		public TerminalNode MATH_WORDS() { return getToken(PactorParser.MATH_WORDS, 0); }
		public CommandRunContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new PushNumberToStackContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				((PushNumberToStackContext)_localctx).value = match(NUMBER);
				}
				break;
			case FLOAT:
				_localctx = new PushFloatToStackContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				((PushFloatToStackContext)_localctx).value = match(FLOAT);
				}
				break;
			case STRING:
				_localctx = new PushStringToStackContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				((PushStringToStackContext)_localctx).value = match(STRING);
				}
				break;
			case BOOLEAN:
				_localctx = new PushBooleanToStackContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				((PushBooleanToStackContext)_localctx).value = match(BOOLEAN);
				}
				break;
			case WORD:
			case MATH_WORDS:
				_localctx = new CommandRunContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				((CommandRunContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==WORD || _la==MATH_WORDS) ) {
					((CommandRunContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23Q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\2\3\2\3\2"+
		"\7\2\26\n\2\f\2\16\2\31\13\2\3\2\3\2\3\3\3\3\3\3\7\3 \n\3\f\3\16\3#\13"+
		"\3\3\3\3\3\7\3\'\n\3\f\3\16\3*\13\3\3\3\3\3\3\3\6\3/\n\3\r\3\16\3\60\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\5\3\5\7\5C\n"+
		"\5\f\5\16\5F\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6O\n\6\3\6\2\2\7\2\4\6"+
		"\b\n\2\3\3\2\21\22\2Y\2\17\3\2\2\2\4\34\3\2\2\2\6>\3\2\2\2\b@\3\2\2\2"+
		"\nN\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\21\3\2\2\2\17\r\3\2\2\2\17\20"+
		"\3\2\2\2\20\27\3\2\2\2\21\17\3\2\2\2\22\26\5\n\6\2\23\26\5\6\4\2\24\26"+
		"\5\b\5\2\25\22\3\2\2\2\25\23\3\2\2\2\25\24\3\2\2\2\26\31\3\2\2\2\27\25"+
		"\3\2\2\2\27\30\3\2\2\2\30\32\3\2\2\2\31\27\3\2\2\2\32\33\7\2\2\3\33\3"+
		"\3\2\2\2\34\35\7\21\2\2\35!\7\3\2\2\36 \7\21\2\2\37\36\3\2\2\2 #\3\2\2"+
		"\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$(\7\4\2\2%\'\7\21\2\2&"+
		"%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\7\5\2\2"+
		",.\7\6\2\2-/\5\n\6\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61"+
		"\62\3\2\2\2\62\63\7\7\2\2\63\5\3\2\2\2\64\65\5\b\5\2\65\66\5\b\5\2\66"+
		"\67\7\b\2\2\67?\3\2\2\289\5\b\5\29:\7\t\2\2:?\3\2\2\2;<\5\b\5\2<=\7\n"+
		"\2\2=?\3\2\2\2>\64\3\2\2\2>8\3\2\2\2>;\3\2\2\2?\7\3\2\2\2@D\7\13\2\2A"+
		"C\5\n\6\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2"+
		"GH\7\f\2\2H\t\3\2\2\2IO\7\r\2\2JO\7\16\2\2KO\7\17\2\2LO\7\20\2\2MO\t\2"+
		"\2\2NI\3\2\2\2NJ\3\2\2\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\13\3\2\2\2\13"+
		"\17\25\27!(\60>DN";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}