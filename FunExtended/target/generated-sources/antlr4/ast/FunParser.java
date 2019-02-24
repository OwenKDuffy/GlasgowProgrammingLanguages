// Generated from Fun.g4 by ANTLR 4.4

package ast;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FunParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, BOOL=2, ELSE=3, FALSE=4, FUNC=5, IF=6, INT=7, PROC=8, RETURN=9, 
		TRUE=10, WHILE=11, FOR=12, TO=13, CASE=14, SWITCH=15, EQ=16, LT=17, GT=18, 
		PLUS=19, MINUS=20, TIMES=21, DIV=22, NOT=23, ASSN=24, LPAR=25, RPAR=26, 
		COLON=27, DOT=28, COMMA=29, NUM=30, ID=31, SPACE=32, EOL=33, COMMENT=34;
	public static final String[] tokenNames = {
		"<INVALID>", "'default'", "'bool'", "'else'", "'false'", "'func'", "'if'", 
		"'int'", "'proc'", "'return'", "'true'", "'while'", "'for'", "'to'", "'case'", 
		"'switch'", "'=='", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "'not'", 
		"'='", "'('", "')'", "':'", "'.'", "','", "NUM", "ID", "SPACE", "EOL", 
		"COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_proc_decl = 1, RULE_formal_decl_seq = 2, RULE_formal_decl = 3, 
		RULE_var_decl = 4, RULE_type = 5, RULE_com = 6, RULE_default_case = 7, 
		RULE_case_stmt = 8, RULE_range = 9, RULE_seq_com = 10, RULE_expr = 11, 
		RULE_sec_expr = 12, RULE_prim_expr = 13, RULE_actual_seq = 14;
	public static final String[] ruleNames = {
		"program", "proc_decl", "formal_decl_seq", "formal_decl", "var_decl", 
		"type", "com", "default_case", "case_stmt", "range", "seq_com", "expr", 
		"sec_expr", "prim_expr", "actual_seq"
	};

	@Override
	public String getGrammarFileName() { return "Fun.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FunParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
	public static class ProgContext extends ProgramContext {
		public TerminalNode EOF() { return getToken(FunParser.EOF, 0); }
		public List<Proc_declContext> proc_decl() {
			return getRuleContexts(Proc_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Proc_declContext proc_decl(int i) {
			return getRuleContext(Proc_declContext.class,i);
		}
		public ProgContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitProg(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new ProgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOOL || _la==INT) {
				{
				{
				setState(30); var_decl();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36); proc_decl();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNC || _la==PROC );
			setState(41); match(EOF);
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

	public static class Proc_declContext extends ParserRuleContext {
		public Proc_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_decl; }
	 
		public Proc_declContext() { }
		public void copyFrom(Proc_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProcContext extends Proc_declContext {
		public TerminalNode ID() { return getToken(FunParser.ID, 0); }
		public TerminalNode DOT() { return getToken(FunParser.DOT, 0); }
		public TerminalNode PROC() { return getToken(FunParser.PROC, 0); }
		public TerminalNode COLON() { return getToken(FunParser.COLON, 0); }
		public Formal_decl_seqContext formal_decl_seq() {
			return getRuleContext(Formal_decl_seqContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(FunParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunParser.RPAR, 0); }
		public Seq_comContext seq_com() {
			return getRuleContext(Seq_comContext.class,0);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public ProcContext(Proc_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitProc(this);
		}
	}
	public static class FuncContext extends Proc_declContext {
		public TerminalNode COLON() { return getToken(FunParser.COLON, 0); }
		public TerminalNode LPAR() { return getToken(FunParser.LPAR, 0); }
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public TerminalNode ID() { return getToken(FunParser.ID, 0); }
		public TerminalNode DOT() { return getToken(FunParser.DOT, 0); }
		public TerminalNode RETURN() { return getToken(FunParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Formal_decl_seqContext formal_decl_seq() {
			return getRuleContext(Formal_decl_seqContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunParser.RPAR, 0); }
		public Seq_comContext seq_com() {
			return getRuleContext(Seq_comContext.class,0);
		}
		public TerminalNode FUNC() { return getToken(FunParser.FUNC, 0); }
		public FuncContext(Proc_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitFunc(this);
		}
	}

	public final Proc_declContext proc_decl() throws RecognitionException {
		Proc_declContext _localctx = new Proc_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_proc_decl);
		int _la;
		try {
			setState(80);
			switch (_input.LA(1)) {
			case PROC:
				_localctx = new ProcContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(43); match(PROC);
				setState(44); match(ID);
				setState(45); match(LPAR);
				setState(47);
				_la = _input.LA(1);
				if (_la==BOOL || _la==INT) {
					{
					setState(46); formal_decl_seq();
					}
				}

				setState(49); match(RPAR);
				setState(50); match(COLON);
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BOOL || _la==INT) {
					{
					{
					setState(51); var_decl();
					}
					}
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(57); seq_com();
				setState(58); match(DOT);
				}
				break;
			case FUNC:
				_localctx = new FuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60); match(FUNC);
				setState(61); type();
				setState(62); match(ID);
				setState(63); match(LPAR);
				setState(65);
				_la = _input.LA(1);
				if (_la==BOOL || _la==INT) {
					{
					setState(64); formal_decl_seq();
					}
				}

				setState(67); match(RPAR);
				setState(68); match(COLON);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BOOL || _la==INT) {
					{
					{
					setState(69); var_decl();
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(75); seq_com();
				setState(76); match(RETURN);
				setState(77); expr();
				setState(78); match(DOT);
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

	public static class Formal_decl_seqContext extends ParserRuleContext {
		public Formal_decl_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_decl_seq; }
	 
		public Formal_decl_seqContext() { }
		public void copyFrom(Formal_decl_seqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FormalseqContext extends Formal_decl_seqContext {
		public List<TerminalNode> COMMA() { return getTokens(FunParser.COMMA); }
		public List<Formal_declContext> formal_decl() {
			return getRuleContexts(Formal_declContext.class);
		}
		public Formal_declContext formal_decl(int i) {
			return getRuleContext(Formal_declContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(FunParser.COMMA, i);
		}
		public FormalseqContext(Formal_decl_seqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterFormalseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitFormalseq(this);
		}
	}

	public final Formal_decl_seqContext formal_decl_seq() throws RecognitionException {
		Formal_decl_seqContext _localctx = new Formal_decl_seqContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_formal_decl_seq);
		int _la;
		try {
			_localctx = new FormalseqContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(82); formal_decl();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(83); match(COMMA);
				setState(84); formal_decl();
				}
				}
				setState(89);
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

	public static class Formal_declContext extends ParserRuleContext {
		public Formal_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_decl; }
	 
		public Formal_declContext() { }
		public void copyFrom(Formal_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FormalContext extends Formal_declContext {
		public TerminalNode ID() { return getToken(FunParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FormalContext(Formal_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitFormal(this);
		}
	}

	public final Formal_declContext formal_decl() throws RecognitionException {
		Formal_declContext _localctx = new Formal_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formal_decl);
		try {
			_localctx = new FormalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(90); type();
			setState(91); match(ID);
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

	public static class Var_declContext extends ParserRuleContext {
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	 
		public Var_declContext() { }
		public void copyFrom(Var_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarContext extends Var_declContext {
		public TerminalNode ID() { return getToken(FunParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ASSN() { return getToken(FunParser.ASSN, 0); }
		public VarContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitVar(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_decl);
		try {
			_localctx = new VarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(93); type();
			setState(94); match(ID);
			setState(95); match(ASSN);
			setState(96); expr();
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolContext extends TypeContext {
		public TerminalNode BOOL() { return getToken(FunParser.BOOL, 0); }
		public BoolContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitBool(this);
		}
	}
	public static class IntContext extends TypeContext {
		public TerminalNode INT() { return getToken(FunParser.INT, 0); }
		public IntContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitInt(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(100);
			switch (_input.LA(1)) {
			case BOOL:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(98); match(BOOL);
				}
				break;
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(99); match(INT);
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

	public static class ComContext extends ParserRuleContext {
		public ComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_com; }
	 
		public ComContext() { }
		public void copyFrom(ComContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssnContext extends ComContext {
		public TerminalNode ID() { return getToken(FunParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASSN() { return getToken(FunParser.ASSN, 0); }
		public AssnContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterAssn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitAssn(this);
		}
	}
	public static class ProccallContext extends ComContext {
		public TerminalNode ID() { return getToken(FunParser.ID, 0); }
		public Actual_seqContext actual_seq() {
			return getRuleContext(Actual_seqContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(FunParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunParser.RPAR, 0); }
		public ProccallContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterProccall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitProccall(this);
		}
	}
	public static class ForloopContext extends ComContext {
		public TerminalNode ID() { return getToken(FunParser.ID, 0); }
		public TerminalNode DOT() { return getToken(FunParser.DOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COLON() { return getToken(FunParser.COLON, 0); }
		public TerminalNode FOR() { return getToken(FunParser.FOR, 0); }
		public TerminalNode TO() { return getToken(FunParser.TO, 0); }
		public TerminalNode ASSN() { return getToken(FunParser.ASSN, 0); }
		public Seq_comContext seq_com() {
			return getRuleContext(Seq_comContext.class,0);
		}
		public ForloopContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterForloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitForloop(this);
		}
	}
	public static class WhileContext extends ComContext {
		public TerminalNode DOT() { return getToken(FunParser.DOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(FunParser.COLON, 0); }
		public Seq_comContext seq_com() {
			return getRuleContext(Seq_comContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(FunParser.WHILE, 0); }
		public WhileContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitWhile(this);
		}
	}
	public static class IfContext extends ComContext {
		public Seq_comContext c1;
		public Seq_comContext c2;
		public TerminalNode DOT() { return getToken(FunParser.DOT, 0); }
		public TerminalNode ELSE() { return getToken(FunParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(FunParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLON(int i) {
			return getToken(FunParser.COLON, i);
		}
		public List<TerminalNode> COLON() { return getTokens(FunParser.COLON); }
		public List<Seq_comContext> seq_com() {
			return getRuleContexts(Seq_comContext.class);
		}
		public Seq_comContext seq_com(int i) {
			return getRuleContext(Seq_comContext.class,i);
		}
		public IfContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitIf(this);
		}
	}
	public static class SwitchContext extends ComContext {
		public ExprContext e1;
		public TerminalNode DOT() { return getToken(FunParser.DOT, 0); }
		public Case_stmtContext case_stmt(int i) {
			return getRuleContext(Case_stmtContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(FunParser.SWITCH, 0); }
		public TerminalNode COLON() { return getToken(FunParser.COLON, 0); }
		public Default_caseContext default_case() {
			return getRuleContext(Default_caseContext.class,0);
		}
		public List<Case_stmtContext> case_stmt() {
			return getRuleContexts(Case_stmtContext.class);
		}
		public SwitchContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitSwitch(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		ComContext _localctx = new ComContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_com);
		int _la;
		try {
			setState(151);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new AssnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102); match(ID);
				setState(103); match(ASSN);
				setState(104); expr();
				}
				break;
			case 2:
				_localctx = new ProccallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(105); match(ID);
				setState(106); match(LPAR);
				setState(108);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << TRUE) | (1L << NOT) | (1L << LPAR) | (1L << NUM) | (1L << ID))) != 0)) {
					{
					setState(107); actual_seq();
					}
				}

				setState(110); match(RPAR);
				}
				break;
			case 3:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(111); match(IF);
				setState(112); expr();
				setState(113); match(COLON);
				setState(114); ((IfContext)_localctx).c1 = seq_com();
				setState(121);
				switch (_input.LA(1)) {
				case DOT:
					{
					setState(115); match(DOT);
					}
					break;
				case ELSE:
					{
					setState(116); match(ELSE);
					setState(117); match(COLON);
					setState(118); ((IfContext)_localctx).c2 = seq_com();
					setState(119); match(DOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(123); match(WHILE);
				setState(124); expr();
				setState(125); match(COLON);
				setState(126); seq_com();
				setState(127); match(DOT);
				}
				break;
			case 5:
				_localctx = new ForloopContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(129); match(FOR);
				setState(130); match(ID);
				setState(131); match(ASSN);
				setState(132); expr();
				setState(133); match(TO);
				setState(134); expr();
				setState(135); match(COLON);
				setState(136); seq_com();
				setState(137); match(DOT);
				}
				break;
			case 6:
				_localctx = new SwitchContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(139); match(SWITCH);
				setState(140); ((SwitchContext)_localctx).e1 = expr();
				setState(141); match(COLON);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE) {
					{
					{
					setState(142); case_stmt();
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148); default_case();
				setState(149); match(DOT);
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

	public static class Default_caseContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(FunParser.COLON, 0); }
		public Seq_comContext seq_com() {
			return getRuleContext(Seq_comContext.class,0);
		}
		public Default_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterDefault_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitDefault_case(this);
		}
	}

	public final Default_caseContext default_case() throws RecognitionException {
		Default_caseContext _localctx = new Default_caseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_default_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); match(T__0);
			setState(154); match(COLON);
			setState(155); seq_com();
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

	public static class Case_stmtContext extends ParserRuleContext {
		public Case_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_stmt; }
	 
		public Case_stmtContext() { }
		public void copyFrom(Case_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Case_statementContext extends Case_stmtContext {
		public TerminalNode CASE() { return getToken(FunParser.CASE, 0); }
		public TerminalNode FALSE() { return getToken(FunParser.FALSE, 0); }
		public TerminalNode NUM() { return getToken(FunParser.NUM, 0); }
		public TerminalNode TRUE() { return getToken(FunParser.TRUE, 0); }
		public TerminalNode COLON() { return getToken(FunParser.COLON, 0); }
		public Seq_comContext seq_com() {
			return getRuleContext(Seq_comContext.class,0);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public Case_statementContext(Case_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterCase_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitCase_statement(this);
		}
	}

	public final Case_stmtContext case_stmt() throws RecognitionException {
		Case_stmtContext _localctx = new Case_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_case_stmt);
		try {
			_localctx = new Case_statementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(157); match(CASE);
			setState(162);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(158); match(NUM);
				}
				break;
			case 2:
				{
				setState(159); match(FALSE);
				}
				break;
			case 3:
				{
				setState(160); match(TRUE);
				}
				break;
			case 4:
				{
				setState(161); range();
				}
				break;
			}
			setState(164); match(COLON);
			setState(165); seq_com();
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

	public static class RangeContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(FunParser.DOT); }
		public List<TerminalNode> NUM() { return getTokens(FunParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(FunParser.NUM, i);
		}
		public TerminalNode DOT(int i) {
			return getToken(FunParser.DOT, i);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitRange(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); match(NUM);
			setState(168); match(DOT);
			setState(169); match(DOT);
			setState(170); match(NUM);
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

	public static class Seq_comContext extends ParserRuleContext {
		public Seq_comContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seq_com; }
	 
		public Seq_comContext() { }
		public void copyFrom(Seq_comContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SeqContext extends Seq_comContext {
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public SeqContext(Seq_comContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitSeq(this);
		}
	}

	public final Seq_comContext seq_com() throws RecognitionException {
		Seq_comContext _localctx = new Seq_comContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_seq_com);
		int _la;
		try {
			_localctx = new SeqContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SWITCH) | (1L << ID))) != 0)) {
				{
				{
				setState(172); com();
				}
				}
				setState(177);
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

	public static class ExprContext extends ParserRuleContext {
		public Sec_exprContext e1;
		public Token op;
		public Sec_exprContext e2;
		public TerminalNode LT() { return getToken(FunParser.LT, 0); }
		public Sec_exprContext sec_expr(int i) {
			return getRuleContext(Sec_exprContext.class,i);
		}
		public TerminalNode GT() { return getToken(FunParser.GT, 0); }
		public TerminalNode EQ() { return getToken(FunParser.EQ, 0); }
		public List<Sec_exprContext> sec_expr() {
			return getRuleContexts(Sec_exprContext.class);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); ((ExprContext)_localctx).e1 = sec_expr();
			setState(181);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LT) | (1L << GT))) != 0)) {
				{
				setState(179);
				((ExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LT) | (1L << GT))) != 0)) ) {
					((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(180); ((ExprContext)_localctx).e2 = sec_expr();
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

	public static class Sec_exprContext extends ParserRuleContext {
		public Prim_exprContext e1;
		public Token op;
		public Sec_exprContext e2;
		public Prim_exprContext prim_expr() {
			return getRuleContext(Prim_exprContext.class,0);
		}
		public TerminalNode TIMES() { return getToken(FunParser.TIMES, 0); }
		public TerminalNode PLUS() { return getToken(FunParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FunParser.MINUS, 0); }
		public Sec_exprContext sec_expr() {
			return getRuleContext(Sec_exprContext.class,0);
		}
		public TerminalNode DIV() { return getToken(FunParser.DIV, 0); }
		public Sec_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sec_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterSec_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitSec_expr(this);
		}
	}

	public final Sec_exprContext sec_expr() throws RecognitionException {
		Sec_exprContext _localctx = new Sec_exprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sec_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); ((Sec_exprContext)_localctx).e1 = prim_expr();
			setState(186);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIV))) != 0)) {
				{
				setState(184);
				((Sec_exprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIV))) != 0)) ) {
					((Sec_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(185); ((Sec_exprContext)_localctx).e2 = sec_expr();
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

	public static class Prim_exprContext extends ParserRuleContext {
		public Prim_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prim_expr; }
	 
		public Prim_exprContext() { }
		public void copyFrom(Prim_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotContext extends Prim_exprContext {
		public TerminalNode NOT() { return getToken(FunParser.NOT, 0); }
		public Prim_exprContext prim_expr() {
			return getRuleContext(Prim_exprContext.class,0);
		}
		public NotContext(Prim_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitNot(this);
		}
	}
	public static class ParensContext extends Prim_exprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(FunParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunParser.RPAR, 0); }
		public ParensContext(Prim_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitParens(this);
		}
	}
	public static class FunccallContext extends Prim_exprContext {
		public TerminalNode ID() { return getToken(FunParser.ID, 0); }
		public Actual_seqContext actual_seq() {
			return getRuleContext(Actual_seqContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(FunParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunParser.RPAR, 0); }
		public FunccallContext(Prim_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterFunccall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitFunccall(this);
		}
	}
	public static class NumContext extends Prim_exprContext {
		public TerminalNode NUM() { return getToken(FunParser.NUM, 0); }
		public NumContext(Prim_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitNum(this);
		}
	}
	public static class FalseContext extends Prim_exprContext {
		public TerminalNode FALSE() { return getToken(FunParser.FALSE, 0); }
		public FalseContext(Prim_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitFalse(this);
		}
	}
	public static class TrueContext extends Prim_exprContext {
		public TerminalNode TRUE() { return getToken(FunParser.TRUE, 0); }
		public TrueContext(Prim_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitTrue(this);
		}
	}
	public static class IdContext extends Prim_exprContext {
		public TerminalNode ID() { return getToken(FunParser.ID, 0); }
		public IdContext(Prim_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitId(this);
		}
	}

	public final Prim_exprContext prim_expr() throws RecognitionException {
		Prim_exprContext _localctx = new Prim_exprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_prim_expr);
		int _la;
		try {
			setState(204);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(188); match(FALSE);
				}
				break;
			case 2:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(189); match(TRUE);
				}
				break;
			case 3:
				_localctx = new NumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(190); match(NUM);
				}
				break;
			case 4:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(191); match(ID);
				}
				break;
			case 5:
				_localctx = new FunccallContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(192); match(ID);
				setState(193); match(LPAR);
				setState(195);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << TRUE) | (1L << NOT) | (1L << LPAR) | (1L << NUM) | (1L << ID))) != 0)) {
					{
					setState(194); actual_seq();
					}
				}

				setState(197); match(RPAR);
				}
				break;
			case 6:
				_localctx = new NotContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(198); match(NOT);
				setState(199); prim_expr();
				}
				break;
			case 7:
				_localctx = new ParensContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(200); match(LPAR);
				setState(201); expr();
				setState(202); match(RPAR);
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

	public static class Actual_seqContext extends ParserRuleContext {
		public Actual_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_seq; }
	 
		public Actual_seqContext() { }
		public void copyFrom(Actual_seqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ActualseqContext extends Actual_seqContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunParser.COMMA, i);
		}
		public ActualseqContext(Actual_seqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterActualseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitActualseq(this);
		}
	}

	public final Actual_seqContext actual_seq() throws RecognitionException {
		Actual_seqContext _localctx = new Actual_seqContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_actual_seq);
		int _la;
		try {
			_localctx = new ActualseqContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(206); expr();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(207); match(COMMA);
				setState(208); expr();
				}
				}
				setState(213);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u00d9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\7\2\"\n\2\f\2\16"+
		"\2%\13\2\3\2\6\2(\n\2\r\2\16\2)\3\2\3\2\3\3\3\3\3\3\3\3\5\3\62\n\3\3\3"+
		"\3\3\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"D\n\3\3\3\3\3\3\3\7\3I\n\3\f\3\16\3L\13\3\3\3\3\3\3\3\3\3\3\3\5\3S\n\3"+
		"\3\4\3\4\3\4\7\4X\n\4\f\4\16\4[\13\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\5\7g\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bo\n\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b|\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0092\n\b\f\b\16\b\u0095"+
		"\13\b\3\b\3\b\3\b\5\b\u009a\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u00a5\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\7\f\u00b0\n\f\f"+
		"\f\16\f\u00b3\13\f\3\r\3\r\3\r\5\r\u00b8\n\r\3\16\3\16\3\16\5\16\u00bd"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c6\n\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00cf\n\17\3\20\3\20\3\20\7\20\u00d4\n\20\f"+
		"\20\16\20\u00d7\13\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36\2\4\3\2\22\24\3\2\25\30\u00e8\2#\3\2\2\2\4R\3\2\2\2\6T\3\2\2\2\b\\"+
		"\3\2\2\2\n_\3\2\2\2\ff\3\2\2\2\16\u0099\3\2\2\2\20\u009b\3\2\2\2\22\u009f"+
		"\3\2\2\2\24\u00a9\3\2\2\2\26\u00b1\3\2\2\2\30\u00b4\3\2\2\2\32\u00b9\3"+
		"\2\2\2\34\u00ce\3\2\2\2\36\u00d0\3\2\2\2 \"\5\n\6\2! \3\2\2\2\"%\3\2\2"+
		"\2#!\3\2\2\2#$\3\2\2\2$\'\3\2\2\2%#\3\2\2\2&(\5\4\3\2\'&\3\2\2\2()\3\2"+
		"\2\2)\'\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\7\2\2\3,\3\3\2\2\2-.\7\n\2\2./\7"+
		"!\2\2/\61\7\33\2\2\60\62\5\6\4\2\61\60\3\2\2\2\61\62\3\2\2\2\62\63\3\2"+
		"\2\2\63\64\7\34\2\2\648\7\35\2\2\65\67\5\n\6\2\66\65\3\2\2\2\67:\3\2\2"+
		"\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\5\26\f\2<=\7\36\2\2=S\3"+
		"\2\2\2>?\7\7\2\2?@\5\f\7\2@A\7!\2\2AC\7\33\2\2BD\5\6\4\2CB\3\2\2\2CD\3"+
		"\2\2\2DE\3\2\2\2EF\7\34\2\2FJ\7\35\2\2GI\5\n\6\2HG\3\2\2\2IL\3\2\2\2J"+
		"H\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\5\26\f\2NO\7\13\2\2OP\5\30\r"+
		"\2PQ\7\36\2\2QS\3\2\2\2R-\3\2\2\2R>\3\2\2\2S\5\3\2\2\2TY\5\b\5\2UV\7\37"+
		"\2\2VX\5\b\5\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\7\3\2\2\2[Y\3"+
		"\2\2\2\\]\5\f\7\2]^\7!\2\2^\t\3\2\2\2_`\5\f\7\2`a\7!\2\2ab\7\32\2\2bc"+
		"\5\30\r\2c\13\3\2\2\2dg\7\4\2\2eg\7\t\2\2fd\3\2\2\2fe\3\2\2\2g\r\3\2\2"+
		"\2hi\7!\2\2ij\7\32\2\2j\u009a\5\30\r\2kl\7!\2\2ln\7\33\2\2mo\5\36\20\2"+
		"nm\3\2\2\2no\3\2\2\2op\3\2\2\2p\u009a\7\34\2\2qr\7\b\2\2rs\5\30\r\2st"+
		"\7\35\2\2t{\5\26\f\2u|\7\36\2\2vw\7\5\2\2wx\7\35\2\2xy\5\26\f\2yz\7\36"+
		"\2\2z|\3\2\2\2{u\3\2\2\2{v\3\2\2\2|\u009a\3\2\2\2}~\7\r\2\2~\177\5\30"+
		"\r\2\177\u0080\7\35\2\2\u0080\u0081\5\26\f\2\u0081\u0082\7\36\2\2\u0082"+
		"\u009a\3\2\2\2\u0083\u0084\7\16\2\2\u0084\u0085\7!\2\2\u0085\u0086\7\32"+
		"\2\2\u0086\u0087\5\30\r\2\u0087\u0088\7\17\2\2\u0088\u0089\5\30\r\2\u0089"+
		"\u008a\7\35\2\2\u008a\u008b\5\26\f\2\u008b\u008c\7\36\2\2\u008c\u009a"+
		"\3\2\2\2\u008d\u008e\7\21\2\2\u008e\u008f\5\30\r\2\u008f\u0093\7\35\2"+
		"\2\u0090\u0092\5\22\n\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0096\u0097\5\20\t\2\u0097\u0098\7\36\2\2\u0098\u009a\3\2\2\2\u0099"+
		"h\3\2\2\2\u0099k\3\2\2\2\u0099q\3\2\2\2\u0099}\3\2\2\2\u0099\u0083\3\2"+
		"\2\2\u0099\u008d\3\2\2\2\u009a\17\3\2\2\2\u009b\u009c\7\3\2\2\u009c\u009d"+
		"\7\35\2\2\u009d\u009e\5\26\f\2\u009e\21\3\2\2\2\u009f\u00a4\7\20\2\2\u00a0"+
		"\u00a5\7 \2\2\u00a1\u00a5\7\6\2\2\u00a2\u00a5\7\f\2\2\u00a3\u00a5\5\24"+
		"\13\2\u00a4\u00a0\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\7\35\2\2\u00a7\u00a8\5"+
		"\26\f\2\u00a8\23\3\2\2\2\u00a9\u00aa\7 \2\2\u00aa\u00ab\7\36\2\2\u00ab"+
		"\u00ac\7\36\2\2\u00ac\u00ad\7 \2\2\u00ad\25\3\2\2\2\u00ae\u00b0\5\16\b"+
		"\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\27\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\5\32\16\2\u00b5"+
		"\u00b6\t\2\2\2\u00b6\u00b8\5\32\16\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3"+
		"\2\2\2\u00b8\31\3\2\2\2\u00b9\u00bc\5\34\17\2\u00ba\u00bb\t\3\2\2\u00bb"+
		"\u00bd\5\32\16\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\33\3\2"+
		"\2\2\u00be\u00cf\7\6\2\2\u00bf\u00cf\7\f\2\2\u00c0\u00cf\7 \2\2\u00c1"+
		"\u00cf\7!\2\2\u00c2\u00c3\7!\2\2\u00c3\u00c5\7\33\2\2\u00c4\u00c6\5\36"+
		"\20\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00cf\7\34\2\2\u00c8\u00c9\7\31\2\2\u00c9\u00cf\5\34\17\2\u00ca\u00cb"+
		"\7\33\2\2\u00cb\u00cc\5\30\r\2\u00cc\u00cd\7\34\2\2\u00cd\u00cf\3\2\2"+
		"\2\u00ce\u00be\3\2\2\2\u00ce\u00bf\3\2\2\2\u00ce\u00c0\3\2\2\2\u00ce\u00c1"+
		"\3\2\2\2\u00ce\u00c2\3\2\2\2\u00ce\u00c8\3\2\2\2\u00ce\u00ca\3\2\2\2\u00cf"+
		"\35\3\2\2\2\u00d0\u00d5\5\30\r\2\u00d1\u00d2\7\37\2\2\u00d2\u00d4\5\30"+
		"\r\2\u00d3\u00d1\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\37\3\2\2\2\u00d7\u00d5\3\2\2\2\26#)\618CJRYfn{\u0093"+
		"\u0099\u00a4\u00b1\u00b7\u00bc\u00c5\u00ce\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}