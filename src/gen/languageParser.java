package gen;// Generated from /home/adam/Uczelnia/JFTT/L3/Compiler/src/main/language.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class languageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, COMMENT=2, IF=3, COMMA=4, NUM=5, LSQBRACKET=6, RSQBRACKET=7, SEMICOLON=8, 
		VAR=9, BEGIN=10, END=11, ASSIGN=12, ELSE=13, THEN=14, ENDIF=15, WHILE=16, 
		REPEAT=17, DO=18, ENDWHILE=19, UNTIL=20, FOR=21, FROM=22, DOWNTO=23, TO=24, 
		ENDFOR=25, READ=26, WRITE=27, PLUS=28, MINUS=29, DIV=30, TIMES=31, MOD=32, 
		EQ=33, NEQ=34, LE=35, GE=36, LEQ=37, GEQ=38, WHITESPACE=39, PIDENTIFIER=40, 
		CHARACTER=41;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_declarations = 2, RULE_commands = 3, 
		RULE_command = 4, RULE_expression = 5, RULE_condition = 6, RULE_value = 7, 
		RULE_identifier = 8, RULE_possibleWhitespace = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "program", "declarations", "commands", "command", "expression", 
			"condition", "value", "identifier", "possibleWhitespace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", null, "'IF'", "','", null, "'['", "']'", "';'", "'VAR'", 
			"'BEGIN'", "'END'", "'ASSIGN'", "'ELSE'", "'THEN'", "'ENDIF'", "'WHILE'", 
			"'REPEAT'", "'DO'", "'ENDWHILE'", "'UNTIL'", "'FOR'", "'FROM'", "'DOWNTO'", 
			"'TO'", "'ENDFOR'", "'READ'", "'WRITE'", "'PLUS'", "'MINUS'", "'DIV'", 
			"'TIMES'", "'MOD'", "'EQ'", "'NEQ'", "'LE'", "'GE'", "'LEQ'", "'GEQ'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "COMMENT", "IF", "COMMA", "NUM", "LSQBRACKET", "RSQBRACKET", 
			"SEMICOLON", "VAR", "BEGIN", "END", "ASSIGN", "ELSE", "THEN", "ENDIF", 
			"WHILE", "REPEAT", "DO", "ENDWHILE", "UNTIL", "FOR", "FROM", "DOWNTO", 
			"TO", "ENDFOR", "READ", "WRITE", "PLUS", "MINUS", "DIV", "TIMES", "MOD", 
			"EQ", "NEQ", "LE", "GE", "LEQ", "GEQ", "WHITESPACE", "PIDENTIFIER", "CHARACTER"
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
	public String getGrammarFileName() { return "language.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public languageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			program();
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

	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Declare_StartContext extends ProgramContext {
		public List<PossibleWhitespaceContext> possibleWhitespace() {
			return getRuleContexts(PossibleWhitespaceContext.class);
		}
		public PossibleWhitespaceContext possibleWhitespace(int i) {
			return getRuleContext(PossibleWhitespaceContext.class,i);
		}
		public TerminalNode VAR() { return getToken(languageParser.VAR, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(languageParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(languageParser.WHITESPACE, i);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(languageParser.BEGIN, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode END() { return getToken(languageParser.END, 0); }
		public TerminalNode EOF() { return getToken(languageParser.EOF, 0); }
		public Declare_StartContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterDeclare_Start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitDeclare_Start(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitDeclare_Start(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Nodeclare_StartContext extends ProgramContext {
		public List<PossibleWhitespaceContext> possibleWhitespace() {
			return getRuleContexts(PossibleWhitespaceContext.class);
		}
		public PossibleWhitespaceContext possibleWhitespace(int i) {
			return getRuleContext(PossibleWhitespaceContext.class,i);
		}
		public TerminalNode BEGIN() { return getToken(languageParser.BEGIN, 0); }
		public TerminalNode WHITESPACE() { return getToken(languageParser.WHITESPACE, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode END() { return getToken(languageParser.END, 0); }
		public TerminalNode EOF() { return getToken(languageParser.EOF, 0); }
		public Nodeclare_StartContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterNodeclare_Start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitNodeclare_Start(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitNodeclare_Start(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new Declare_StartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				possibleWhitespace();
				setState(23);
				match(VAR);
				setState(24);
				match(WHITESPACE);
				setState(25);
				declarations();
				setState(26);
				match(WHITESPACE);
				setState(27);
				match(BEGIN);
				setState(28);
				match(WHITESPACE);
				setState(29);
				commands(0);
				setState(30);
				possibleWhitespace();
				setState(31);
				match(END);
				setState(33);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(32);
					match(EOF);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new Nodeclare_StartContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				possibleWhitespace();
				setState(36);
				match(BEGIN);
				setState(37);
				match(WHITESPACE);
				setState(38);
				commands(0);
				setState(39);
				match(END);
				setState(40);
				possibleWhitespace();
				setState(42);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(41);
					match(EOF);
					}
					break;
				}
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

	public static class DeclarationsContext extends ParserRuleContext {
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	 
		public DeclarationsContext() { }
		public void copyFrom(DeclarationsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Put_Symbol1Context extends DeclarationsContext {
		public PossibleWhitespaceContext possibleWhitespace() {
			return getRuleContext(PossibleWhitespaceContext.class,0);
		}
		public TerminalNode PIDENTIFIER() { return getToken(languageParser.PIDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(languageParser.COMMA, 0); }
		public TerminalNode WHITESPACE() { return getToken(languageParser.WHITESPACE, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public Put_Symbol1Context(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterPut_Symbol1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitPut_Symbol1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitPut_Symbol1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Put_Symbol2Context extends DeclarationsContext {
		public PossibleWhitespaceContext possibleWhitespace() {
			return getRuleContext(PossibleWhitespaceContext.class,0);
		}
		public TerminalNode PIDENTIFIER() { return getToken(languageParser.PIDENTIFIER, 0); }
		public Put_Symbol2Context(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterPut_Symbol2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitPut_Symbol2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitPut_Symbol2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Put_Table2Context extends DeclarationsContext {
		public Token left;
		public Token right;
		public PossibleWhitespaceContext possibleWhitespace() {
			return getRuleContext(PossibleWhitespaceContext.class,0);
		}
		public TerminalNode PIDENTIFIER() { return getToken(languageParser.PIDENTIFIER, 0); }
		public TerminalNode LSQBRACKET() { return getToken(languageParser.LSQBRACKET, 0); }
		public TerminalNode RSQBRACKET() { return getToken(languageParser.RSQBRACKET, 0); }
		public List<TerminalNode> NUM() { return getTokens(languageParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(languageParser.NUM, i);
		}
		public Put_Table2Context(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterPut_Table2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitPut_Table2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitPut_Table2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Put_Table1Context extends DeclarationsContext {
		public Token left;
		public Token right;
		public PossibleWhitespaceContext possibleWhitespace() {
			return getRuleContext(PossibleWhitespaceContext.class,0);
		}
		public TerminalNode PIDENTIFIER() { return getToken(languageParser.PIDENTIFIER, 0); }
		public TerminalNode LSQBRACKET() { return getToken(languageParser.LSQBRACKET, 0); }
		public TerminalNode RSQBRACKET() { return getToken(languageParser.RSQBRACKET, 0); }
		public TerminalNode COMMA() { return getToken(languageParser.COMMA, 0); }
		public TerminalNode WHITESPACE() { return getToken(languageParser.WHITESPACE, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public List<TerminalNode> NUM() { return getTokens(languageParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(languageParser.NUM, i);
		}
		public Put_Table1Context(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterPut_Table1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitPut_Table1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitPut_Table1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declarations);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new Put_Table1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				possibleWhitespace();
				setState(47);
				match(PIDENTIFIER);
				setState(48);
				match(LSQBRACKET);
				setState(49);
				((Put_Table1Context)_localctx).left = match(NUM);
				setState(50);
				match(T__0);
				setState(51);
				((Put_Table1Context)_localctx).right = match(NUM);
				setState(52);
				match(RSQBRACKET);
				setState(53);
				match(COMMA);
				setState(54);
				match(WHITESPACE);
				setState(55);
				declarations();
				}
				break;
			case 2:
				_localctx = new Put_Symbol1Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				possibleWhitespace();
				setState(58);
				match(PIDENTIFIER);
				setState(59);
				match(COMMA);
				setState(60);
				match(WHITESPACE);
				setState(61);
				declarations();
				}
				break;
			case 3:
				_localctx = new Put_Table2Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				possibleWhitespace();
				setState(64);
				match(PIDENTIFIER);
				setState(65);
				match(LSQBRACKET);
				setState(66);
				((Put_Table2Context)_localctx).left = match(NUM);
				setState(67);
				match(T__0);
				setState(68);
				((Put_Table2Context)_localctx).right = match(NUM);
				setState(69);
				match(RSQBRACKET);
				}
				break;
			case 4:
				_localctx = new Put_Symbol2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				possibleWhitespace();
				setState(72);
				match(PIDENTIFIER);
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
	public static class GetCommandContext extends CommandsContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(languageParser.WHITESPACE, 0); }
		public GetCommandContext(CommandsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterGetCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitGetCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitGetCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetCommandsContext extends CommandsContext {
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(languageParser.WHITESPACE, 0); }
		public GetCommandsContext(CommandsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterGetCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitGetCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitGetCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		return commands(0);
	}

	private CommandsContext commands(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CommandsContext _localctx = new CommandsContext(_ctx, _parentState);
		CommandsContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_commands, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new GetCommandContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(77);
			command();
			setState(78);
			match(WHITESPACE);
			}
			_ctx.stop = _input.LT(-1);
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GetCommandsContext(new CommandsContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_commands);
					setState(80);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(81);
					command();
					setState(82);
					match(WHITESPACE);
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	 
		public CommandContext() { }
		public void copyFrom(CommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfElse_StatementContext extends CommandContext {
		public CommandsContext ifblock;
		public CommandsContext elseblock;
		public PossibleWhitespaceContext possibleWhitespace() {
			return getRuleContext(PossibleWhitespaceContext.class,0);
		}
		public TerminalNode IF() { return getToken(languageParser.IF, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(languageParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(languageParser.WHITESPACE, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(languageParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(languageParser.ELSE, 0); }
		public TerminalNode ENDIF() { return getToken(languageParser.ENDIF, 0); }
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public IfElse_StatementContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterIfElse_Statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitIfElse_Statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitIfElse_Statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Repeat_StatementContext extends CommandContext {
		public PossibleWhitespaceContext possibleWhitespace() {
			return getRuleContext(PossibleWhitespaceContext.class,0);
		}
		public TerminalNode REPEAT() { return getToken(languageParser.REPEAT, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(languageParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(languageParser.WHITESPACE, i);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(languageParser.UNTIL, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(languageParser.SEMICOLON, 0); }
		public Repeat_StatementContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterRepeat_Statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitRepeat_Statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitRepeat_Statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class For_StatementContext extends CommandContext {
		public ValueContext v1;
		public Token direction;
		public ValueContext v2;
		public PossibleWhitespaceContext possibleWhitespace() {
			return getRuleContext(PossibleWhitespaceContext.class,0);
		}
		public TerminalNode FOR() { return getToken(languageParser.FOR, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(languageParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(languageParser.WHITESPACE, i);
		}
		public TerminalNode PIDENTIFIER() { return getToken(languageParser.PIDENTIFIER, 0); }
		public TerminalNode FROM() { return getToken(languageParser.FROM, 0); }
		public TerminalNode DO() { return getToken(languageParser.DO, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode ENDFOR() { return getToken(languageParser.ENDFOR, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode TO() { return getToken(languageParser.TO, 0); }
		public TerminalNode DOWNTO() { return getToken(languageParser.DOWNTO, 0); }
		public For_StatementContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterFor_Statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitFor_Statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitFor_Statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Write_StatementContext extends CommandContext {
		public PossibleWhitespaceContext possibleWhitespace() {
			return getRuleContext(PossibleWhitespaceContext.class,0);
		}
		public TerminalNode WRITE() { return getToken(languageParser.WRITE, 0); }
		public TerminalNode WHITESPACE() { return getToken(languageParser.WHITESPACE, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(languageParser.SEMICOLON, 0); }
		public Write_StatementContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterWrite_Statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitWrite_Statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitWrite_Statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class If_StatementContext extends CommandContext {
		public List<PossibleWhitespaceContext> possibleWhitespace() {
			return getRuleContexts(PossibleWhitespaceContext.class);
		}
		public PossibleWhitespaceContext possibleWhitespace(int i) {
			return getRuleContext(PossibleWhitespaceContext.class,i);
		}
		public TerminalNode IF() { return getToken(languageParser.IF, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(languageParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(languageParser.WHITESPACE, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(languageParser.THEN, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(languageParser.ENDIF, 0); }
		public If_StatementContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterIf_Statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitIf_Statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitIf_Statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Read_StatementContext extends CommandContext {
		public PossibleWhitespaceContext possibleWhitespace() {
			return getRuleContext(PossibleWhitespaceContext.class,0);
		}
		public TerminalNode READ() { return getToken(languageParser.READ, 0); }
		public TerminalNode WHITESPACE() { return getToken(languageParser.WHITESPACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(languageParser.SEMICOLON, 0); }
		public Read_StatementContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterRead_Statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitRead_Statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitRead_Statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Assign_StatementContext extends CommandContext {
		public PossibleWhitespaceContext possibleWhitespace() {
			return getRuleContext(PossibleWhitespaceContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(languageParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(languageParser.WHITESPACE, i);
		}
		public TerminalNode ASSIGN() { return getToken(languageParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(languageParser.SEMICOLON, 0); }
		public Assign_StatementContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterAssign_Statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitAssign_Statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitAssign_Statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class While_StatementContext extends CommandContext {
		public PossibleWhitespaceContext possibleWhitespace() {
			return getRuleContext(PossibleWhitespaceContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(languageParser.WHILE, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(languageParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(languageParser.WHITESPACE, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode DO() { return getToken(languageParser.DO, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode ENDWHILE() { return getToken(languageParser.ENDWHILE, 0); }
		public While_StatementContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterWhile_Statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitWhile_Statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitWhile_Statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_command);
		int _la;
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new Assign_StatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				possibleWhitespace();
				setState(90);
				identifier();
				setState(91);
				match(WHITESPACE);
				setState(92);
				match(ASSIGN);
				setState(93);
				match(WHITESPACE);
				setState(94);
				expression();
				setState(95);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new If_StatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				possibleWhitespace();
				setState(98);
				match(IF);
				setState(99);
				match(WHITESPACE);
				setState(100);
				condition();
				setState(101);
				match(WHITESPACE);
				setState(102);
				match(THEN);
				setState(103);
				match(WHITESPACE);
				setState(104);
				commands(0);
				setState(105);
				possibleWhitespace();
				setState(106);
				match(ENDIF);
				}
				break;
			case 3:
				_localctx = new IfElse_StatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				possibleWhitespace();
				setState(109);
				match(IF);
				setState(110);
				match(WHITESPACE);
				setState(111);
				condition();
				setState(112);
				match(WHITESPACE);
				setState(113);
				match(THEN);
				setState(114);
				match(WHITESPACE);
				setState(115);
				((IfElse_StatementContext)_localctx).ifblock = commands(0);
				setState(116);
				match(ELSE);
				setState(117);
				match(WHITESPACE);
				setState(118);
				((IfElse_StatementContext)_localctx).elseblock = commands(0);
				setState(119);
				match(ENDIF);
				}
				break;
			case 4:
				_localctx = new While_StatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				possibleWhitespace();
				setState(122);
				match(WHILE);
				setState(123);
				match(WHITESPACE);
				setState(124);
				condition();
				setState(125);
				match(WHITESPACE);
				setState(126);
				match(DO);
				setState(127);
				match(WHITESPACE);
				setState(128);
				commands(0);
				setState(129);
				match(ENDWHILE);
				}
				break;
			case 5:
				_localctx = new Repeat_StatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				possibleWhitespace();
				setState(132);
				match(REPEAT);
				setState(133);
				match(WHITESPACE);
				setState(134);
				commands(0);
				setState(135);
				match(UNTIL);
				setState(136);
				match(WHITESPACE);
				setState(137);
				condition();
				setState(138);
				match(SEMICOLON);
				}
				break;
			case 6:
				_localctx = new For_StatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(140);
				possibleWhitespace();
				setState(141);
				match(FOR);
				setState(142);
				match(WHITESPACE);
				setState(143);
				match(PIDENTIFIER);
				setState(144);
				match(WHITESPACE);
				setState(145);
				match(FROM);
				setState(146);
				match(WHITESPACE);
				setState(147);
				((For_StatementContext)_localctx).v1 = value();
				setState(148);
				match(WHITESPACE);
				setState(149);
				((For_StatementContext)_localctx).direction = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DOWNTO || _la==TO) ) {
					((For_StatementContext)_localctx).direction = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(150);
				match(WHITESPACE);
				setState(151);
				((For_StatementContext)_localctx).v2 = value();
				setState(152);
				match(WHITESPACE);
				setState(153);
				match(DO);
				setState(154);
				match(WHITESPACE);
				setState(155);
				commands(0);
				setState(156);
				match(ENDFOR);
				}
				break;
			case 7:
				_localctx = new Read_StatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(158);
				possibleWhitespace();
				setState(159);
				match(READ);
				setState(160);
				match(WHITESPACE);
				setState(161);
				identifier();
				setState(162);
				match(SEMICOLON);
				}
				break;
			case 8:
				_localctx = new Write_StatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(164);
				possibleWhitespace();
				setState(165);
				match(WRITE);
				setState(166);
				match(WHITESPACE);
				setState(167);
				value();
				setState(168);
				match(SEMICOLON);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Eval_ValueContext extends ExpressionContext {
		public PossibleWhitespaceContext possibleWhitespace() {
			return getRuleContext(PossibleWhitespaceContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Eval_ValueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterEval_Value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitEval_Value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitEval_Value(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Calculate_ValueContext extends ExpressionContext {
		public ValueContext left;
		public Token operator;
		public ValueContext right;
		public PossibleWhitespaceContext possibleWhitespace() {
			return getRuleContext(PossibleWhitespaceContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(languageParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(languageParser.WHITESPACE, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(languageParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(languageParser.MINUS, 0); }
		public TerminalNode TIMES() { return getToken(languageParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(languageParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(languageParser.MOD, 0); }
		public Calculate_ValueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterCalculate_Value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitCalculate_Value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitCalculate_Value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		int _la;
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new Eval_ValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				possibleWhitespace();
				setState(173);
				value();
				}
				break;
			case 2:
				_localctx = new Calculate_ValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				possibleWhitespace();
				setState(176);
				((Calculate_ValueContext)_localctx).left = value();
				setState(177);
				match(WHITESPACE);
				setState(178);
				((Calculate_ValueContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << DIV) | (1L << TIMES) | (1L << MOD))) != 0)) ) {
					((Calculate_ValueContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(179);
				match(WHITESPACE);
				setState(180);
				((Calculate_ValueContext)_localctx).right = value();
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Calculate_BoolContext extends ConditionContext {
		public ValueContext left;
		public Token oparator;
		public ValueContext right;
		public PossibleWhitespaceContext possibleWhitespace() {
			return getRuleContext(PossibleWhitespaceContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(languageParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(languageParser.WHITESPACE, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode EQ() { return getToken(languageParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(languageParser.NEQ, 0); }
		public TerminalNode LE() { return getToken(languageParser.LE, 0); }
		public TerminalNode GE() { return getToken(languageParser.GE, 0); }
		public TerminalNode LEQ() { return getToken(languageParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(languageParser.GEQ, 0); }
		public Calculate_BoolContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterCalculate_Bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitCalculate_Bool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitCalculate_Bool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condition);
		int _la;
		try {
			_localctx = new Calculate_BoolContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			possibleWhitespace();
			setState(185);
			((Calculate_BoolContext)_localctx).left = value();
			setState(186);
			match(WHITESPACE);
			setState(187);
			((Calculate_BoolContext)_localctx).oparator = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << LE) | (1L << GE) | (1L << LEQ) | (1L << GEQ))) != 0)) ) {
				((Calculate_BoolContext)_localctx).oparator = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(188);
			match(WHITESPACE);
			setState(189);
			((Calculate_BoolContext)_localctx).right = value();
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

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Get_NumberContext extends ValueContext {
		public PossibleWhitespaceContext possibleWhitespace() {
			return getRuleContext(PossibleWhitespaceContext.class,0);
		}
		public TerminalNode NUM() { return getToken(languageParser.NUM, 0); }
		public Get_NumberContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterGet_Number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitGet_Number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitGet_Number(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Get_IdentifierContext extends ValueContext {
		public PossibleWhitespaceContext possibleWhitespace() {
			return getRuleContext(PossibleWhitespaceContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Get_IdentifierContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterGet_Identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitGet_Identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitGet_Identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new Get_NumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				possibleWhitespace();
				setState(192);
				match(NUM);
				}
				break;
			case 2:
				_localctx = new Get_IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				possibleWhitespace();
				setState(195);
				identifier();
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

	public static class IdentifierContext extends ParserRuleContext {
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	 
		public IdentifierContext() { }
		public void copyFrom(IdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Get_PIDENTIFIERContext extends IdentifierContext {
		public PossibleWhitespaceContext possibleWhitespace() {
			return getRuleContext(PossibleWhitespaceContext.class,0);
		}
		public TerminalNode PIDENTIFIER() { return getToken(languageParser.PIDENTIFIER, 0); }
		public Get_PIDENTIFIERContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterGet_PIDENTIFIER(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitGet_PIDENTIFIER(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitGet_PIDENTIFIER(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Get_ArrayMemberByPIDContext extends IdentifierContext {
		public PossibleWhitespaceContext possibleWhitespace() {
			return getRuleContext(PossibleWhitespaceContext.class,0);
		}
		public List<TerminalNode> PIDENTIFIER() { return getTokens(languageParser.PIDENTIFIER); }
		public TerminalNode PIDENTIFIER(int i) {
			return getToken(languageParser.PIDENTIFIER, i);
		}
		public TerminalNode LSQBRACKET() { return getToken(languageParser.LSQBRACKET, 0); }
		public TerminalNode RSQBRACKET() { return getToken(languageParser.RSQBRACKET, 0); }
		public Get_ArrayMemberByPIDContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterGet_ArrayMemberByPID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitGet_ArrayMemberByPID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitGet_ArrayMemberByPID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Get_ArrayMemberByValContext extends IdentifierContext {
		public PossibleWhitespaceContext possibleWhitespace() {
			return getRuleContext(PossibleWhitespaceContext.class,0);
		}
		public TerminalNode PIDENTIFIER() { return getToken(languageParser.PIDENTIFIER, 0); }
		public TerminalNode LSQBRACKET() { return getToken(languageParser.LSQBRACKET, 0); }
		public TerminalNode NUM() { return getToken(languageParser.NUM, 0); }
		public TerminalNode RSQBRACKET() { return getToken(languageParser.RSQBRACKET, 0); }
		public Get_ArrayMemberByValContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterGet_ArrayMemberByVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitGet_ArrayMemberByVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitGet_ArrayMemberByVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_identifier);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new Get_PIDENTIFIERContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				possibleWhitespace();
				setState(200);
				match(PIDENTIFIER);
				}
				break;
			case 2:
				_localctx = new Get_ArrayMemberByPIDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				possibleWhitespace();
				setState(203);
				match(PIDENTIFIER);
				setState(204);
				match(LSQBRACKET);
				setState(205);
				match(PIDENTIFIER);
				setState(206);
				match(RSQBRACKET);
				}
				break;
			case 3:
				_localctx = new Get_ArrayMemberByValContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				possibleWhitespace();
				setState(209);
				match(PIDENTIFIER);
				setState(210);
				match(LSQBRACKET);
				setState(211);
				match(NUM);
				setState(212);
				match(RSQBRACKET);
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

	public static class PossibleWhitespaceContext extends ParserRuleContext {
		public TerminalNode WHITESPACE() { return getToken(languageParser.WHITESPACE, 0); }
		public PossibleWhitespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_possibleWhitespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterPossibleWhitespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitPossibleWhitespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitPossibleWhitespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PossibleWhitespaceContext possibleWhitespace() throws RecognitionException {
		PossibleWhitespaceContext _localctx = new PossibleWhitespaceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_possibleWhitespace);
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(WHITESPACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return commands_sempred((CommandsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean commands_sempred(CommandsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00df\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3$\n\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3-\n\3\5\3/\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4M\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5W\n\5\f\5\16"+
		"\5Z\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ad\n\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00b9\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c8\n\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00d9\n\n\3\13\3\13\5\13\u00dd"+
		"\n\13\3\13\2\3\b\f\2\4\6\b\n\f\16\20\22\24\2\5\3\2\31\32\3\2\36\"\3\2"+
		"#(\2\u00e7\2\26\3\2\2\2\4.\3\2\2\2\6L\3\2\2\2\bN\3\2\2\2\n\u00ac\3\2\2"+
		"\2\f\u00b8\3\2\2\2\16\u00ba\3\2\2\2\20\u00c7\3\2\2\2\22\u00d8\3\2\2\2"+
		"\24\u00dc\3\2\2\2\26\27\5\4\3\2\27\3\3\2\2\2\30\31\5\24\13\2\31\32\7\13"+
		"\2\2\32\33\7)\2\2\33\34\5\6\4\2\34\35\7)\2\2\35\36\7\f\2\2\36\37\7)\2"+
		"\2\37 \5\b\5\2 !\5\24\13\2!#\7\r\2\2\"$\7\2\2\3#\"\3\2\2\2#$\3\2\2\2$"+
		"/\3\2\2\2%&\5\24\13\2&\'\7\f\2\2\'(\7)\2\2()\5\b\5\2)*\7\r\2\2*,\5\24"+
		"\13\2+-\7\2\2\3,+\3\2\2\2,-\3\2\2\2-/\3\2\2\2.\30\3\2\2\2.%\3\2\2\2/\5"+
		"\3\2\2\2\60\61\5\24\13\2\61\62\7*\2\2\62\63\7\b\2\2\63\64\7\7\2\2\64\65"+
		"\7\3\2\2\65\66\7\7\2\2\66\67\7\t\2\2\678\7\6\2\289\7)\2\29:\5\6\4\2:M"+
		"\3\2\2\2;<\5\24\13\2<=\7*\2\2=>\7\6\2\2>?\7)\2\2?@\5\6\4\2@M\3\2\2\2A"+
		"B\5\24\13\2BC\7*\2\2CD\7\b\2\2DE\7\7\2\2EF\7\3\2\2FG\7\7\2\2GH\7\t\2\2"+
		"HM\3\2\2\2IJ\5\24\13\2JK\7*\2\2KM\3\2\2\2L\60\3\2\2\2L;\3\2\2\2LA\3\2"+
		"\2\2LI\3\2\2\2M\7\3\2\2\2NO\b\5\1\2OP\5\n\6\2PQ\7)\2\2QX\3\2\2\2RS\f\4"+
		"\2\2ST\5\n\6\2TU\7)\2\2UW\3\2\2\2VR\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2"+
		"\2\2Y\t\3\2\2\2ZX\3\2\2\2[\\\5\24\13\2\\]\5\22\n\2]^\7)\2\2^_\7\16\2\2"+
		"_`\7)\2\2`a\5\f\7\2ab\7\n\2\2b\u00ad\3\2\2\2cd\5\24\13\2de\7\5\2\2ef\7"+
		")\2\2fg\5\16\b\2gh\7)\2\2hi\7\20\2\2ij\7)\2\2jk\5\b\5\2kl\5\24\13\2lm"+
		"\7\21\2\2m\u00ad\3\2\2\2no\5\24\13\2op\7\5\2\2pq\7)\2\2qr\5\16\b\2rs\7"+
		")\2\2st\7\20\2\2tu\7)\2\2uv\5\b\5\2vw\7\17\2\2wx\7)\2\2xy\5\b\5\2yz\7"+
		"\21\2\2z\u00ad\3\2\2\2{|\5\24\13\2|}\7\22\2\2}~\7)\2\2~\177\5\16\b\2\177"+
		"\u0080\7)\2\2\u0080\u0081\7\24\2\2\u0081\u0082\7)\2\2\u0082\u0083\5\b"+
		"\5\2\u0083\u0084\7\25\2\2\u0084\u00ad\3\2\2\2\u0085\u0086\5\24\13\2\u0086"+
		"\u0087\7\23\2\2\u0087\u0088\7)\2\2\u0088\u0089\5\b\5\2\u0089\u008a\7\26"+
		"\2\2\u008a\u008b\7)\2\2\u008b\u008c\5\16\b\2\u008c\u008d\7\n\2\2\u008d"+
		"\u00ad\3\2\2\2\u008e\u008f\5\24\13\2\u008f\u0090\7\27\2\2\u0090\u0091"+
		"\7)\2\2\u0091\u0092\7*\2\2\u0092\u0093\7)\2\2\u0093\u0094\7\30\2\2\u0094"+
		"\u0095\7)\2\2\u0095\u0096\5\20\t\2\u0096\u0097\7)\2\2\u0097\u0098\t\2"+
		"\2\2\u0098\u0099\7)\2\2\u0099\u009a\5\20\t\2\u009a\u009b\7)\2\2\u009b"+
		"\u009c\7\24\2\2\u009c\u009d\7)\2\2\u009d\u009e\5\b\5\2\u009e\u009f\7\33"+
		"\2\2\u009f\u00ad\3\2\2\2\u00a0\u00a1\5\24\13\2\u00a1\u00a2\7\34\2\2\u00a2"+
		"\u00a3\7)\2\2\u00a3\u00a4\5\22\n\2\u00a4\u00a5\7\n\2\2\u00a5\u00ad\3\2"+
		"\2\2\u00a6\u00a7\5\24\13\2\u00a7\u00a8\7\35\2\2\u00a8\u00a9\7)\2\2\u00a9"+
		"\u00aa\5\20\t\2\u00aa\u00ab\7\n\2\2\u00ab\u00ad\3\2\2\2\u00ac[\3\2\2\2"+
		"\u00acc\3\2\2\2\u00acn\3\2\2\2\u00ac{\3\2\2\2\u00ac\u0085\3\2\2\2\u00ac"+
		"\u008e\3\2\2\2\u00ac\u00a0\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ad\13\3\2\2"+
		"\2\u00ae\u00af\5\24\13\2\u00af\u00b0\5\20\t\2\u00b0\u00b9\3\2\2\2\u00b1"+
		"\u00b2\5\24\13\2\u00b2\u00b3\5\20\t\2\u00b3\u00b4\7)\2\2\u00b4\u00b5\t"+
		"\3\2\2\u00b5\u00b6\7)\2\2\u00b6\u00b7\5\20\t\2\u00b7\u00b9\3\2\2\2\u00b8"+
		"\u00ae\3\2\2\2\u00b8\u00b1\3\2\2\2\u00b9\r\3\2\2\2\u00ba\u00bb\5\24\13"+
		"\2\u00bb\u00bc\5\20\t\2\u00bc\u00bd\7)\2\2\u00bd\u00be\t\4\2\2\u00be\u00bf"+
		"\7)\2\2\u00bf\u00c0\5\20\t\2\u00c0\17\3\2\2\2\u00c1\u00c2\5\24\13\2\u00c2"+
		"\u00c3\7\7\2\2\u00c3\u00c8\3\2\2\2\u00c4\u00c5\5\24\13\2\u00c5\u00c6\5"+
		"\22\n\2\u00c6\u00c8\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c8"+
		"\21\3\2\2\2\u00c9\u00ca\5\24\13\2\u00ca\u00cb\7*\2\2\u00cb\u00d9\3\2\2"+
		"\2\u00cc\u00cd\5\24\13\2\u00cd\u00ce\7*\2\2\u00ce\u00cf\7\b\2\2\u00cf"+
		"\u00d0\7*\2\2\u00d0\u00d1\7\t\2\2\u00d1\u00d9\3\2\2\2\u00d2\u00d3\5\24"+
		"\13\2\u00d3\u00d4\7*\2\2\u00d4\u00d5\7\b\2\2\u00d5\u00d6\7\7\2\2\u00d6"+
		"\u00d7\7\t\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00c9\3\2\2\2\u00d8\u00cc\3\2"+
		"\2\2\u00d8\u00d2\3\2\2\2\u00d9\23\3\2\2\2\u00da\u00dd\7)\2\2\u00db\u00dd"+
		"\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\25\3\2\2\2\f#,"+
		".LX\u00ac\u00b8\u00c7\u00d8\u00dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}