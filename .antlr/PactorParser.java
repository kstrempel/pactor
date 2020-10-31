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
		T__9=10, T__10=11, T__11=12, T__12=13, EXPRESSIONS=14, NUMBER=15, FLOAT=16, 
		STRING=17, BOOLEAN=18, WORD=19, MATH_WORDS=20, WS=21;
	public static final int
		RULE_program = 0, RULE_using = 1, RULE_create_words = 2, RULE_block = 3, 
		RULE_commands = 4, RULE_quote = 5, RULE_block_commands = 6, RULE_statement = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "using", "create_words", "block", "commands", "quote", "block_commands", 
			"statement"
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
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(16);
				using();
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__6) {
				{
				{
				setState(22);
				create_words();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << EXPRESSIONS) | (1L << NUMBER) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN) | (1L << WORD) | (1L << MATH_WORDS))) != 0)) {
				{
				setState(31);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(28);
					statement();
					}
					break;
				case 2:
					{
					setState(29);
					commands();
					}
					break;
				case 3:
					{
					setState(30);
					quote();
					}
					break;
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
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
		public UsingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using; }
	 
		public UsingContext() { }
		public void copyFrom(UsingContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateUsingContext extends UsingContext {
		public Token WORD;
		public List<Token> packages = new ArrayList<Token>();
		public List<TerminalNode> WORD() { return getTokens(PactorParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(PactorParser.WORD, i);
		}
		public CreateUsingContext(UsingContext ctx) { copyFrom(ctx); }
	}

	public final UsingContext using() throws RecognitionException {
		UsingContext _localctx = new UsingContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_using);
		int _la;
		try {
			_localctx = new CreateUsingContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__0);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD) {
				{
				{
				setState(39);
				((CreateUsingContext)_localctx).WORD = match(WORD);
				((CreateUsingContext)_localctx).packages.add(((CreateUsingContext)_localctx).WORD);
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> WORD() { return getTokens(PactorParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(PactorParser.WORD, i);
		}
		public CreateVariableWordContext(Create_wordsContext ctx) { copyFrom(ctx); }
	}
	public static class CreateWordContext extends Create_wordsContext {
		public Token name;
		public Token WORD;
		public List<Token> params_in = new ArrayList<Token>();
		public List<Token> params_out = new ArrayList<Token>();
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> WORD() { return getTokens(PactorParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(PactorParser.WORD, i);
		}
		public CreateWordContext(Create_wordsContext ctx) { copyFrom(ctx); }
	}

	public final Create_wordsContext create_words() throws RecognitionException {
		Create_wordsContext _localctx = new Create_wordsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_create_words);
		int _la;
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new CreateWordContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(T__2);
				setState(48);
				((CreateWordContext)_localctx).name = match(WORD);
				setState(49);
				match(T__3);
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD) {
					{
					{
					setState(50);
					((CreateWordContext)_localctx).WORD = match(WORD);
					((CreateWordContext)_localctx).params_in.add(((CreateWordContext)_localctx).WORD);
					}
					}
					setState(55);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(56);
				match(T__4);
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD) {
					{
					{
					setState(57);
					((CreateWordContext)_localctx).WORD = match(WORD);
					((CreateWordContext)_localctx).params_out.add(((CreateWordContext)_localctx).WORD);
					}
					}
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(63);
				match(T__5);
				setState(64);
				block();
				setState(65);
				match(T__1);
				}
				break;
			case T__6:
				_localctx = new CreateVariableWordContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(T__6);
				setState(68);
				((CreateVariableWordContext)_localctx).name = match(WORD);
				setState(69);
				match(T__3);
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD) {
					{
					{
					setState(70);
					((CreateVariableWordContext)_localctx).WORD = match(WORD);
					((CreateVariableWordContext)_localctx).params_in.add(((CreateVariableWordContext)_localctx).WORD);
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(76);
				match(T__4);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD) {
					{
					{
					setState(77);
					((CreateVariableWordContext)_localctx).WORD = match(WORD);
					((CreateVariableWordContext)_localctx).params_out.add(((CreateVariableWordContext)_localctx).WORD);
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83);
				match(T__5);
				setState(84);
				block();
				setState(85);
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

	public static class BlockContext extends ParserRuleContext {
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
		public List<Block_commandsContext> block_commands() {
			return getRuleContexts(Block_commandsContext.class);
		}
		public Block_commandsContext block_commands(int i) {
			return getRuleContext(Block_commandsContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__12) | (1L << EXPRESSIONS) | (1L << NUMBER) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN) | (1L << WORD) | (1L << MATH_WORDS))) != 0)) {
				{
				setState(93);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(89);
					statement();
					}
					break;
				case 2:
					{
					setState(90);
					commands();
					}
					break;
				case 3:
					{
					setState(91);
					quote();
					}
					break;
				case 4:
					{
					setState(92);
					block_commands();
					}
					break;
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		enterRule(_localctx, 8, RULE_commands);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new CreateIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				quote();
				setState(99);
				quote();
				setState(100);
				match(T__7);
				}
				break;
			case 2:
				_localctx = new CreateWhenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				quote();
				setState(103);
				match(T__8);
				}
				break;
			case 3:
				_localctx = new CreateTimesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				quote();
				setState(106);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CreateQuoteContext(QuoteContext ctx) { copyFrom(ctx); }
	}

	public final QuoteContext quote() throws RecognitionException {
		QuoteContext _localctx = new QuoteContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_quote);
		try {
			_localctx = new CreateQuoteContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__10);
			setState(111);
			block();
			setState(112);
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

	public static class Block_commandsContext extends ParserRuleContext {
		public Block_commandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_commands; }
	 
		public Block_commandsContext() { }
		public void copyFrom(Block_commandsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateLocalVarsContext extends Block_commandsContext {
		public Token variable;
		public Token WORD;
		public List<Token> variables = new ArrayList<Token>();
		public List<TerminalNode> WORD() { return getTokens(PactorParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(PactorParser.WORD, i);
		}
		public CreateLocalVarsContext(Block_commandsContext ctx) { copyFrom(ctx); }
	}

	public final Block_commandsContext block_commands() throws RecognitionException {
		Block_commandsContext _localctx = new Block_commandsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block_commands);
		int _la;
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new CreateLocalVarsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(T__12);
				setState(115);
				((CreateLocalVarsContext)_localctx).variable = match(WORD);
				}
				break;
			case 2:
				_localctx = new CreateLocalVarsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(T__12);
				setState(117);
				match(T__3);
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(118);
					((CreateLocalVarsContext)_localctx).WORD = match(WORD);
					((CreateLocalVarsContext)_localctx).variables.add(((CreateLocalVarsContext)_localctx).WORD);
					}
					}
					setState(121); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WORD );
				setState(123);
				match(T__5);
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
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new PushNumberToStackContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				((PushNumberToStackContext)_localctx).value = match(NUMBER);
				}
				break;
			case FLOAT:
				_localctx = new PushFloatToStackContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				((PushFloatToStackContext)_localctx).value = match(FLOAT);
				}
				break;
			case STRING:
				_localctx = new PushStringToStackContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				((PushStringToStackContext)_localctx).value = match(STRING);
				}
				break;
			case EXPRESSIONS:
				_localctx = new PushExpressionToStackContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				((PushExpressionToStackContext)_localctx).value = match(EXPRESSIONS);
				}
				break;
			case BOOLEAN:
				_localctx = new PushBooleanToStackContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(130);
				((PushBooleanToStackContext)_localctx).value = match(BOOLEAN);
				}
				break;
			case WORD:
			case MATH_WORDS:
				_localctx = new CommandRunContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(131);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u0089\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\7\2\24\n"+
		"\2\f\2\16\2\27\13\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\2\7\2\""+
		"\n\2\f\2\16\2%\13\2\3\2\3\2\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\7\4\66\n\4\f\4\16\49\13\4\3\4\3\4\7\4=\n\4\f\4\16\4@\13"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\3\4\3\4\7\4"+
		"Q\n\4\f\4\16\4T\13\4\3\4\3\4\3\4\3\4\5\4Z\n\4\3\5\3\5\3\5\3\5\7\5`\n\5"+
		"\f\5\16\5c\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6o\n\6\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\6\bz\n\b\r\b\16\b{\3\b\5\b\177\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u0087\n\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\3\3\2"+
		"\25\26\2\u0098\2\25\3\2\2\2\4(\3\2\2\2\6Y\3\2\2\2\ba\3\2\2\2\nn\3\2\2"+
		"\2\fp\3\2\2\2\16~\3\2\2\2\20\u0086\3\2\2\2\22\24\5\4\3\2\23\22\3\2\2\2"+
		"\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\33\3\2\2\2\27\25\3\2\2\2"+
		"\30\32\5\6\4\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2"+
		"\34#\3\2\2\2\35\33\3\2\2\2\36\"\5\20\t\2\37\"\5\n\6\2 \"\5\f\7\2!\36\3"+
		"\2\2\2!\37\3\2\2\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2"+
		"%#\3\2\2\2&\'\7\2\2\3\'\3\3\2\2\2(,\7\3\2\2)+\7\25\2\2*)\3\2\2\2+.\3\2"+
		"\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\60\7\4\2\2\60\5\3\2\2\2"+
		"\61\62\7\5\2\2\62\63\7\25\2\2\63\67\7\6\2\2\64\66\7\25\2\2\65\64\3\2\2"+
		"\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:>\7\7\2"+
		"\2;=\7\25\2\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2"+
		"\2\2AB\7\b\2\2BC\5\b\5\2CD\7\4\2\2DZ\3\2\2\2EF\7\t\2\2FG\7\25\2\2GK\7"+
		"\6\2\2HJ\7\25\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK"+
		"\3\2\2\2NR\7\7\2\2OQ\7\25\2\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2"+
		"SU\3\2\2\2TR\3\2\2\2UV\7\b\2\2VW\5\b\5\2WX\7\4\2\2XZ\3\2\2\2Y\61\3\2\2"+
		"\2YE\3\2\2\2Z\7\3\2\2\2[`\5\20\t\2\\`\5\n\6\2]`\5\f\7\2^`\5\16\b\2_[\3"+
		"\2\2\2_\\\3\2\2\2_]\3\2\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\t"+
		"\3\2\2\2ca\3\2\2\2de\5\f\7\2ef\5\f\7\2fg\7\n\2\2go\3\2\2\2hi\5\f\7\2i"+
		"j\7\13\2\2jo\3\2\2\2kl\5\f\7\2lm\7\f\2\2mo\3\2\2\2nd\3\2\2\2nh\3\2\2\2"+
		"nk\3\2\2\2o\13\3\2\2\2pq\7\r\2\2qr\5\b\5\2rs\7\16\2\2s\r\3\2\2\2tu\7\17"+
		"\2\2u\177\7\25\2\2vw\7\17\2\2wy\7\6\2\2xz\7\25\2\2yx\3\2\2\2z{\3\2\2\2"+
		"{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}\177\7\b\2\2~t\3\2\2\2~v\3\2\2\2\177\17"+
		"\3\2\2\2\u0080\u0087\7\21\2\2\u0081\u0087\7\22\2\2\u0082\u0087\7\23\2"+
		"\2\u0083\u0087\7\20\2\2\u0084\u0087\7\24\2\2\u0085\u0087\t\2\2\2\u0086"+
		"\u0080\3\2\2\2\u0086\u0081\3\2\2\2\u0086\u0082\3\2\2\2\u0086\u0083\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\21\3\2\2\2\22\25\33"+
		"!#,\67>KRY_an{~\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}