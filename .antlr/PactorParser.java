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
		T__9=10, T__10=11, T__11=12, EXPRESSIONS=13, NUMBER=14, FLOAT=15, STRING=16, 
		BOOLEAN=17, WORD=18, MATH_WORDS=19, WS=20, PACKAGES=21;
	public static final int
		RULE_program = 0, RULE_using = 1, RULE_create_words = 2, RULE_commands = 3, 
		RULE_quote = 4, RULE_statement = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "using", "create_words", "commands", "quote", "statement"
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
			"MATH_WORDS", "WS", "PACKAGES"
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
		public List<UsingContext> using() {
			return getRuleContexts(UsingContext.class);
		}
		public UsingContext using(int i) {
			return getRuleContext(UsingContext.class,i);
		}
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
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(12);
				using();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__6) {
				{
				{
				setState(18);
				create_words();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << EXPRESSIONS) | (1L << NUMBER) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN) | (1L << WORD) | (1L << MATH_WORDS))) != 0)) {
				{
				setState(27);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(24);
					statement();
					}
					break;
				case 2:
					{
					setState(25);
					commands();
					}
					break;
				case 3:
					{
					setState(26);
					quote();
					}
					break;
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
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

	public static class UsingContext extends ParserRuleContext {
		public List<TerminalNode> PACKAGES() { return getTokens(PactorParser.PACKAGES); }
		public TerminalNode PACKAGES(int i) {
			return getToken(PactorParser.PACKAGES, i);
		}
		public UsingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using; }
	}

	public final UsingContext using() throws RecognitionException {
		UsingContext _localctx = new UsingContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_using);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__0);
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35);
				match(PACKAGES);
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PACKAGES );
			setState(40);
			match(T__1);
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
	public static class CreateVariableWordContext extends Create_wordsContext {
		public Token name;
		public Token WORD;
		public List<Token> params_in = new ArrayList<Token>();
		public List<Token> params_out = new ArrayList<Token>();
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
		public CreateVariableWordContext(Create_wordsContext ctx) { copyFrom(ctx); }
	}
	public static class CreateWordContext extends Create_wordsContext {
		public Token name;
		public Token WORD;
		public List<Token> params_in = new ArrayList<Token>();
		public List<Token> params_out = new ArrayList<Token>();
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
		public CreateWordContext(Create_wordsContext ctx) { copyFrom(ctx); }
	}

	public final Create_wordsContext create_words() throws RecognitionException {
		Create_wordsContext _localctx = new Create_wordsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_create_words);
		int _la;
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new CreateWordContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(T__2);
				setState(43);
				((CreateWordContext)_localctx).name = match(WORD);
				setState(44);
				match(T__3);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD) {
					{
					{
					setState(45);
					((CreateWordContext)_localctx).WORD = match(WORD);
					((CreateWordContext)_localctx).params_in.add(((CreateWordContext)_localctx).WORD);
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(51);
				match(T__4);
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD) {
					{
					{
					setState(52);
					((CreateWordContext)_localctx).WORD = match(WORD);
					((CreateWordContext)_localctx).params_out.add(((CreateWordContext)_localctx).WORD);
					}
					}
					setState(57);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(58);
				match(T__5);
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << EXPRESSIONS) | (1L << NUMBER) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN) | (1L << WORD) | (1L << MATH_WORDS))) != 0)) {
					{
					setState(62);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(59);
						statement();
						}
						break;
					case 2:
						{
						setState(60);
						commands();
						}
						break;
					case 3:
						{
						setState(61);
						quote();
						}
						break;
					}
					}
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(67);
				match(T__1);
				}
				break;
			case T__6:
				_localctx = new CreateVariableWordContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(T__6);
				setState(69);
				((CreateVariableWordContext)_localctx).name = match(WORD);
				setState(70);
				match(T__3);
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD) {
					{
					{
					setState(71);
					((CreateVariableWordContext)_localctx).WORD = match(WORD);
					((CreateVariableWordContext)_localctx).params_in.add(((CreateVariableWordContext)_localctx).WORD);
					}
					}
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(77);
				match(T__4);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD) {
					{
					{
					setState(78);
					((CreateVariableWordContext)_localctx).WORD = match(WORD);
					((CreateVariableWordContext)_localctx).params_out.add(((CreateVariableWordContext)_localctx).WORD);
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(84);
				match(T__5);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << EXPRESSIONS) | (1L << NUMBER) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN) | (1L << WORD) | (1L << MATH_WORDS))) != 0)) {
					{
					setState(88);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(85);
						statement();
						}
						break;
					case 2:
						{
						setState(86);
						commands();
						}
						break;
					case 3:
						{
						setState(87);
						quote();
						}
						break;
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(93);
				match(T__1);
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
		enterRule(_localctx, 6, RULE_commands);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new CreateIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				quote();
				setState(97);
				quote();
				setState(98);
				match(T__7);
				}
				break;
			case 2:
				_localctx = new CreateWhenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				quote();
				setState(101);
				match(T__8);
				}
				break;
			case 3:
				_localctx = new CreateTimesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				quote();
				setState(104);
				match(T__9);
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
		public List<QuoteContext> quote() {
			return getRuleContexts(QuoteContext.class);
		}
		public QuoteContext quote(int i) {
			return getRuleContext(QuoteContext.class,i);
		}
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
		enterRule(_localctx, 8, RULE_quote);
		int _la;
		try {
			_localctx = new CreateQuoteContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__10);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << EXPRESSIONS) | (1L << NUMBER) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN) | (1L << WORD) | (1L << MATH_WORDS))) != 0)) {
				{
				setState(111);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
					{
					setState(109);
					quote();
					}
					break;
				case EXPRESSIONS:
				case NUMBER:
				case FLOAT:
				case STRING:
				case BOOLEAN:
				case WORD:
				case MATH_WORDS:
					{
					setState(110);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			match(T__11);
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
	public static class PushExpressionToStackContext extends StatementContext {
		public Token value;
		public TerminalNode EXPRESSIONS() { return getToken(PactorParser.EXPRESSIONS, 0); }
		public PushExpressionToStackContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class CommandRunContext extends StatementContext {
		public Token value;
		public TerminalNode WORD() { return getToken(PactorParser.WORD, 0); }
		public TerminalNode MATH_WORDS() { return getToken(PactorParser.MATH_WORDS, 0); }
		public CommandRunContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		int _la;
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new PushNumberToStackContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				((PushNumberToStackContext)_localctx).value = match(NUMBER);
				}
				break;
			case FLOAT:
				_localctx = new PushFloatToStackContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				((PushFloatToStackContext)_localctx).value = match(FLOAT);
				}
				break;
			case STRING:
				_localctx = new PushStringToStackContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				((PushStringToStackContext)_localctx).value = match(STRING);
				}
				break;
			case EXPRESSIONS:
				_localctx = new PushExpressionToStackContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				((PushExpressionToStackContext)_localctx).value = match(EXPRESSIONS);
				}
				break;
			case BOOLEAN:
				_localctx = new PushBooleanToStackContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(122);
				((PushBooleanToStackContext)_localctx).value = match(BOOLEAN);
				}
				break;
			case WORD:
			case MATH_WORDS:
				_localctx = new CommandRunContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(123);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u0081\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\20\n\2\f\2\16\2\23\13"+
		"\2\3\2\7\2\26\n\2\f\2\16\2\31\13\2\3\2\3\2\3\2\7\2\36\n\2\f\2\16\2!\13"+
		"\2\3\2\3\2\3\3\3\3\6\3\'\n\3\r\3\16\3(\3\3\3\3\3\4\3\4\3\4\3\4\7\4\61"+
		"\n\4\f\4\16\4\64\13\4\3\4\3\4\7\48\n\4\f\4\16\4;\13\4\3\4\3\4\3\4\3\4"+
		"\7\4A\n\4\f\4\16\4D\13\4\3\4\3\4\3\4\3\4\3\4\7\4K\n\4\f\4\16\4N\13\4\3"+
		"\4\3\4\7\4R\n\4\f\4\16\4U\13\4\3\4\3\4\3\4\3\4\7\4[\n\4\f\4\16\4^\13\4"+
		"\3\4\5\4a\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5m\n\5\3\6\3\6"+
		"\3\6\7\6r\n\6\f\6\16\6u\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\177\n"+
		"\7\3\7\2\2\b\2\4\6\b\n\f\2\3\3\2\24\25\2\u0094\2\21\3\2\2\2\4$\3\2\2\2"+
		"\6`\3\2\2\2\bl\3\2\2\2\nn\3\2\2\2\f~\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2"+
		"\2\20\23\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\27\3\2\2\2\23\21\3\2\2"+
		"\2\24\26\5\6\4\2\25\24\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2"+
		"\2\30\37\3\2\2\2\31\27\3\2\2\2\32\36\5\f\7\2\33\36\5\b\5\2\34\36\5\n\6"+
		"\2\35\32\3\2\2\2\35\33\3\2\2\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2"+
		"\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\7\2\2\3#\3\3\2\2\2$&\7\3\2\2%\'"+
		"\7\27\2\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)*\3\2\2\2*+\7\4\2\2"+
		"+\5\3\2\2\2,-\7\5\2\2-.\7\24\2\2.\62\7\6\2\2/\61\7\24\2\2\60/\3\2\2\2"+
		"\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2"+
		"\659\7\7\2\2\668\7\24\2\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2"+
		"\2:<\3\2\2\2;9\3\2\2\2<B\7\b\2\2=A\5\f\7\2>A\5\b\5\2?A\5\n\6\2@=\3\2\2"+
		"\2@>\3\2\2\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2"+
		"\2Ea\7\4\2\2FG\7\t\2\2GH\7\24\2\2HL\7\6\2\2IK\7\24\2\2JI\3\2\2\2KN\3\2"+
		"\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OS\7\7\2\2PR\7\24\2\2QP\3"+
		"\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2V\\\7\b\2\2W["+
		"\5\f\7\2X[\5\b\5\2Y[\5\n\6\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[^\3\2\2\2\\"+
		"Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_a\7\4\2\2`,\3\2\2\2`F\3\2\2"+
		"\2a\7\3\2\2\2bc\5\n\6\2cd\5\n\6\2de\7\n\2\2em\3\2\2\2fg\5\n\6\2gh\7\13"+
		"\2\2hm\3\2\2\2ij\5\n\6\2jk\7\f\2\2km\3\2\2\2lb\3\2\2\2lf\3\2\2\2li\3\2"+
		"\2\2m\t\3\2\2\2ns\7\r\2\2or\5\n\6\2pr\5\f\7\2qo\3\2\2\2qp\3\2\2\2ru\3"+
		"\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7\16\2\2w\13\3\2\2\2"+
		"x\177\7\20\2\2y\177\7\21\2\2z\177\7\22\2\2{\177\7\17\2\2|\177\7\23\2\2"+
		"}\177\t\2\2\2~x\3\2\2\2~y\3\2\2\2~z\3\2\2\2~{\3\2\2\2~|\3\2\2\2~}\3\2"+
		"\2\2\177\r\3\2\2\2\24\21\27\35\37(\629@BLSZ\\`lqs~";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}