// Generated from D:/Intelli j/lulu2_final/src\lulu2_grammer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lulu2_grammerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, ID=54, INT_CONST=55, REAL_CONST=56, BOOL_CONST=57, STRING_CONST=58, 
		ESCAPE=59, HEX=60, WS=61, BLOCK_COMMENT=62, LINE_COMMENT=63, Nil=64;
	public static final int
		RULE_program = 0, RULE_ft_dcl = 1, RULE_func_dcl = 2, RULE_args = 3, RULE_args_var = 4, 
		RULE_type_dcl = 5, RULE_var_def = 6, RULE_var_val = 7, RULE_ft_def = 8, 
		RULE_type_def = 9, RULE_component = 10, RULE_access_modifier = 11, RULE_fun_def = 12, 
		RULE_block = 13, RULE_stmt = 14, RULE_assign = 15, RULE_var = 16, RULE_ref = 17, 
		RULE_expr = 18, RULE_func_call = 19, RULE_list = 20, RULE_handle_call = 21, 
		RULE_params = 22, RULE_cond_stmt = 23, RULE_switch_body = 24, RULE_loop_stmt = 25, 
		RULE_type = 26, RULE_const_val = 27, RULE_unary_op = 28, RULE_op1 = 29, 
		RULE_op2 = 30, RULE_op3 = 31, RULE_op4 = 32, RULE_bitwise = 33, RULE_logical = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "ft_dcl", "func_dcl", "args", "args_var", "type_dcl", "var_def", 
			"var_val", "ft_def", "type_def", "component", "access_modifier", "fun_def", 
			"block", "stmt", "assign", "var", "ref", "expr", "func_call", "list", 
			"handle_call", "params", "cond_stmt", "switch_body", "loop_stmt", "types",
			"const_val", "unary_op", "op1", "op2", "op3", "op4", "bitwise", "logical"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'declare'", "'{'", "'}'", "'('", "')'", "'='", "';'", "'['", "']'", 
			"','", "'const'", "':'", "'private'", "'public'", "'protected'", "'function'", 
			"'break'", "'continue'", "'destruct'", "'this'", "'super'", "'.'", "'allocate'", 
			"'read'", "'write'", "'if'", "'else'", "'switch'", "'caseof'", "'default'", 
			"'for'", "'while'", "'int'", "'bool'", "'float'", "'string'", "'-'", 
			"'!'", "'~'", "'*'", "'/'", "'%'", "'+'", "'<='", "'>='", "'<'", "'>'", 
			"'=='", "'!='", "'&'", "'|'", "'||'", "'&&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "ID", "INT_CONST", "REAL_CONST", 
			"BOOL_CONST", "STRING_CONST", "ESCAPE", "HEX", "WS", "BLOCK_COMMENT", 
			"LINE_COMMENT", "Nil"
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
	public String getGrammarFileName() { return "lulu2_grammer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public lulu2_grammerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Ft_dclContext ft_dcl() {
			return getRuleContext(Ft_dclContext.class,0);
		}
		public List<Ft_defContext> ft_def() {
			return getRuleContexts(Ft_defContext.class);
		}
		public Ft_defContext ft_def(int i) {
			return getRuleContext(Ft_defContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(70);
				ft_dcl();
				}
			}

			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				ft_def();
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__15) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << ID))) != 0) );
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

	public static class Ft_dclContext extends ParserRuleContext {
		public List<Func_dclContext> func_dcl() {
			return getRuleContexts(Func_dclContext.class);
		}
		public Func_dclContext func_dcl(int i) {
			return getRuleContext(Func_dclContext.class,i);
		}
		public List<Type_dclContext> type_dcl() {
			return getRuleContexts(Type_dclContext.class);
		}
		public Type_dclContext type_dcl(int i) {
			return getRuleContext(Type_dclContext.class,i);
		}
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public Ft_dclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ft_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterFt_dcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitFt_dcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitFt_dcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ft_dclContext ft_dcl() throws RecognitionException {
		Ft_dclContext _localctx = new Ft_dclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ft_dcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__0);
			setState(79);
			match(T__1);
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(83);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(80);
					func_dcl();
					}
					break;
				case 2:
					{
					setState(81);
					type_dcl();
					}
					break;
				case 3:
					{
					setState(82);
					var_def();
					}
					break;
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__10) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << ID))) != 0) );
			setState(87);
			match(T__2);
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

	public static class Func_dclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(lulu2_grammerParser.ID, 0); }
		public List<ArgsContext> args() {
			return getRuleContexts(ArgsContext.class);
		}
		public ArgsContext args(int i) {
			return getRuleContext(ArgsContext.class,i);
		}
		public Args_varContext args_var() {
			return getRuleContext(Args_varContext.class,0);
		}
		public Func_dclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterFunc_dcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitFunc_dcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitFunc_dcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_dclContext func_dcl() throws RecognitionException {
		Func_dclContext _localctx = new Func_dclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_func_dcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(89);
				match(T__3);
				setState(90);
				args(0);
				setState(91);
				match(T__4);
				setState(92);
				match(T__5);
				}
			}

			setState(96);
			match(ID);
			setState(97);
			match(T__3);
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(98);
				args(0);
				}
				break;
			case 2:
				{
				setState(99);
				args_var(0);
				}
				break;
			}
			setState(102);
			match(T__4);
			setState(103);
			match(T__6);
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

	public static class ArgsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		return args(0);
	}

	private ArgsContext args(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgsContext _localctx = new ArgsContext(_ctx, _parentState);
		ArgsContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_args, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(106);
			type();
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(107);
					match(T__7);
					setState(108);
					match(T__8);
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_args);
					setState(114);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(115);
					match(T__9);
					setState(116);
					type();
					setState(121);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(117);
							match(T__7);
							setState(118);
							match(T__8);
							}
							} 
						}
						setState(123);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					}
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class Args_varContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(lulu2_grammerParser.ID, 0); }
		public Args_varContext args_var() {
			return getRuleContext(Args_varContext.class,0);
		}
		public Args_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterArgs_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitArgs_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitArgs_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Args_varContext args_var() throws RecognitionException {
		return args_var(0);
	}

	private Args_varContext args_var(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Args_varContext _localctx = new Args_varContext(_ctx, _parentState);
		Args_varContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_args_var, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(130);
			type();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(131);
				match(T__7);
				setState(132);
				match(T__8);
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Args_varContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_args_var);
					setState(140);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(141);
					match(T__9);
					setState(142);
					type();
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(143);
						match(T__7);
						setState(144);
						match(T__8);
						}
						}
						setState(149);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(150);
					match(ID);
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class Type_dclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(lulu2_grammerParser.ID, 0); }
		public Type_dclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterType_dcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitType_dcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitType_dcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_dclContext type_dcl() throws RecognitionException {
		Type_dclContext _localctx = new Type_dclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type_dcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(ID);
			setState(158);
			match(T__6);
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

	public static class Var_defContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<Var_valContext> var_val() {
			return getRuleContexts(Var_valContext.class);
		}
		public Var_valContext var_val(int i) {
			return getRuleContext(Var_valContext.class,i);
		}
		public Var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterVar_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitVar_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitVar_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(160);
				match(T__10);
				}
			}

			setState(163);
			type();
			setState(164);
			var_val();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(165);
				match(T__9);
				setState(166);
				var_val();
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			match(T__6);
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

	public static class Var_valContext extends ParserRuleContext {
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Var_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterVar_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitVar_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitVar_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_valContext var_val() throws RecognitionException {
		Var_valContext _localctx = new Var_valContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			ref();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(175);
				match(T__5);
				setState(176);
				expr(0);
				}
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

	public static class Ft_defContext extends ParserRuleContext {
		public Type_defContext type_def() {
			return getRuleContext(Type_defContext.class,0);
		}
		public Fun_defContext fun_def() {
			return getRuleContext(Fun_defContext.class,0);
		}
		public Ft_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ft_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterFt_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitFt_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitFt_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ft_defContext ft_def() throws RecognitionException {
		Ft_defContext _localctx = new Ft_defContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ft_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case ID:
				{
				setState(179);
				type_def();
				}
				break;
			case T__3:
			case T__15:
				{
				setState(180);
				fun_def();
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

	public static class Type_defContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(lulu2_grammerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(lulu2_grammerParser.ID, i);
		}
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public Type_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterType_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitType_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitType_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_defContext type_def() throws RecognitionException {
		Type_defContext _localctx = new Type_defContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			type();
			setState(184);
			match(ID);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(185);
				match(T__11);
				setState(186);
				match(ID);
				}
			}

			setState(189);
			match(T__1);
			setState(191); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(190);
				component();
				}
				}
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << ID))) != 0) );
			setState(195);
			match(T__2);
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

	public static class ComponentContext extends ParserRuleContext {
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public Fun_defContext fun_def() {
			return getRuleContext(Fun_defContext.class,0);
		}
		public Access_modifierContext access_modifier() {
			return getRuleContext(Access_modifierContext.class,0);
		}
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_component);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) {
				{
				setState(197);
				access_modifier();
				}
			}

			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case ID:
				{
				setState(200);
				var_def();
				}
				break;
			case T__3:
			case T__15:
				{
				setState(201);
				fun_def();
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

	public static class Access_modifierContext extends ParserRuleContext {
		public Access_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterAccess_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitAccess_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitAccess_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_modifierContext access_modifier() throws RecognitionException {
		Access_modifierContext _localctx = new Access_modifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_access_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Fun_defContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(lulu2_grammerParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<Args_varContext> args_var() {
			return getRuleContexts(Args_varContext.class);
		}
		public Args_varContext args_var(int i) {
			return getRuleContext(Args_varContext.class,i);
		}
		public Fun_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterFun_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitFun_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitFun_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fun_defContext fun_def() throws RecognitionException {
		Fun_defContext _localctx = new Fun_defContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fun_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(206);
				match(T__3);
				setState(207);
				args_var(0);
				setState(208);
				match(T__4);
				setState(209);
				match(T__5);
				}
			}

			setState(213);
			match(T__15);
			setState(214);
			match(ID);
			setState(215);
			match(T__3);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << ID))) != 0)) {
				{
				setState(216);
				args_var(0);
				}
			}

			setState(219);
			match(T__4);
			setState(220);
			block();
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
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(T__1);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__10) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << ID))) != 0)) {
				{
				setState(225);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(223);
					var_def();
					}
					break;
				case 2:
					{
					setState(224);
					stmt();
					}
					break;
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			match(T__2);
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

	public static class StmtContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Cond_stmtContext cond_stmt() {
			return getRuleContext(Cond_stmtContext.class,0);
		}
		public Loop_stmtContext loop_stmt() {
			return getRuleContext(Loop_stmtContext.class,0);
		}
		public TerminalNode ID() { return getToken(lulu2_grammerParser.ID, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stmt);
		int _la;
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				assign();
				setState(233);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				func_call();
				setState(236);
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				cond_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				loop_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(240);
				match(T__16);
				setState(241);
				match(T__6);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(242);
				match(T__17);
				setState(243);
				match(T__6);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(244);
				match(T__18);
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(245);
					match(T__7);
					setState(246);
					match(T__8);
					}
					}
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(252);
				match(ID);
				setState(253);
				match(T__6);
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

	public static class AssignContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
			case T__20:
			case ID:
				{
				setState(256);
				var();
				}
				break;
			case T__3:
				{
				setState(257);
				match(T__3);
				setState(258);
				var();
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(259);
					match(T__9);
					setState(260);
					var();
					}
					}
					setState(265);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(266);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(270);
			match(T__5);
			setState(271);
			expr(0);
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

	public static class VarContext extends ParserRuleContext {
		public List<RefContext> ref() {
			return getRuleContexts(RefContext.class);
		}
		public RefContext ref(int i) {
			return getRuleContext(RefContext.class,i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_var);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19 || _la==T__20) {
				{
				setState(273);
				_la = _input.LA(1);
				if ( !(_la==T__19 || _la==T__20) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(274);
				match(T__21);
				}
			}

			setState(277);
			ref();
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(278);
					match(T__21);
					setState(279);
					ref();
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class RefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(lulu2_grammerParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefContext ref() throws RecognitionException {
		RefContext _localctx = new RefContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ref);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(ID);
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(286);
					match(T__7);
					setState(287);
					expr(0);
					setState(288);
					match(T__8);
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class ExprContext extends ParserRuleContext {
		public Unary_opContext unary_op() {
			return getRuleContext(Unary_opContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Const_valContext const_val() {
			return getRuleContext(Const_valContext.class,0);
		}
		public Handle_callContext handle_call() {
			return getRuleContext(Handle_callContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode Nil() { return getToken(lulu2_grammerParser.Nil, 0); }
		public Op1Context op1() {
			return getRuleContext(Op1Context.class,0);
		}
		public Op2Context op2() {
			return getRuleContext(Op2Context.class,0);
		}
		public Op3Context op3() {
			return getRuleContext(Op3Context.class,0);
		}
		public Op4Context op4() {
			return getRuleContext(Op4Context.class,0);
		}
		public BitwiseContext bitwise() {
			return getRuleContext(BitwiseContext.class,0);
		}
		public LogicalContext logical() {
			return getRuleContext(LogicalContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(296);
				unary_op();
				setState(297);
				expr(14);
				}
				break;
			case 2:
				{
				setState(299);
				match(T__3);
				setState(300);
				expr(0);
				setState(301);
				match(T__4);
				}
				break;
			case 3:
				{
				setState(303);
				const_val();
				}
				break;
			case 4:
				{
				setState(304);
				match(T__22);
				setState(305);
				handle_call();
				}
				break;
			case 5:
				{
				setState(306);
				func_call();
				}
				break;
			case 6:
				{
				setState(307);
				var();
				}
				break;
			case 7:
				{
				setState(308);
				list();
				}
				break;
			case 8:
				{
				setState(309);
				match(Nil);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(336);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(312);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(313);
						op1();
						setState(314);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(316);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(317);
						op2();
						setState(318);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(320);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(321);
						op3();
						setState(322);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(324);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(325);
						op4();
						setState(326);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(328);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(329);
						bitwise();
						setState(330);
						expr(10);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(332);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(333);
						logical();
						setState(334);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class Func_callContext extends ParserRuleContext {
		public Handle_callContext handle_call() {
			return getRuleContext(Handle_callContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitFunc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_func_call);
		try {
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
			case T__20:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(341);
					var();
					setState(342);
					match(T__21);
					}
					break;
				}
				setState(346);
				handle_call();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(T__23);
				setState(348);
				match(T__3);
				setState(349);
				match(T__4);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(350);
				match(T__24);
				setState(351);
				match(T__3);
				setState(352);
				expr(0);
				setState(353);
				match(T__4);
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

	public static class ListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(T__7);
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(358);
				expr(0);
				}
				break;
			case 2:
				{
				setState(359);
				list();
				}
				break;
			}
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(362);
				match(T__9);
				setState(365);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(363);
					expr(0);
					}
					break;
				case 2:
					{
					setState(364);
					list();
					}
					break;
				}
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(372);
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

	public static class Handle_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(lulu2_grammerParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Handle_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handle_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterHandle_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitHandle_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitHandle_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Handle_callContext handle_call() throws RecognitionException {
		Handle_callContext _localctx = new Handle_callContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_handle_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(ID);
			setState(375);
			match(T__3);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__7 - 4)) | (1L << (T__19 - 4)) | (1L << (T__20 - 4)) | (1L << (T__22 - 4)) | (1L << (T__23 - 4)) | (1L << (T__24 - 4)) | (1L << (T__36 - 4)) | (1L << (T__37 - 4)) | (1L << (T__38 - 4)) | (1L << (ID - 4)) | (1L << (INT_CONST - 4)) | (1L << (REAL_CONST - 4)) | (1L << (BOOL_CONST - 4)) | (1L << (STRING_CONST - 4)) | (1L << (Nil - 4)))) != 0)) {
				{
				setState(376);
				params();
				}
			}

			setState(379);
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

	public static class ParamsContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_params);
		try {
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				expr(0);
				setState(383);
				match(T__9);
				setState(384);
				params();
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

	public static class Cond_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Switch_bodyContext switch_body() {
			return getRuleContext(Switch_bodyContext.class,0);
		}
		public Cond_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterCond_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitCond_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitCond_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_stmtContext cond_stmt() throws RecognitionException {
		Cond_stmtContext _localctx = new Cond_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cond_stmt);
		try {
			setState(407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				match(T__25);
				setState(389);
				expr(0);
				setState(392);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(390);
					block();
					}
					break;
				case T__3:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__23:
				case T__24:
				case T__25:
				case T__27:
				case T__30:
				case T__31:
				case ID:
					{
					setState(391);
					stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(399);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(394);
					match(T__26);
					setState(397);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
						{
						setState(395);
						block();
						}
						break;
					case T__3:
					case T__16:
					case T__17:
					case T__18:
					case T__19:
					case T__20:
					case T__23:
					case T__24:
					case T__25:
					case T__27:
					case T__30:
					case T__31:
					case ID:
						{
						setState(396);
						stmt();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				match(T__27);
				setState(402);
				var();
				setState(403);
				match(T__1);
				setState(404);
				switch_body();
				setState(405);
				match(T__2);
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

	public static class Switch_bodyContext extends ParserRuleContext {
		public List<TerminalNode> INT_CONST() { return getTokens(lulu2_grammerParser.INT_CONST); }
		public TerminalNode INT_CONST(int i) {
			return getToken(lulu2_grammerParser.INT_CONST, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public Switch_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterSwitch_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitSwitch_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitSwitch_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_bodyContext switch_body() throws RecognitionException {
		Switch_bodyContext _localctx = new Switch_bodyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_switch_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(409);
				match(T__28);
				setState(410);
				match(INT_CONST);
				setState(411);
				match(T__11);
				setState(412);
				block();
				}
				}
				setState(415); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__28 );
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(417);
				match(T__29);
				setState(418);
				match(T__11);
				setState(419);
				block();
				}
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

	public static class Loop_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Loop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterLoop_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitLoop_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitLoop_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_stmtContext loop_stmt() throws RecognitionException {
		Loop_stmtContext _localctx = new Loop_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_loop_stmt);
		int _la;
		try {
			setState(441);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				match(T__30);
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__19) | (1L << T__20) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << ID))) != 0)) {
					{
					setState(424);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						setState(423);
						type();
						}
						break;
					}
					setState(426);
					assign();
					}
				}

				setState(429);
				match(T__6);
				setState(430);
				expr(0);
				setState(431);
				match(T__6);
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__19) | (1L << T__20) | (1L << ID))) != 0)) {
					{
					setState(432);
					assign();
					}
				}

				setState(435);
				block();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				match(T__31);
				setState(438);
				expr(0);
				setState(439);
				block();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(lulu2_grammerParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Const_valContext extends ParserRuleContext {
		public TerminalNode INT_CONST() { return getToken(lulu2_grammerParser.INT_CONST, 0); }
		public TerminalNode REAL_CONST() { return getToken(lulu2_grammerParser.REAL_CONST, 0); }
		public TerminalNode BOOL_CONST() { return getToken(lulu2_grammerParser.BOOL_CONST, 0); }
		public TerminalNode STRING_CONST() { return getToken(lulu2_grammerParser.STRING_CONST, 0); }
		public Const_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterConst_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitConst_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitConst_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_valContext const_val() throws RecognitionException {
		Const_valContext _localctx = new Const_valContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_const_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_CONST) | (1L << REAL_CONST) | (1L << BOOL_CONST) | (1L << STRING_CONST))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Unary_opContext extends ParserRuleContext {
		public Unary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterUnary_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitUnary_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitUnary_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_opContext unary_op() throws RecognitionException {
		Unary_opContext _localctx = new Unary_opContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_unary_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Op1Context extends ParserRuleContext {
		public Op1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterOp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitOp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitOp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op1Context op1() throws RecognitionException {
		Op1Context _localctx = new Op1Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_op1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Op2Context extends ParserRuleContext {
		public Op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterOp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitOp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitOp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op2Context op2() throws RecognitionException {
		Op2Context _localctx = new Op2Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_op2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_la = _input.LA(1);
			if ( !(_la==T__36 || _la==T__42) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Op3Context extends ParserRuleContext {
		public Op3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterOp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitOp3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitOp3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op3Context op3() throws RecognitionException {
		Op3Context _localctx = new Op3Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_op3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Op4Context extends ParserRuleContext {
		public Op4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterOp4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitOp4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitOp4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op4Context op4() throws RecognitionException {
		Op4Context _localctx = new Op4Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_op4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			_la = _input.LA(1);
			if ( !(_la==T__47 || _la==T__48) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class BitwiseContext extends ParserRuleContext {
		public BitwiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterBitwise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitBitwise(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitBitwise(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitwiseContext bitwise() throws RecognitionException {
		BitwiseContext _localctx = new BitwiseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_bitwise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			_la = _input.LA(1);
			if ( !(_la==T__49 || _la==T__50) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class LogicalContext extends ParserRuleContext {
		public LogicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).enterLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2_grammerListener ) ((lulu2_grammerListener)listener).exitLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2_grammerVisitor ) return ((lulu2_grammerVisitor<? extends T>)visitor).visitLogical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalContext logical() throws RecognitionException {
		LogicalContext _localctx = new LogicalContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_logical);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_la = _input.LA(1);
			if ( !(_la==T__51 || _la==T__52) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return args_sempred((ArgsContext)_localctx, predIndex);
		case 4:
			return args_var_sempred((Args_varContext)_localctx, predIndex);
		case 18:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean args_sempred(ArgsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean args_var_sempred(Args_varContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u01d0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\5\2J\n\2\3\2\6\2M\n\2\r\2\16\2N\3\3\3\3\3"+
		"\3\3\3\3\3\6\3V\n\3\r\3\16\3W\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4a\n\4\3\4"+
		"\3\4\3\4\3\4\5\4g\n\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5p\n\5\f\5\16\5s\13"+
		"\5\3\5\3\5\3\5\3\5\3\5\7\5z\n\5\f\5\16\5}\13\5\7\5\177\n\5\f\5\16\5\u0082"+
		"\13\5\3\6\3\6\3\6\3\6\7\6\u0088\n\6\f\6\16\6\u008b\13\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\7\6\u0094\n\6\f\6\16\6\u0097\13\6\3\6\3\6\7\6\u009b\n\6"+
		"\f\6\16\6\u009e\13\6\3\7\3\7\3\7\3\b\5\b\u00a4\n\b\3\b\3\b\3\b\3\b\7\b"+
		"\u00aa\n\b\f\b\16\b\u00ad\13\b\3\b\3\b\3\t\3\t\3\t\5\t\u00b4\n\t\3\n\3"+
		"\n\5\n\u00b8\n\n\3\13\3\13\3\13\3\13\5\13\u00be\n\13\3\13\3\13\6\13\u00c2"+
		"\n\13\r\13\16\13\u00c3\3\13\3\13\3\f\5\f\u00c9\n\f\3\f\3\f\5\f\u00cd\n"+
		"\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u00d6\n\16\3\16\3\16\3\16\3\16"+
		"\5\16\u00dc\n\16\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u00e4\n\17\f\17\16"+
		"\17\u00e7\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00fa\n\20\f\20\16\20\u00fd\13\20"+
		"\3\20\3\20\5\20\u0101\n\20\3\21\3\21\3\21\3\21\3\21\7\21\u0108\n\21\f"+
		"\21\16\21\u010b\13\21\3\21\3\21\5\21\u010f\n\21\3\21\3\21\3\21\3\22\3"+
		"\22\5\22\u0116\n\22\3\22\3\22\3\22\7\22\u011b\n\22\f\22\16\22\u011e\13"+
		"\22\3\23\3\23\3\23\3\23\3\23\7\23\u0125\n\23\f\23\16\23\u0128\13\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\5\24\u0139\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\7\24\u0153\n\24\f\24\16\24\u0156\13\24\3\25\3\25\3\25\5\25\u015b\n\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0166\n\25\3\26\3\26"+
		"\3\26\5\26\u016b\n\26\3\26\3\26\3\26\5\26\u0170\n\26\7\26\u0172\n\26\f"+
		"\26\16\26\u0175\13\26\3\26\3\26\3\27\3\27\3\27\5\27\u017c\n\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\5\30\u0185\n\30\3\31\3\31\3\31\3\31\5\31"+
		"\u018b\n\31\3\31\3\31\3\31\5\31\u0190\n\31\5\31\u0192\n\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\5\31\u019a\n\31\3\32\3\32\3\32\3\32\6\32\u01a0\n\32"+
		"\r\32\16\32\u01a1\3\32\3\32\3\32\5\32\u01a7\n\32\3\33\3\33\5\33\u01ab"+
		"\n\33\3\33\5\33\u01ae\n\33\3\33\3\33\3\33\3\33\5\33\u01b4\n\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\5\33\u01bc\n\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\2\5\b\n&%\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2\r\3\2\17\21\3"+
		"\2\26\27\4\2#&88\3\29<\3\2\')\3\2*,\4\2\'\'--\3\2.\61\3\2\62\63\3\2\64"+
		"\65\3\2\66\67\2\u01f1\2I\3\2\2\2\4P\3\2\2\2\6`\3\2\2\2\bk\3\2\2\2\n\u0083"+
		"\3\2\2\2\f\u009f\3\2\2\2\16\u00a3\3\2\2\2\20\u00b0\3\2\2\2\22\u00b7\3"+
		"\2\2\2\24\u00b9\3\2\2\2\26\u00c8\3\2\2\2\30\u00ce\3\2\2\2\32\u00d5\3\2"+
		"\2\2\34\u00e0\3\2\2\2\36\u0100\3\2\2\2 \u010e\3\2\2\2\"\u0115\3\2\2\2"+
		"$\u011f\3\2\2\2&\u0138\3\2\2\2(\u0165\3\2\2\2*\u0167\3\2\2\2,\u0178\3"+
		"\2\2\2.\u0184\3\2\2\2\60\u0199\3\2\2\2\62\u019f\3\2\2\2\64\u01bb\3\2\2"+
		"\2\66\u01bd\3\2\2\28\u01bf\3\2\2\2:\u01c1\3\2\2\2<\u01c3\3\2\2\2>\u01c5"+
		"\3\2\2\2@\u01c7\3\2\2\2B\u01c9\3\2\2\2D\u01cb\3\2\2\2F\u01cd\3\2\2\2H"+
		"J\5\4\3\2IH\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KM\5\22\n\2LK\3\2\2\2MN\3\2\2\2"+
		"NL\3\2\2\2NO\3\2\2\2O\3\3\2\2\2PQ\7\3\2\2QU\7\4\2\2RV\5\6\4\2SV\5\f\7"+
		"\2TV\5\16\b\2UR\3\2\2\2US\3\2\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2"+
		"\2\2XY\3\2\2\2YZ\7\5\2\2Z\5\3\2\2\2[\\\7\6\2\2\\]\5\b\5\2]^\7\7\2\2^_"+
		"\7\b\2\2_a\3\2\2\2`[\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\78\2\2cf\7\6\2\2dg"+
		"\5\b\5\2eg\5\n\6\2fd\3\2\2\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7\7\2\2i"+
		"j\7\t\2\2j\7\3\2\2\2kl\b\5\1\2lq\5\66\34\2mn\7\n\2\2np\7\13\2\2om\3\2"+
		"\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\u0080\3\2\2\2sq\3\2\2\2tu\f\3\2\2"+
		"uv\7\f\2\2v{\5\66\34\2wx\7\n\2\2xz\7\13\2\2yw\3\2\2\2z}\3\2\2\2{y\3\2"+
		"\2\2{|\3\2\2\2|\177\3\2\2\2}{\3\2\2\2~t\3\2\2\2\177\u0082\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\t\3\2\2\2\u0082\u0080\3\2\2\2\u0083"+
		"\u0084\b\6\1\2\u0084\u0089\5\66\34\2\u0085\u0086\7\n\2\2\u0086\u0088\7"+
		"\13\2\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\78"+
		"\2\2\u008d\u009c\3\2\2\2\u008e\u008f\f\3\2\2\u008f\u0090\7\f\2\2\u0090"+
		"\u0095\5\66\34\2\u0091\u0092\7\n\2\2\u0092\u0094\7\13\2\2\u0093\u0091"+
		"\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\78\2\2\u0099\u009b\3\2"+
		"\2\2\u009a\u008e\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\13\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\78\2\2"+
		"\u00a0\u00a1\7\t\2\2\u00a1\r\3\2\2\2\u00a2\u00a4\7\r\2\2\u00a3\u00a2\3"+
		"\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\5\66\34\2\u00a6"+
		"\u00ab\5\20\t\2\u00a7\u00a8\7\f\2\2\u00a8\u00aa\5\20\t\2\u00a9\u00a7\3"+
		"\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\7\t\2\2\u00af\17\3\2\2"+
		"\2\u00b0\u00b3\5$\23\2\u00b1\u00b2\7\b\2\2\u00b2\u00b4\5&\24\2\u00b3\u00b1"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\21\3\2\2\2\u00b5\u00b8\5\24\13\2\u00b6"+
		"\u00b8\5\32\16\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\23\3\2"+
		"\2\2\u00b9\u00ba\5\66\34\2\u00ba\u00bd\78\2\2\u00bb\u00bc\7\16\2\2\u00bc"+
		"\u00be\78\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c1\7\4\2\2\u00c0\u00c2\5\26\f\2\u00c1\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c6\7\5\2\2\u00c6\25\3\2\2\2\u00c7\u00c9\5\30\r\2\u00c8\u00c7"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00cd\5\16\b\2"+
		"\u00cb\u00cd\5\32\16\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\27"+
		"\3\2\2\2\u00ce\u00cf\t\2\2\2\u00cf\31\3\2\2\2\u00d0\u00d1\7\6\2\2\u00d1"+
		"\u00d2\5\n\6\2\u00d2\u00d3\7\7\2\2\u00d3\u00d4\7\b\2\2\u00d4\u00d6\3\2"+
		"\2\2\u00d5\u00d0\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d8\7\22\2\2\u00d8\u00d9\78\2\2\u00d9\u00db\7\6\2\2\u00da\u00dc\5\n"+
		"\6\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00de\7\7\2\2\u00de\u00df\5\34\17\2\u00df\33\3\2\2\2\u00e0\u00e5\7\4"+
		"\2\2\u00e1\u00e4\5\16\b\2\u00e2\u00e4\5\36\20\2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7\5\2\2\u00e9"+
		"\35\3\2\2\2\u00ea\u00eb\5 \21\2\u00eb\u00ec\7\t\2\2\u00ec\u0101\3\2\2"+
		"\2\u00ed\u00ee\5(\25\2\u00ee\u00ef\7\t\2\2\u00ef\u0101\3\2\2\2\u00f0\u0101"+
		"\5\60\31\2\u00f1\u0101\5\64\33\2\u00f2\u00f3\7\23\2\2\u00f3\u0101\7\t"+
		"\2\2\u00f4\u00f5\7\24\2\2\u00f5\u0101\7\t\2\2\u00f6\u00fb\7\25\2\2\u00f7"+
		"\u00f8\7\n\2\2\u00f8\u00fa\7\13\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fd\3"+
		"\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fe\u00ff\78\2\2\u00ff\u0101\7\t\2\2\u0100\u00ea\3\2"+
		"\2\2\u0100\u00ed\3\2\2\2\u0100\u00f0\3\2\2\2\u0100\u00f1\3\2\2\2\u0100"+
		"\u00f2\3\2\2\2\u0100\u00f4\3\2\2\2\u0100\u00f6\3\2\2\2\u0101\37\3\2\2"+
		"\2\u0102\u010f\5\"\22\2\u0103\u0104\7\6\2\2\u0104\u0109\5\"\22\2\u0105"+
		"\u0106\7\f\2\2\u0106\u0108\5\"\22\2\u0107\u0105\3\2\2\2\u0108\u010b\3"+
		"\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010c\u010d\7\7\2\2\u010d\u010f\3\2\2\2\u010e\u0102\3\2"+
		"\2\2\u010e\u0103\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\7\b\2\2\u0111"+
		"\u0112\5&\24\2\u0112!\3\2\2\2\u0113\u0114\t\3\2\2\u0114\u0116\7\30\2\2"+
		"\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u011c"+
		"\5$\23\2\u0118\u0119\7\30\2\2\u0119\u011b\5$\23\2\u011a\u0118\3\2\2\2"+
		"\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d#\3"+
		"\2\2\2\u011e\u011c\3\2\2\2\u011f\u0126\78\2\2\u0120\u0121\7\n\2\2\u0121"+
		"\u0122\5&\24\2\u0122\u0123\7\13\2\2\u0123\u0125\3\2\2\2\u0124\u0120\3"+
		"\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"%\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\b\24\1\2\u012a\u012b\5:\36\2"+
		"\u012b\u012c\5&\24\20\u012c\u0139\3\2\2\2\u012d\u012e\7\6\2\2\u012e\u012f"+
		"\5&\24\2\u012f\u0130\7\7\2\2\u0130\u0139\3\2\2\2\u0131\u0139\58\35\2\u0132"+
		"\u0133\7\31\2\2\u0133\u0139\5,\27\2\u0134\u0139\5(\25\2\u0135\u0139\5"+
		"\"\22\2\u0136\u0139\5*\26\2\u0137\u0139\7B\2\2\u0138\u0129\3\2\2\2\u0138"+
		"\u012d\3\2\2\2\u0138\u0131\3\2\2\2\u0138\u0132\3\2\2\2\u0138\u0134\3\2"+
		"\2\2\u0138\u0135\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139"+
		"\u0154\3\2\2\2\u013a\u013b\f\17\2\2\u013b\u013c\5<\37\2\u013c\u013d\5"+
		"&\24\20\u013d\u0153\3\2\2\2\u013e\u013f\f\16\2\2\u013f\u0140\5> \2\u0140"+
		"\u0141\5&\24\17\u0141\u0153\3\2\2\2\u0142\u0143\f\r\2\2\u0143\u0144\5"+
		"@!\2\u0144\u0145\5&\24\16\u0145\u0153\3\2\2\2\u0146\u0147\f\f\2\2\u0147"+
		"\u0148\5B\"\2\u0148\u0149\5&\24\r\u0149\u0153\3\2\2\2\u014a\u014b\f\13"+
		"\2\2\u014b\u014c\5D#\2\u014c\u014d\5&\24\f\u014d\u0153\3\2\2\2\u014e\u014f"+
		"\f\n\2\2\u014f\u0150\5F$\2\u0150\u0151\5&\24\13\u0151\u0153\3\2\2\2\u0152"+
		"\u013a\3\2\2\2\u0152\u013e\3\2\2\2\u0152\u0142\3\2\2\2\u0152\u0146\3\2"+
		"\2\2\u0152\u014a\3\2\2\2\u0152\u014e\3\2\2\2\u0153\u0156\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\'\3\2\2\2\u0156\u0154\3\2\2\2"+
		"\u0157\u0158\5\"\22\2\u0158\u0159\7\30\2\2\u0159\u015b\3\2\2\2\u015a\u0157"+
		"\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u0166\5,\27\2\u015d"+
		"\u015e\7\32\2\2\u015e\u015f\7\6\2\2\u015f\u0166\7\7\2\2\u0160\u0161\7"+
		"\33\2\2\u0161\u0162\7\6\2\2\u0162\u0163\5&\24\2\u0163\u0164\7\7\2\2\u0164"+
		"\u0166\3\2\2\2\u0165\u015a\3\2\2\2\u0165\u015d\3\2\2\2\u0165\u0160\3\2"+
		"\2\2\u0166)\3\2\2\2\u0167\u016a\7\n\2\2\u0168\u016b\5&\24\2\u0169\u016b"+
		"\5*\26\2\u016a\u0168\3\2\2\2\u016a\u0169\3\2\2\2\u016b\u0173\3\2\2\2\u016c"+
		"\u016f\7\f\2\2\u016d\u0170\5&\24\2\u016e\u0170\5*\26\2\u016f\u016d\3\2"+
		"\2\2\u016f\u016e\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u016c\3\2\2\2\u0172"+
		"\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2"+
		"\2\2\u0175\u0173\3\2\2\2\u0176\u0177\7\13\2\2\u0177+\3\2\2\2\u0178\u0179"+
		"\78\2\2\u0179\u017b\7\6\2\2\u017a\u017c\5.\30\2\u017b\u017a\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\7\7\2\2\u017e-\3\2\2\2"+
		"\u017f\u0185\5&\24\2\u0180\u0181\5&\24\2\u0181\u0182\7\f\2\2\u0182\u0183"+
		"\5.\30\2\u0183\u0185\3\2\2\2\u0184\u017f\3\2\2\2\u0184\u0180\3\2\2\2\u0185"+
		"/\3\2\2\2\u0186\u0187\7\34\2\2\u0187\u018a\5&\24\2\u0188\u018b\5\34\17"+
		"\2\u0189\u018b\5\36\20\2\u018a\u0188\3\2\2\2\u018a\u0189\3\2\2\2\u018b"+
		"\u0191\3\2\2\2\u018c\u018f\7\35\2\2\u018d\u0190\5\34\17\2\u018e\u0190"+
		"\5\36\20\2\u018f\u018d\3\2\2\2\u018f\u018e\3\2\2\2\u0190\u0192\3\2\2\2"+
		"\u0191\u018c\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u019a\3\2\2\2\u0193\u0194"+
		"\7\36\2\2\u0194\u0195\5\"\22\2\u0195\u0196\7\4\2\2\u0196\u0197\5\62\32"+
		"\2\u0197\u0198\7\5\2\2\u0198\u019a\3\2\2\2\u0199\u0186\3\2\2\2\u0199\u0193"+
		"\3\2\2\2\u019a\61\3\2\2\2\u019b\u019c\7\37\2\2\u019c\u019d\79\2\2\u019d"+
		"\u019e\7\16\2\2\u019e\u01a0\5\34\17\2\u019f\u019b\3\2\2\2\u01a0\u01a1"+
		"\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a6\3\2\2\2\u01a3"+
		"\u01a4\7 \2\2\u01a4\u01a5\7\16\2\2\u01a5\u01a7\5\34\17\2\u01a6\u01a3\3"+
		"\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\63\3\2\2\2\u01a8\u01ad\7!\2\2\u01a9\u01ab"+
		"\5\66\34\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2\2\2"+
		"\u01ac\u01ae\5 \21\2\u01ad\u01aa\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af"+
		"\3\2\2\2\u01af\u01b0\7\t\2\2\u01b0\u01b1\5&\24\2\u01b1\u01b3\7\t\2\2\u01b2"+
		"\u01b4\5 \21\2\u01b3\u01b2\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\3\2"+
		"\2\2\u01b5\u01b6\5\34\17\2\u01b6\u01bc\3\2\2\2\u01b7\u01b8\7\"\2\2\u01b8"+
		"\u01b9\5&\24\2\u01b9\u01ba\5\34\17\2\u01ba\u01bc\3\2\2\2\u01bb\u01a8\3"+
		"\2\2\2\u01bb\u01b7\3\2\2\2\u01bc\65\3\2\2\2\u01bd\u01be\t\4\2\2\u01be"+
		"\67\3\2\2\2\u01bf\u01c0\t\5\2\2\u01c09\3\2\2\2\u01c1\u01c2\t\6\2\2\u01c2"+
		";\3\2\2\2\u01c3\u01c4\t\7\2\2\u01c4=\3\2\2\2\u01c5\u01c6\t\b\2\2\u01c6"+
		"?\3\2\2\2\u01c7\u01c8\t\t\2\2\u01c8A\3\2\2\2\u01c9\u01ca\t\n\2\2\u01ca"+
		"C\3\2\2\2\u01cb\u01cc\t\13\2\2\u01ccE\3\2\2\2\u01cd\u01ce\t\f\2\2\u01ce"+
		"G\3\2\2\2\65INUW`fq{\u0080\u0089\u0095\u009c\u00a3\u00ab\u00b3\u00b7\u00bd"+
		"\u00c3\u00c8\u00cc\u00d5\u00db\u00e3\u00e5\u00fb\u0100\u0109\u010e\u0115"+
		"\u011c\u0126\u0138\u0152\u0154\u015a\u0165\u016a\u016f\u0173\u017b\u0184"+
		"\u018a\u018f\u0191\u0199\u01a1\u01a6\u01aa\u01ad\u01b3\u01bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}