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
		T__9=10, T__10=11, T__11=12, COMMENT=13, EXPRESSIONS=14, NUMBER=15, FLOAT=16, 
		STRING=17, BOOLEAN=18, WORD=19, MATH_WORDS=20, WS=21;
	public static final int
		RULE_program = 0, RULE_using = 1, RULE_create_words = 2, RULE_block = 3, 
		RULE_array = 4, RULE_dictionary = 5, RULE_dictionary_entry = 6, RULE_quote = 7, 
		RULE_block_commands = 8, RULE_statement = 9, RULE_non_key_value = 10, 
		RULE_key_value = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "using", "create_words", "block", "array", "dictionary", "dictionary_entry", 
			"quote", "block_commands", "statement", "non_key_value", "key_value"
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
			null, "COMMENT", "EXPRESSIONS", "NUMBER", "FLOAT", "STRING", "BOOLEAN", 
			"WORD", "MATH_WORDS", "WS"
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(24);
				using();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(30);
					create_words();
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__7) | (1L << T__9) | (1L << EXPRESSIONS) | (1L << NUMBER) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN) | (1L << WORD) | (1L << MATH_WORDS))) != 0)) {
				{
				setState(40);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
				case EXPRESSIONS:
				case NUMBER:
				case FLOAT:
				case STRING:
				case BOOLEAN:
				case WORD:
				case MATH_WORDS:
					{
					setState(36);
					statement();
					}
					break;
				case T__9:
					{
					setState(37);
					quote();
					}
					break;
				case T__3:
					{
					setState(38);
					array();
					}
					break;
				case T__7:
					{
					setState(39);
					dictionary();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
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
			setState(47);
			match(T__0);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD) {
				{
				{
				setState(48);
				((CreateUsingContext)_localctx).WORD = match(WORD);
				((CreateUsingContext)_localctx).packages.add(((CreateUsingContext)_localctx).WORD);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
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
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new CreateWordContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(T__2);
				setState(57);
				((CreateWordContext)_localctx).name = match(WORD);
				setState(58);
				match(T__3);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD) {
					{
					{
					setState(59);
					((CreateWordContext)_localctx).WORD = match(WORD);
					((CreateWordContext)_localctx).params_in.add(((CreateWordContext)_localctx).WORD);
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(65);
				match(T__4);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD) {
					{
					{
					setState(66);
					((CreateWordContext)_localctx).WORD = match(WORD);
					((CreateWordContext)_localctx).params_out.add(((CreateWordContext)_localctx).WORD);
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(72);
				match(T__5);
				setState(73);
				block();
				setState(74);
				match(T__1);
				}
				break;
			case T__6:
				_localctx = new CreateVariableWordContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(T__6);
				setState(77);
				((CreateVariableWordContext)_localctx).name = match(WORD);
				setState(78);
				match(T__3);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD) {
					{
					{
					setState(79);
					((CreateVariableWordContext)_localctx).WORD = match(WORD);
					((CreateVariableWordContext)_localctx).params_in.add(((CreateVariableWordContext)_localctx).WORD);
					}
					}
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(85);
				match(T__4);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD) {
					{
					{
					setState(86);
					((CreateVariableWordContext)_localctx).WORD = match(WORD);
					((CreateVariableWordContext)_localctx).params_out.add(((CreateVariableWordContext)_localctx).WORD);
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(92);
				match(T__5);
				setState(93);
				block();
				setState(94);
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
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__7) | (1L << T__9) | (1L << T__11) | (1L << EXPRESSIONS) | (1L << NUMBER) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN) | (1L << WORD) | (1L << MATH_WORDS))) != 0)) {
				{
				setState(103);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
				case EXPRESSIONS:
				case NUMBER:
				case FLOAT:
				case STRING:
				case BOOLEAN:
				case WORD:
				case MATH_WORDS:
					{
					setState(98);
					statement();
					}
					break;
				case T__9:
					{
					setState(99);
					quote();
					}
					break;
				case T__11:
					{
					setState(100);
					block_commands();
					}
					break;
				case T__3:
					{
					setState(101);
					array();
					}
					break;
				case T__7:
					{
					setState(102);
					dictionary();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(107);
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
			setState(108);
			match(T__3);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << EXPRESSIONS) | (1L << NUMBER) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN) | (1L << WORD) | (1L << MATH_WORDS))) != 0)) {
				{
				{
				setState(109);
				statement();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
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
		public List<Dictionary_entryContext> dictionary_entry() {
			return getRuleContexts(Dictionary_entryContext.class);
		}
		public Dictionary_entryContext dictionary_entry(int i) {
			return getRuleContext(Dictionary_entryContext.class,i);
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
			setState(117);
			match(T__7);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				{
				setState(118);
				dictionary_entry();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
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

	public static class Dictionary_entryContext extends ParserRuleContext {
		public Dictionary_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_entry; }
	 
		public Dictionary_entryContext() { }
		public void copyFrom(Dictionary_entryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateDictionaryEntryContext extends Dictionary_entryContext {
		public Key_valueContext key_value() {
			return getRuleContext(Key_valueContext.class,0);
		}
		public QuoteContext quote() {
			return getRuleContext(QuoteContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CreateDictionaryEntryContext(Dictionary_entryContext ctx) { copyFrom(ctx); }
	}

	public final Dictionary_entryContext dictionary_entry() throws RecognitionException {
		Dictionary_entryContext _localctx = new Dictionary_entryContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dictionary_entry);
		try {
			_localctx = new CreateDictionaryEntryContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			key_value();
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				{
				setState(127);
				quote();
				}
				break;
			case T__2:
			case EXPRESSIONS:
			case NUMBER:
			case FLOAT:
			case STRING:
			case BOOLEAN:
			case WORD:
			case MATH_WORDS:
				{
				setState(128);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 14, RULE_quote);
		try {
			_localctx = new CreateQuoteContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__9);
			setState(132);
			block();
			setState(133);
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
		enterRule(_localctx, 16, RULE_block_commands);
		int _la;
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new CreateLocalVarsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(T__11);
				setState(136);
				((CreateLocalVarsContext)_localctx).variable = match(WORD);
				}
				break;
			case 2:
				_localctx = new CreateLocalVarsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(T__11);
				setState(138);
				match(T__3);
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(139);
					((CreateLocalVarsContext)_localctx).WORD = match(WORD);
					((CreateLocalVarsContext)_localctx).variables.add(((CreateLocalVarsContext)_localctx).WORD);
					}
					}
					setState(142); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WORD );
				setState(144);
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
		public Non_key_valueContext non_key_value() {
			return getRuleContext(Non_key_valueContext.class,0);
		}
		public Key_valueContext key_value() {
			return getRuleContext(Key_valueContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXPRESSIONS:
			case FLOAT:
			case BOOLEAN:
			case WORD:
			case MATH_WORDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				non_key_value();
				}
				break;
			case T__2:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				key_value();
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

	public static class Non_key_valueContext extends ParserRuleContext {
		public Non_key_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_key_value; }
	 
		public Non_key_valueContext() { }
		public void copyFrom(Non_key_valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PushFloatToStackContext extends Non_key_valueContext {
		public Token value;
		public TerminalNode FLOAT() { return getToken(PactorParser.FLOAT, 0); }
		public PushFloatToStackContext(Non_key_valueContext ctx) { copyFrom(ctx); }
	}
	public static class PushBooleanToStackContext extends Non_key_valueContext {
		public Token value;
		public TerminalNode BOOLEAN() { return getToken(PactorParser.BOOLEAN, 0); }
		public PushBooleanToStackContext(Non_key_valueContext ctx) { copyFrom(ctx); }
	}
	public static class PushExpressionToStackContext extends Non_key_valueContext {
		public Token value;
		public TerminalNode EXPRESSIONS() { return getToken(PactorParser.EXPRESSIONS, 0); }
		public PushExpressionToStackContext(Non_key_valueContext ctx) { copyFrom(ctx); }
	}
	public static class CommandRunContext extends Non_key_valueContext {
		public Token value;
		public TerminalNode WORD() { return getToken(PactorParser.WORD, 0); }
		public TerminalNode MATH_WORDS() { return getToken(PactorParser.MATH_WORDS, 0); }
		public CommandRunContext(Non_key_valueContext ctx) { copyFrom(ctx); }
	}

	public final Non_key_valueContext non_key_value() throws RecognitionException {
		Non_key_valueContext _localctx = new Non_key_valueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_non_key_value);
		int _la;
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
				_localctx = new PushFloatToStackContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				((PushFloatToStackContext)_localctx).value = match(FLOAT);
				}
				break;
			case EXPRESSIONS:
				_localctx = new PushExpressionToStackContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				((PushExpressionToStackContext)_localctx).value = match(EXPRESSIONS);
				}
				break;
			case BOOLEAN:
				_localctx = new PushBooleanToStackContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				((PushBooleanToStackContext)_localctx).value = match(BOOLEAN);
				}
				break;
			case WORD:
			case MATH_WORDS:
				_localctx = new CommandRunContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
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

	public static class Key_valueContext extends ParserRuleContext {
		public Key_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_value; }
	 
		public Key_valueContext() { }
		public void copyFrom(Key_valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PushSymbolToStackContext extends Key_valueContext {
		public Token value;
		public TerminalNode STRING() { return getToken(PactorParser.STRING, 0); }
		public PushSymbolToStackContext(Key_valueContext ctx) { copyFrom(ctx); }
	}
	public static class PushStringToStackContext extends Key_valueContext {
		public Token value;
		public TerminalNode STRING() { return getToken(PactorParser.STRING, 0); }
		public PushStringToStackContext(Key_valueContext ctx) { copyFrom(ctx); }
	}
	public static class PushNumberToStackContext extends Key_valueContext {
		public Token value;
		public TerminalNode NUMBER() { return getToken(PactorParser.NUMBER, 0); }
		public PushNumberToStackContext(Key_valueContext ctx) { copyFrom(ctx); }
	}

	public final Key_valueContext key_value() throws RecognitionException {
		Key_valueContext _localctx = new Key_valueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_key_value);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new PushNumberToStackContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				((PushNumberToStackContext)_localctx).value = match(NUMBER);
				}
				break;
			case STRING:
				_localctx = new PushStringToStackContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				((PushStringToStackContext)_localctx).value = match(STRING);
				}
				break;
			case T__2:
				_localctx = new PushSymbolToStackContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				((PushSymbolToStackContext)_localctx).value = match(T__2);
				setState(160);
				match(STRING);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u00a6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\7\2\"\n\2\f"+
		"\2\16\2%\13\2\3\2\3\2\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\2\3\2\3\3\3\3"+
		"\7\3\64\n\3\f\3\16\3\67\13\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4?\n\4\f\4\16\4"+
		"B\13\4\3\4\3\4\7\4F\n\4\f\4\16\4I\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\4S\n\4\f\4\16\4V\13\4\3\4\3\4\7\4Z\n\4\f\4\16\4]\13\4\3\4\3\4\3\4\3"+
		"\4\5\4c\n\4\3\5\3\5\3\5\3\5\3\5\7\5j\n\5\f\5\16\5m\13\5\3\6\3\6\7\6q\n"+
		"\6\f\6\16\6t\13\6\3\6\3\6\3\7\3\7\7\7z\n\7\f\7\16\7}\13\7\3\7\3\7\3\b"+
		"\3\b\3\b\5\b\u0084\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\6\n\u008f\n"+
		"\n\r\n\16\n\u0090\3\n\5\n\u0094\n\n\3\13\3\13\5\13\u0098\n\13\3\f\3\f"+
		"\3\f\3\f\5\f\u009e\n\f\3\r\3\r\3\r\3\r\5\r\u00a4\n\r\3\r\2\2\16\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\2\3\3\2\25\26\2\u00b5\2\35\3\2\2\2\4\61\3\2\2"+
		"\2\6b\3\2\2\2\bk\3\2\2\2\nn\3\2\2\2\fw\3\2\2\2\16\u0080\3\2\2\2\20\u0085"+
		"\3\2\2\2\22\u0093\3\2\2\2\24\u0097\3\2\2\2\26\u009d\3\2\2\2\30\u00a3\3"+
		"\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3"+
		"\2\2\2\36#\3\2\2\2\37\35\3\2\2\2 \"\5\6\4\2! \3\2\2\2\"%\3\2\2\2#!\3\2"+
		"\2\2#$\3\2\2\2$,\3\2\2\2%#\3\2\2\2&+\5\24\13\2\'+\5\20\t\2(+\5\n\6\2)"+
		"+\5\f\7\2*&\3\2\2\2*\'\3\2\2\2*(\3\2\2\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2"+
		",-\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\60\7\2\2\3\60\3\3\2\2\2\61\65\7\3\2\2"+
		"\62\64\7\25\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2"+
		"\2\668\3\2\2\2\67\65\3\2\2\289\7\4\2\29\5\3\2\2\2:;\7\5\2\2;<\7\25\2\2"+
		"<@\7\6\2\2=?\7\25\2\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2"+
		"\2B@\3\2\2\2CG\7\7\2\2DF\7\25\2\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2"+
		"\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\b\2\2KL\5\b\5\2LM\7\4\2\2Mc\3\2\2\2NO\7\t"+
		"\2\2OP\7\25\2\2PT\7\6\2\2QS\7\25\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3"+
		"\2\2\2UW\3\2\2\2VT\3\2\2\2W[\7\7\2\2XZ\7\25\2\2YX\3\2\2\2Z]\3\2\2\2[Y"+
		"\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7\b\2\2_`\5\b\5\2`a\7\4\2\2"+
		"ac\3\2\2\2b:\3\2\2\2bN\3\2\2\2c\7\3\2\2\2dj\5\24\13\2ej\5\20\t\2fj\5\22"+
		"\n\2gj\5\n\6\2hj\5\f\7\2id\3\2\2\2ie\3\2\2\2if\3\2\2\2ig\3\2\2\2ih\3\2"+
		"\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\t\3\2\2\2mk\3\2\2\2nr\7\6\2\2oq\5"+
		"\24\13\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2u"+
		"v\7\b\2\2v\13\3\2\2\2w{\7\n\2\2xz\5\16\b\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2"+
		"\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7\13\2\2\177\r\3\2\2\2\u0080\u0083"+
		"\5\30\r\2\u0081\u0084\5\20\t\2\u0082\u0084\5\24\13\2\u0083\u0081\3\2\2"+
		"\2\u0083\u0082\3\2\2\2\u0084\17\3\2\2\2\u0085\u0086\7\f\2\2\u0086\u0087"+
		"\5\b\5\2\u0087\u0088\7\r\2\2\u0088\21\3\2\2\2\u0089\u008a\7\16\2\2\u008a"+
		"\u0094\7\25\2\2\u008b\u008c\7\16\2\2\u008c\u008e\7\6\2\2\u008d\u008f\7"+
		"\25\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\7\b\2\2\u0093\u0089\3\2"+
		"\2\2\u0093\u008b\3\2\2\2\u0094\23\3\2\2\2\u0095\u0098\5\26\f\2\u0096\u0098"+
		"\5\30\r\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\25\3\2\2\2\u0099"+
		"\u009e\7\22\2\2\u009a\u009e\7\20\2\2\u009b\u009e\7\24\2\2\u009c\u009e"+
		"\t\2\2\2\u009d\u0099\3\2\2\2\u009d\u009a\3\2\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009c\3\2\2\2\u009e\27\3\2\2\2\u009f\u00a4\7\21\2\2\u00a0\u00a4\7\23"+
		"\2\2\u00a1\u00a2\7\5\2\2\u00a2\u00a4\7\23\2\2\u00a3\u009f\3\2\2\2\u00a3"+
		"\u00a0\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\31\3\2\2\2\26\35#*,\65@GT[bi"+
		"kr{\u0083\u0090\u0093\u0097\u009d\u00a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}