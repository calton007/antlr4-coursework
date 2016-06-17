// Generated from C:\Users\Calton\Desktop\编译原理课程设计\计算器\Calc\Calc.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COS=1, SIN=2, TAN=3, ACOS=4, ASIN=5, ATAN=6, LN=7, LOG=8, LPAREN=9, RPAREN=10, 
		PLUS=11, MINUS=12, TIMES=13, DIV=14, POW=15, DIGIT=16, SEMI=17, SET=18, 
		EQ=19, ID=20, WS=21;
	public static final String[] tokenNames = {
		"<INVALID>", "'cos'", "'sin'", "'tan'", "'acos'", "'asin'", "'atan'", 
		"'ln'", "'log'", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'^'", "DIGIT", 
		"';'", "'SET'", "'='", "ID", "WS"
	};
	public static final int
		RULE_assign = 0, RULE_setExpr = 1, RULE_agmts = 2, RULE_agmt = 3, RULE_getExpr = 4, 
		RULE_expr = 5, RULE_multExpr = 6, RULE_powExpr = 7, RULE_atom = 8, RULE_func = 9, 
		RULE_number = 10;
	public static final String[] ruleNames = {
		"assign", "setExpr", "agmts", "agmt", "getExpr", "expr", "multExpr", "powExpr", 
		"atom", "func", "number"
	};

	@Override
	public String getGrammarFileName() { return "Calc.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AssignContext extends ParserRuleContext {
		public SetExprContext setExpr() {
			return getRuleContext(SetExprContext.class,0);
		}
		public GetExprContext getExpr() {
			return getRuleContext(GetExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_assign);
		try {
			setState(24);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(22); setExpr();
				}
				break;
			case COS:
			case SIN:
			case TAN:
			case ACOS:
			case ASIN:
			case ATAN:
			case LN:
			case LOG:
			case LPAREN:
			case MINUS:
			case DIGIT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(23); getExpr();
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

	public static class SetExprContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(CalcParser.SET, 0); }
		public AgmtsContext agmts() {
			return getRuleContext(AgmtsContext.class,0);
		}
		public SetExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterSetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitSetExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitSetExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetExprContext setExpr() throws RecognitionException {
		SetExprContext _localctx = new SetExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_setExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); match(SET);
			setState(27); agmts();
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

	public static class AgmtsContext extends ParserRuleContext {
		public AgmtContext agmt() {
			return getRuleContext(AgmtContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(CalcParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CalcParser.SEMI, i);
		}
		public AgmtsContext agmts() {
			return getRuleContext(AgmtsContext.class,0);
		}
		public AgmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterAgmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitAgmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitAgmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AgmtsContext agmts() throws RecognitionException {
		AgmtsContext _localctx = new AgmtsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_agmts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); agmt();
			setState(32);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(30); match(SEMI);
				setState(31); agmts();
				}
				break;
			}
			setState(35);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(34); match(SEMI);
				}
				break;
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

	public static class AgmtContext extends ParserRuleContext {
		public Token id;
		public TerminalNode ID() { return getToken(CalcParser.ID, 0); }
		public TerminalNode EQ() { return getToken(CalcParser.EQ, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AgmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterAgmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitAgmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitAgmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AgmtContext agmt() throws RecognitionException {
		AgmtContext _localctx = new AgmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_agmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); ((AgmtContext)_localctx).id = match(ID);
			setState(38); match(EQ);
			setState(39); atom();
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

	public static class GetExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public GetExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterGetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitGetExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitGetExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetExprContext getExpr() throws RecognitionException {
		GetExprContext _localctx = new GetExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_getExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); expr();
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
		public TerminalNode MINUS(int i) {
			return getToken(CalcParser.MINUS, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultExprContext multExpr() {
			return getRuleContext(MultExprContext.class,0);
		}
		public List<TerminalNode> PLUS() { return getTokens(CalcParser.PLUS); }
		public List<TerminalNode> MINUS() { return getTokens(CalcParser.MINUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CalcParser.PLUS, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(43); multExpr();
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(44);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(45); expr();
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class MultExprContext extends ParserRuleContext {
		public TerminalNode TIMES(int i) {
			return getToken(CalcParser.TIMES, i);
		}
		public List<TerminalNode> TIMES() { return getTokens(CalcParser.TIMES); }
		public PowExprContext powExpr(int i) {
			return getRuleContext(PowExprContext.class,i);
		}
		public List<PowExprContext> powExpr() {
			return getRuleContexts(PowExprContext.class);
		}
		public List<TerminalNode> DIV() { return getTokens(CalcParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(CalcParser.DIV, i);
		}
		public MultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterMultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitMultExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitMultExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultExprContext multExpr() throws RecognitionException {
		MultExprContext _localctx = new MultExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_multExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51); powExpr();
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(52);
					_la = _input.LA(1);
					if ( !(_la==TIMES || _la==DIV) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(53); powExpr();
					}
					} 
				}
				setState(58);
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
			exitRule();
		}
		return _localctx;
	}

	public static class PowExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode POW() { return getToken(CalcParser.POW, 0); }
		public PowExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterPowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitPowExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitPowExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowExprContext powExpr() throws RecognitionException {
		PowExprContext _localctx = new PowExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_powExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); atom();
			setState(62);
			_la = _input.LA(1);
			if (_la==POW) {
				{
				setState(60); match(POW);
				setState(61); expr();
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

	public static class AtomContext extends ParserRuleContext {
		public Token op1;
		public NumberContext n;
		public Token op2;
		public Token id;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode ID() { return getToken(CalcParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CalcParser.LPAREN, 0); }
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CalcParser.MINUS, 0); }
		public TerminalNode RPAREN() { return getToken(CalcParser.RPAREN, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_atom);
		int _la;
		try {
			setState(77);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(64); ((AtomContext)_localctx).op1 = match(MINUS);
					}
				}

				setState(67); ((AtomContext)_localctx).n = number();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(68); ((AtomContext)_localctx).op2 = match(MINUS);
					}
				}

				setState(71); ((AtomContext)_localctx).id = match(ID);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72); match(LPAREN);
				setState(73); expr();
				setState(74); match(RPAREN);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(76); func();
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

	public static class FuncContext extends ParserRuleContext {
		public Token funcname;
		public TerminalNode LOG() { return getToken(CalcParser.LOG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ATAN() { return getToken(CalcParser.ATAN, 0); }
		public TerminalNode LPAREN() { return getToken(CalcParser.LPAREN, 0); }
		public TerminalNode SIN() { return getToken(CalcParser.SIN, 0); }
		public TerminalNode ACOS() { return getToken(CalcParser.ACOS, 0); }
		public TerminalNode TAN() { return getToken(CalcParser.TAN, 0); }
		public TerminalNode ASIN() { return getToken(CalcParser.ASIN, 0); }
		public TerminalNode RPAREN() { return getToken(CalcParser.RPAREN, 0); }
		public TerminalNode LN() { return getToken(CalcParser.LN, 0); }
		public TerminalNode COS() { return getToken(CalcParser.COS, 0); }
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			((FuncContext)_localctx).funcname = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COS) | (1L << SIN) | (1L << TAN) | (1L << ACOS) | (1L << ASIN) | (1L << ATAN) | (1L << LN) | (1L << LOG))) != 0)) ) {
				((FuncContext)_localctx).funcname = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(80); match(LPAREN);
			setState(81); expr();
			setState(82); match(RPAREN);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(CalcParser.DIGIT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); match(DIGIT);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\27Y\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\5\2\33\n\2\3\3\3\3\3\3\3\4\3\4\3\4\5\4#\n\4\3\4\5\4&\n"+
		"\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\7\7\61\n\7\f\7\16\7\64\13\7\3\b"+
		"\3\b\3\b\7\b9\n\b\f\b\16\b<\13\b\3\t\3\t\3\t\5\tA\n\t\3\n\5\nD\n\n\3\n"+
		"\3\n\5\nH\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nP\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\2\r\2\4\6\b\n\f\16\20\22\24\26\2\5\3\2\r\16\3\2\17\20\3\2"+
		"\3\nX\2\32\3\2\2\2\4\34\3\2\2\2\6\37\3\2\2\2\b\'\3\2\2\2\n+\3\2\2\2\f"+
		"-\3\2\2\2\16\65\3\2\2\2\20=\3\2\2\2\22O\3\2\2\2\24Q\3\2\2\2\26V\3\2\2"+
		"\2\30\33\5\4\3\2\31\33\5\n\6\2\32\30\3\2\2\2\32\31\3\2\2\2\33\3\3\2\2"+
		"\2\34\35\7\24\2\2\35\36\5\6\4\2\36\5\3\2\2\2\37\"\5\b\5\2 !\7\23\2\2!"+
		"#\5\6\4\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$&\7\23\2\2%$\3\2\2\2%&\3\2\2"+
		"\2&\7\3\2\2\2\'(\7\26\2\2()\7\25\2\2)*\5\22\n\2*\t\3\2\2\2+,\5\f\7\2,"+
		"\13\3\2\2\2-\62\5\16\b\2./\t\2\2\2/\61\5\f\7\2\60.\3\2\2\2\61\64\3\2\2"+
		"\2\62\60\3\2\2\2\62\63\3\2\2\2\63\r\3\2\2\2\64\62\3\2\2\2\65:\5\20\t\2"+
		"\66\67\t\3\2\2\679\5\20\t\28\66\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2"+
		";\17\3\2\2\2<:\3\2\2\2=@\5\22\n\2>?\7\21\2\2?A\5\f\7\2@>\3\2\2\2@A\3\2"+
		"\2\2A\21\3\2\2\2BD\7\16\2\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EP\5\26\f\2F"+
		"H\7\16\2\2GF\3\2\2\2GH\3\2\2\2HI\3\2\2\2IP\7\26\2\2JK\7\13\2\2KL\5\f\7"+
		"\2LM\7\f\2\2MP\3\2\2\2NP\5\24\13\2OC\3\2\2\2OG\3\2\2\2OJ\3\2\2\2ON\3\2"+
		"\2\2P\23\3\2\2\2QR\t\4\2\2RS\7\13\2\2ST\5\f\7\2TU\7\f\2\2U\25\3\2\2\2"+
		"VW\7\22\2\2W\27\3\2\2\2\13\32\"%\62:@CGO";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}