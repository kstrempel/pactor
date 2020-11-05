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
		BOOLEAN=17, WORD=18, MATH_WORDS=19, WS=20;
	public static final int
		RULE_program = 0, RULE_using = 1, RULE_create_words = 2, RULE_block = 3, 
		RULE_array = 4, RULE_dictionary = 5, RULE_quote = 6, RULE_block_commands = 7, 
		RULE_statement = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "using", "create_words", "block", "array", "dictionary", "quote", 
			"block_commands", "statement"
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
		public List<QuoteContext> quote() {
			return getRuleContexts(QuoteContext.class);
		}
		public QuoteContext quote(int i) {
			return getRuleContext(QuoteContext.class,i);
		}
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public List<DictionaryContext> dictionary() {
			return getRuleContexts(DictionaryContext.class);
		}
		public DictionaryContext dictionary(int i) {
			return getRuleContext(DictionaryContext.class,i);
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
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(18);
				using();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__6) {
				{
				{
				setState(24);
				create_words();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__7) | (1L << T__9) | (1L << EXPRESSIONS) | (1L << NUMBER) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN) | (1L << WORD) | (1L << MATH_WORDS))) != 0)) {
				{
				setState(34);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EXPRESSIONS:
				case NUMBER:
				case FLOAT:
				case STRING:
				case BOOLEAN:
				case WORD:
				case MATH_WORDS:
					{
					setState(30);
					statement();
					}
					break;
				case T__9:
					{
					setState(31);
					quote();
					}
					break;
				case T__3:
					{
					setState(32);
					array();
					}
					break;
				case T__7:
					{
					setState(33);
					dictionary();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
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
			setState(41);
			match(T__0);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD) {
				{
				{
				setState(42);
				((CreateUsingContext)_localctx).WORD = match(WORD);
				((CreateUsingContext)_localctx).packages.add(((CreateUsingContext)_localctx).WORD);
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
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
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new CreateWordContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(T__2);
				setState(51);
				((CreateWordContext)_localctx).name = match(WORD);
				setState(52);
				match(T__3);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD) {
					{
					{
					setState(53);
					((CreateWordContext)_localctx).WORD = match(WORD);
					((CreateWordContext)_localctx).params_in.add(((CreateWordContext)_localctx).WORD);
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(59);
				match(T__4);
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD) {
					{
					{
					setState(60);
					((CreateWordContext)_localctx).WORD = match(WORD);
					((CreateWordContext)_localctx).params_out.add(((CreateWordContext)_localctx).WORD);
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(66);
				match(T__5);
				setState(67);
				block();
				setState(68);
				match(T__1);
				}
				break;
			case T__6:
				_localctx = new CreateVariableWordContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(T__6);
				setState(71);
				((CreateVariableWordContext)_localctx).name = match(WORD);
				setState(72);
				match(T__3);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD) {
					{
					{
					setState(73);
					((CreateVariableWordContext)_localctx).WORD = match(WORD);
					((CreateVariableWordContext)_localctx).params_in.add(((CreateVariableWordContext)_localctx).WORD);
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(79);
				match(T__4);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD) {
					{
					{
					setState(80);
					((CreateVariableWordContext)_localctx).WORD = match(WORD);
					((CreateVariableWordContext)_localctx).params_out.add(((CreateVariableWordContext)_localctx).WORD);
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(86);
				match(T__5);
				setState(87);
				block();
				setState(88);
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
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public List<DictionaryContext> dictionary() {
			return getRuleContexts(DictionaryContext.class);
		}
		public DictionaryContext dictionary(int i) {
			return getRuleContext(DictionaryContext.class,i);
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
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__7) | (1L << T__9) | (1L << T__11) | (1L << EXPRESSIONS) | (1L << NUMBER) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN) | (1L << WORD) | (1L << MATH_WORDS))) != 0)) {
				{
				setState(97);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EXPRESSIONS:
				case NUMBER:
				case FLOAT:
				case STRING:
				case BOOLEAN:
				case WORD:
				case MATH_WORDS:
					{
					setState(92);
					statement();
					}
					break;
				case T__9:
					{
					setState(93);
					quote();
					}
					break;
				case T__11:
					{
					setState(94);
					block_commands();
					}
					break;
				case T__3:
					{
					setState(95);
					array();
					}
					break;
				case T__7:
					{
					setState(96);
					dictionary();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(101);
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

	public static class ArrayContext extends ParserRuleContext {
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	 
		public ArrayContext() { }
		public void copyFrom(ArrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateArrayContext extends ArrayContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CreateArrayContext(ArrayContext ctx) { copyFrom(ctx); }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_array);
		int _la;
		try {
			_localctx = new CreateArrayContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__3);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXPRESSIONS) | (1L << NUMBER) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN) | (1L << WORD) | (1L << MATH_WORDS))) != 0)) {
				{
				{
				setState(103);
				statement();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(T__5);
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

	public static class DictionaryContext extends ParserRuleContext {
		public DictionaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary; }
	 
		public DictionaryContext() { }
		public void copyFrom(DictionaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateDictionaryContext extends DictionaryContext {
		public List<TerminalNode> STRING() { return getTokens(PactorParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(PactorParser.STRING, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(PactorParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PactorParser.NUMBER, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<QuoteContext> quote() {
			return getRuleContexts(QuoteContext.class);
		}
		public QuoteContext quote(int i) {
			return getRuleContext(QuoteContext.class,i);
		}
		public CreateDictionaryContext(DictionaryContext ctx) { copyFrom(ctx); }
	}

	public final DictionaryContext dictionary() throws RecognitionException {
		DictionaryContext _localctx = new DictionaryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dictionary);
		int _la;
		try {
			_localctx = new CreateDictionaryContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__7);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER || _la==STRING) {
				{
				{
				setState(112);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(115);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EXPRESSIONS:
				case NUMBER:
				case FLOAT:
				case STRING:
				case BOOLEAN:
				case WORD:
				case MATH_WORDS:
					{
					setState(113);
					statement();
					}
					break;
				case T__9:
					{
					setState(114);
					quote();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			match(T__8);
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
		enterRule(_localctx, 12, RULE_quote);
		try {
			_localctx = new CreateQuoteContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__9);
			setState(125);
			block();
			setState(126);
			match(T__10);
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
		enterRule(_localctx, 14, RULE_block_commands);
		int _la;
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new CreateLocalVarsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(T__11);
				setState(129);
				((CreateLocalVarsContext)_localctx).variable = match(WORD);
				}
				break;
			case 2:
				_localctx = new CreateLocalVarsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(T__11);
				setState(131);
				match(T__3);
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(132);
					((CreateLocalVarsContext)_localctx).WORD = match(WORD);
					((CreateLocalVarsContext)_localctx).variables.add(((CreateLocalVarsContext)_localctx).WORD);
					}
					}
					setState(135); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WORD );
				setState(137);
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
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new PushNumberToStackContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				((PushNumberToStackContext)_localctx).value = match(NUMBER);
				}
				break;
			case FLOAT:
				_localctx = new PushFloatToStackContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				((PushFloatToStackContext)_localctx).value = match(FLOAT);
				}
				break;
			case STRING:
				_localctx = new PushStringToStackContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				((PushStringToStackContext)_localctx).value = match(STRING);
				}
				break;
			case EXPRESSIONS:
				_localctx = new PushExpressionToStackContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				((PushExpressionToStackContext)_localctx).value = match(EXPRESSIONS);
				}
				break;
			case BOOLEAN:
				_localctx = new PushBooleanToStackContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				((PushBooleanToStackContext)_localctx).value = match(BOOLEAN);
				}
				break;
			case WORD:
			case MATH_WORDS:
				_localctx = new CommandRunContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(145);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u0097\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\7"+
		"\2\26\n\2\f\2\16\2\31\13\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\3\2\3\2"+
		"\3\2\7\2%\n\2\f\2\16\2(\13\2\3\2\3\2\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\7\49\n\4\f\4\16\4<\13\4\3\4\3\4\7\4@\n\4\f\4"+
		"\16\4C\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4M\n\4\f\4\16\4P\13\4\3"+
		"\4\3\4\7\4T\n\4\f\4\16\4W\13\4\3\4\3\4\3\4\3\4\5\4]\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\7\5d\n\5\f\5\16\5g\13\5\3\6\3\6\7\6k\n\6\f\6\16\6n\13\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\5\7v\n\7\7\7x\n\7\f\7\16\7{\13\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\6\t\u0088\n\t\r\t\16\t\u0089\3\t\5\t\u008d\n"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0095\n\n\3\n\2\2\13\2\4\6\b\n\f\16\20"+
		"\22\2\4\4\2\20\20\22\22\3\2\24\25\2\u00a8\2\27\3\2\2\2\4+\3\2\2\2\6\\"+
		"\3\2\2\2\be\3\2\2\2\nh\3\2\2\2\fq\3\2\2\2\16~\3\2\2\2\20\u008c\3\2\2\2"+
		"\22\u0094\3\2\2\2\24\26\5\4\3\2\25\24\3\2\2\2\26\31\3\2\2\2\27\25\3\2"+
		"\2\2\27\30\3\2\2\2\30\35\3\2\2\2\31\27\3\2\2\2\32\34\5\6\4\2\33\32\3\2"+
		"\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36&\3\2\2\2\37\35\3\2\2"+
		"\2 %\5\22\n\2!%\5\16\b\2\"%\5\n\6\2#%\5\f\7\2$ \3\2\2\2$!\3\2\2\2$\"\3"+
		"\2\2\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(&\3\2\2\2)"+
		"*\7\2\2\3*\3\3\2\2\2+/\7\3\2\2,.\7\24\2\2-,\3\2\2\2.\61\3\2\2\2/-\3\2"+
		"\2\2/\60\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\63\7\4\2\2\63\5\3\2\2\2"+
		"\64\65\7\5\2\2\65\66\7\24\2\2\66:\7\6\2\2\679\7\24\2\28\67\3\2\2\29<\3"+
		"\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=A\7\7\2\2>@\7\24\2\2?>"+
		"\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7\b\2\2E"+
		"F\5\b\5\2FG\7\4\2\2G]\3\2\2\2HI\7\t\2\2IJ\7\24\2\2JN\7\6\2\2KM\7\24\2"+
		"\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QU\7\7\2"+
		"\2RT\7\24\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2"+
		"\2\2XY\7\b\2\2YZ\5\b\5\2Z[\7\4\2\2[]\3\2\2\2\\\64\3\2\2\2\\H\3\2\2\2]"+
		"\7\3\2\2\2^d\5\22\n\2_d\5\16\b\2`d\5\20\t\2ad\5\n\6\2bd\5\f\7\2c^\3\2"+
		"\2\2c_\3\2\2\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2"+
		"\2\2f\t\3\2\2\2ge\3\2\2\2hl\7\6\2\2ik\5\22\n\2ji\3\2\2\2kn\3\2\2\2lj\3"+
		"\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7\b\2\2p\13\3\2\2\2qy\7\n\2\2r"+
		"u\t\2\2\2sv\5\22\n\2tv\5\16\b\2us\3\2\2\2ut\3\2\2\2vx\3\2\2\2wr\3\2\2"+
		"\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7\13\2\2}\r\3\2"+
		"\2\2~\177\7\f\2\2\177\u0080\5\b\5\2\u0080\u0081\7\r\2\2\u0081\17\3\2\2"+
		"\2\u0082\u0083\7\16\2\2\u0083\u008d\7\24\2\2\u0084\u0085\7\16\2\2\u0085"+
		"\u0087\7\6\2\2\u0086\u0088\7\24\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3"+
		"\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008d\7\b\2\2\u008c\u0082\3\2\2\2\u008c\u0084\3\2\2\2\u008d\21\3\2\2"+
		"\2\u008e\u0095\7\20\2\2\u008f\u0095\7\21\2\2\u0090\u0095\7\22\2\2\u0091"+
		"\u0095\7\17\2\2\u0092\u0095\7\23\2\2\u0093\u0095\t\3\2\2\u0094\u008e\3"+
		"\2\2\2\u0094\u008f\3\2\2\2\u0094\u0090\3\2\2\2\u0094\u0091\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\23\3\2\2\2\24\27\35$&/:ANU\\"+
		"celuy\u0089\u008c\u0094";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}