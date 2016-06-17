// Generated from C:\Users\Calton\Documents\Antlr Projects\RelationToSQL\RelationToSQL.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RelationToSQLParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, PAI=2, IDENT=3, LEFT=4, RIGHT=5, XIGEMA=6, EQUAL=7, NUM=8, AND=9, 
		DOU=10, OR=11, LESS=12, MORE=13, NEQUAL=14, BING=15, JIAO=16, NJOIN=17, 
		CHU=18, SEMI=19;
	public static final String[] tokenNames = {
		"<INVALID>", "WS", "'H'", "IDENT", "'('", "')'", "'G'", "'='", "NUM", 
		"'@'", "','", "'^'", "'<'", "'>'", "'!='", "'*'", "'~'", "'&'", "'/'", 
		"';'"
	};
	public static final int
		RULE_prog = 0, RULE_projectStart = 1, RULE_project = 2, RULE_choose = 3, 
		RULE_projectColumns = 4, RULE_chooseColumns = 5, RULE_loopProjectColumns = 6, 
		RULE_relation = 7, RULE_bin = 8, RULE_jia = 9, RULE_njo = 10, RULE_chu = 11, 
		RULE_exprSub = 12, RULE_loopChooseColumns = 13, RULE_chooseColumnsAfterAndOr = 14, 
		RULE_projectSub = 15, RULE_chooseSub = 16, RULE_equal = 17, RULE_notEqual = 18, 
		RULE_small = 19, RULE_big = 20;
	public static final String[] ruleNames = {
		"prog", "projectStart", "project", "choose", "projectColumns", "chooseColumns", 
		"loopProjectColumns", "relation", "bin", "jia", "njo", "chu", "exprSub", 
		"loopChooseColumns", "chooseColumnsAfterAndOr", "projectSub", "chooseSub", 
		"equal", "notEqual", "small", "big"
	};

	@Override
	public String getGrammarFileName() { return "RelationToSQL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public RelationToSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public ChooseContext choose(int i) {
			return getRuleContext(ChooseContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(RelationToSQLParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(RelationToSQLParser.SEMI, i);
		}
		public List<ProjectContext> project() {
			return getRuleContexts(ProjectContext.class);
		}
		public ProjectContext project(int i) {
			return getRuleContext(ProjectContext.class,i);
		}
		public List<ChooseContext> choose() {
			return getRuleContexts(ChooseContext.class);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationToSQLVisitor ) return ((RelationToSQLVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				switch (_input.LA(1)) {
				case XIGEMA:
					{
					setState(42); choose();
					}
					break;
				case PAI:
					{
					setState(43); project();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(46); match(SEMI);
				}
				}
				setState(50); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PAI || _la==XIGEMA );
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

	public static class ProjectStartContext extends ParserRuleContext {
		public Token ident;
		public TerminalNode LEFT() { return getToken(RelationToSQLParser.LEFT, 0); }
		public ChooseSubContext chooseSub(int i) {
			return getRuleContext(ChooseSubContext.class,i);
		}
		public ProjectSubContext projectSub(int i) {
			return getRuleContext(ProjectSubContext.class,i);
		}
		public TerminalNode RIGHT() { return getToken(RelationToSQLParser.RIGHT, 0); }
		public TerminalNode IDENT() { return getToken(RelationToSQLParser.IDENT, 0); }
		public List<ChooseSubContext> chooseSub() {
			return getRuleContexts(ChooseSubContext.class);
		}
		public List<ProjectSubContext> projectSub() {
			return getRuleContexts(ProjectSubContext.class);
		}
		public ProjectStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projectStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).enterProjectStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).exitProjectStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationToSQLVisitor ) return ((RelationToSQLVisitor<? extends T>)visitor).visitProjectStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectStartContext projectStart() throws RecognitionException {
		ProjectStartContext _localctx = new ProjectStartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_projectStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); match(LEFT);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PAI || _la==XIGEMA) {
				{
				setState(55);
				switch (_input.LA(1)) {
				case PAI:
					{
					setState(53); projectSub();
					}
					break;
				case XIGEMA:
					{
					setState(54); chooseSub();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60); ((ProjectStartContext)_localctx).ident = match(IDENT);
			setState(61); match(RIGHT);
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

	public static class ProjectContext extends ParserRuleContext {
		public ProjectStartContext t;
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public LoopProjectColumnsContext loopProjectColumns(int i) {
			return getRuleContext(LoopProjectColumnsContext.class,i);
		}
		public ProjectColumnsContext projectColumns() {
			return getRuleContext(ProjectColumnsContext.class,0);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<ExprSubContext> exprSub() {
			return getRuleContexts(ExprSubContext.class);
		}
		public TerminalNode PAI() { return getToken(RelationToSQLParser.PAI, 0); }
		public ExprSubContext exprSub(int i) {
			return getRuleContext(ExprSubContext.class,i);
		}
		public ProjectStartContext projectStart() {
			return getRuleContext(ProjectStartContext.class,0);
		}
		public List<LoopProjectColumnsContext> loopProjectColumns() {
			return getRuleContexts(LoopProjectColumnsContext.class);
		}
		public ProjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_project; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).enterProject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).exitProject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationToSQLVisitor ) return ((RelationToSQLVisitor<? extends T>)visitor).visitProject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectContext project() throws RecognitionException {
		ProjectContext _localctx = new ProjectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_project);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); match(PAI);
			setState(64); projectColumns();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOU) {
				{
				{
				setState(65); loopProjectColumns();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71); ((ProjectContext)_localctx).t = projectStart();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BING) | (1L << JIAO) | (1L << NJOIN) | (1L << CHU))) != 0)) {
				{
				{
				setState(72); relation();
				setState(73); exprSub();
				}
				}
				setState(79);
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

	public static class ChooseContext extends ParserRuleContext {
		public RelationContext t;
		public List<LoopChooseColumnsContext> loopChooseColumns() {
			return getRuleContexts(LoopChooseColumnsContext.class);
		}
		public NotEqualContext notEqual(int i) {
			return getRuleContext(NotEqualContext.class,i);
		}
		public List<BigContext> big() {
			return getRuleContexts(BigContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public TerminalNode XIGEMA() { return getToken(RelationToSQLParser.XIGEMA, 0); }
		public SmallContext small(int i) {
			return getRuleContext(SmallContext.class,i);
		}
		public BigContext big(int i) {
			return getRuleContext(BigContext.class,i);
		}
		public ExprSubContext exprSub(int i) {
			return getRuleContext(ExprSubContext.class,i);
		}
		public List<SmallContext> small() {
			return getRuleContexts(SmallContext.class);
		}
		public LoopChooseColumnsContext loopChooseColumns(int i) {
			return getRuleContext(LoopChooseColumnsContext.class,i);
		}
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public List<EqualContext> equal() {
			return getRuleContexts(EqualContext.class);
		}
		public List<NotEqualContext> notEqual() {
			return getRuleContexts(NotEqualContext.class);
		}
		public List<ExprSubContext> exprSub() {
			return getRuleContexts(ExprSubContext.class);
		}
		public ChooseColumnsAfterAndOrContext chooseColumnsAfterAndOr(int i) {
			return getRuleContext(ChooseColumnsAfterAndOrContext.class,i);
		}
		public List<ChooseColumnsAfterAndOrContext> chooseColumnsAfterAndOr() {
			return getRuleContexts(ChooseColumnsAfterAndOrContext.class);
		}
		public ChooseColumnsContext chooseColumns() {
			return getRuleContext(ChooseColumnsContext.class,0);
		}
		public EqualContext equal(int i) {
			return getRuleContext(EqualContext.class,i);
		}
		public ChooseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choose; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).enterChoose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).exitChoose(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationToSQLVisitor ) return ((RelationToSQLVisitor<? extends T>)visitor).visitChoose(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChooseContext choose() throws RecognitionException {
		ChooseContext _localctx = new ChooseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_choose);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(XIGEMA);
			setState(81); chooseColumns();
			setState(86);
			switch (_input.LA(1)) {
			case EQUAL:
				{
				setState(82); equal();
				}
				break;
			case NEQUAL:
				{
				setState(83); notEqual();
				}
				break;
			case LESS:
				{
				setState(84); small();
				}
				break;
			case MORE:
				{
				setState(85); big();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(88); loopChooseColumns();
				setState(89); chooseColumnsAfterAndOr();
				setState(94);
				switch (_input.LA(1)) {
				case EQUAL:
					{
					setState(90); equal();
					}
					break;
				case NEQUAL:
					{
					setState(91); notEqual();
					}
					break;
				case LESS:
					{
					setState(92); small();
					}
					break;
				case MORE:
					{
					setState(93); big();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BING) | (1L << JIAO) | (1L << NJOIN) | (1L << CHU))) != 0)) {
				{
				{
				setState(101); ((ChooseContext)_localctx).t = relation();
				setState(102); exprSub();
				}
				}
				setState(108);
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

	public static class ProjectColumnsContext extends ParserRuleContext {
		public Token ident;
		public TerminalNode IDENT() { return getToken(RelationToSQLParser.IDENT, 0); }
		public ProjectColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projectColumns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).enterProjectColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).exitProjectColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationToSQLVisitor ) return ((RelationToSQLVisitor<? extends T>)visitor).visitProjectColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectColumnsContext projectColumns() throws RecognitionException {
		ProjectColumnsContext _localctx = new ProjectColumnsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_projectColumns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); ((ProjectColumnsContext)_localctx).ident = match(IDENT);
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

	public static class ChooseColumnsContext extends ParserRuleContext {
		public Token ident;
		public TerminalNode IDENT() { return getToken(RelationToSQLParser.IDENT, 0); }
		public ChooseColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chooseColumns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).enterChooseColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).exitChooseColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationToSQLVisitor ) return ((RelationToSQLVisitor<? extends T>)visitor).visitChooseColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChooseColumnsContext chooseColumns() throws RecognitionException {
		ChooseColumnsContext _localctx = new ChooseColumnsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_chooseColumns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); ((ChooseColumnsContext)_localctx).ident = match(IDENT);
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

	public static class LoopProjectColumnsContext extends ParserRuleContext {
		public Token dou;
		public Token ident;
		public TerminalNode DOU() { return getToken(RelationToSQLParser.DOU, 0); }
		public TerminalNode IDENT() { return getToken(RelationToSQLParser.IDENT, 0); }
		public LoopProjectColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopProjectColumns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).enterLoopProjectColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).exitLoopProjectColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationToSQLVisitor ) return ((RelationToSQLVisitor<? extends T>)visitor).visitLoopProjectColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopProjectColumnsContext loopProjectColumns() throws RecognitionException {
		LoopProjectColumnsContext _localctx = new LoopProjectColumnsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_loopProjectColumns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); ((LoopProjectColumnsContext)_localctx).dou = match(DOU);
			setState(114); ((LoopProjectColumnsContext)_localctx).ident = match(IDENT);
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

	public static class RelationContext extends ParserRuleContext {
		public NjoContext njo() {
			return getRuleContext(NjoContext.class,0);
		}
		public JiaContext jia() {
			return getRuleContext(JiaContext.class,0);
		}
		public BinContext bin() {
			return getRuleContext(BinContext.class,0);
		}
		public ChuContext chu() {
			return getRuleContext(ChuContext.class,0);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationToSQLVisitor ) return ((RelationToSQLVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_relation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			switch (_input.LA(1)) {
			case BING:
				{
				setState(116); bin();
				}
				break;
			case JIAO:
				{
				setState(117); jia();
				}
				break;
			case NJOIN:
				{
				setState(118); njo();
				}
				break;
			case CHU:
				{
				setState(119); chu();
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

	public static class BinContext extends ParserRuleContext {
		public TerminalNode BING() { return getToken(RelationToSQLParser.BING, 0); }
		public BinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).enterBin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).exitBin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationToSQLVisitor ) return ((RelationToSQLVisitor<? extends T>)visitor).visitBin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinContext bin() throws RecognitionException {
		BinContext _localctx = new BinContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); match(BING);
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

	public static class JiaContext extends ParserRuleContext {
		public TerminalNode JIAO() { return getToken(RelationToSQLParser.JIAO, 0); }
		public JiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).enterJia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).exitJia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationToSQLVisitor ) return ((RelationToSQLVisitor<? extends T>)visitor).visitJia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JiaContext jia() throws RecognitionException {
		JiaContext _localctx = new JiaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_jia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(JIAO);
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

	public static class NjoContext extends ParserRuleContext {
		public TerminalNode NJOIN() { return getToken(RelationToSQLParser.NJOIN, 0); }
		public NjoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_njo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).enterNjo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).exitNjo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationToSQLVisitor ) return ((RelationToSQLVisitor<? extends T>)visitor).visitNjo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NjoContext njo() throws RecognitionException {
		NjoContext _localctx = new NjoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_njo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); match(NJOIN);
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

	public static class ChuContext extends ParserRuleContext {
		public TerminalNode CHU() { return getToken(RelationToSQLParser.CHU, 0); }
		public ChuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).enterChu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).exitChu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationToSQLVisitor ) return ((RelationToSQLVisitor<? extends T>)visitor).visitChu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChuContext chu() throws RecognitionException {
		ChuContext _localctx = new ChuContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_chu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); match(CHU);
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

	public static class ExprSubContext extends ParserRuleContext {
		public ChooseSubContext chooseSub() {
			return getRuleContext(ChooseSubContext.class,0);
		}
		public ProjectSubContext projectSub() {
			return getRuleContext(ProjectSubContext.class,0);
		}
		public ExprSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprSub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).enterExprSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).exitExprSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationToSQLVisitor ) return ((RelationToSQLVisitor<? extends T>)visitor).visitExprSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprSubContext exprSub() throws RecognitionException {
		ExprSubContext _localctx = new ExprSubContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exprSub);
		try {
			setState(132);
			switch (_input.LA(1)) {
			case XIGEMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(130); chooseSub();
				}
				break;
			case PAI:
				enterOuterAlt(_localctx, 2);
				{
				setState(131); projectSub();
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

	public static class LoopChooseColumnsContext extends ParserRuleContext {
		public Token t;
		public TerminalNode AND() { return getToken(RelationToSQLParser.AND, 0); }
		public TerminalNode OR() { return getToken(RelationToSQLParser.OR, 0); }
		public LoopChooseColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopChooseColumns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).enterLoopChooseColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).exitLoopChooseColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationToSQLVisitor ) return ((RelationToSQLVisitor<? extends T>)visitor).visitLoopChooseColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopChooseColumnsContext loopChooseColumns() throws RecognitionException {
		LoopChooseColumnsContext _localctx = new LoopChooseColumnsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_loopChooseColumns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			((LoopChooseColumnsContext)_localctx).t = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
				((LoopChooseColumnsContext)_localctx).t = (Token)_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ChooseColumnsAfterAndOrContext extends ParserRuleContext {
		public Token ident;
		public TerminalNode IDENT() { return getToken(RelationToSQLParser.IDENT, 0); }
		public ChooseColumnsAfterAndOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chooseColumnsAfterAndOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).enterChooseColumnsAfterAndOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).exitChooseColumnsAfterAndOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationToSQLVisitor ) return ((RelationToSQLVisitor<? extends T>)visitor).visitChooseColumnsAfterAndOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChooseColumnsAfterAndOrContext chooseColumnsAfterAndOr() throws RecognitionException {
		ChooseColumnsAfterAndOrContext _localctx = new ChooseColumnsAfterAndOrContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_chooseColumnsAfterAndOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); ((ChooseColumnsAfterAndOrContext)_localctx).ident = match(IDENT);
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

	public static class ProjectSubContext extends ParserRuleContext {
		public Token ident;
		public TerminalNode LEFT() { return getToken(RelationToSQLParser.LEFT, 0); }
		public ChooseSubContext chooseSub(int i) {
			return getRuleContext(ChooseSubContext.class,i);
		}
		public ProjectColumnsContext projectColumns() {
			return getRuleContext(ProjectColumnsContext.class,0);
		}
		public ProjectSubContext projectSub(int i) {
			return getRuleContext(ProjectSubContext.class,i);
		}
		public TerminalNode PAI() { return getToken(RelationToSQLParser.PAI, 0); }
		public TerminalNode RIGHT() { return getToken(RelationToSQLParser.RIGHT, 0); }
		public TerminalNode IDENT() { return getToken(RelationToSQLParser.IDENT, 0); }
		public List<ChooseSubContext> chooseSub() {
			return getRuleContexts(ChooseSubContext.class);
		}
		public List<ProjectSubContext> projectSub() {
			return getRuleContexts(ProjectSubContext.class);
		}
		public ProjectSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projectSub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).enterProjectSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).exitProjectSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationToSQLVisitor ) return ((RelationToSQLVisitor<? extends T>)visitor).visitProjectSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectSubContext projectSub() throws RecognitionException {
		ProjectSubContext _localctx = new ProjectSubContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_projectSub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); match(PAI);
			setState(139); projectColumns();
			setState(140); match(LEFT);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PAI || _la==XIGEMA) {
				{
				setState(143);
				switch (_input.LA(1)) {
				case PAI:
					{
					setState(141); projectSub();
					}
					break;
				case XIGEMA:
					{
					setState(142); chooseSub();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148); ((ProjectSubContext)_localctx).ident = match(IDENT);
			setState(149); match(RIGHT);
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

	public static class ChooseSubContext extends ParserRuleContext {
		public List<LoopChooseColumnsContext> loopChooseColumns() {
			return getRuleContexts(LoopChooseColumnsContext.class);
		}
		public NotEqualContext notEqual(int i) {
			return getRuleContext(NotEqualContext.class,i);
		}
		public List<BigContext> big() {
			return getRuleContexts(BigContext.class);
		}
		public TerminalNode XIGEMA() { return getToken(RelationToSQLParser.XIGEMA, 0); }
		public SmallContext small(int i) {
			return getRuleContext(SmallContext.class,i);
		}
		public BigContext big(int i) {
			return getRuleContext(BigContext.class,i);
		}
		public List<SmallContext> small() {
			return getRuleContexts(SmallContext.class);
		}
		public LoopChooseColumnsContext loopChooseColumns(int i) {
			return getRuleContext(LoopChooseColumnsContext.class,i);
		}
		public List<EqualContext> equal() {
			return getRuleContexts(EqualContext.class);
		}
		public List<NotEqualContext> notEqual() {
			return getRuleContexts(NotEqualContext.class);
		}
		public ChooseColumnsAfterAndOrContext chooseColumnsAfterAndOr(int i) {
			return getRuleContext(ChooseColumnsAfterAndOrContext.class,i);
		}
		public List<ChooseColumnsAfterAndOrContext> chooseColumnsAfterAndOr() {
			return getRuleContexts(ChooseColumnsAfterAndOrContext.class);
		}
		public ChooseColumnsContext chooseColumns() {
			return getRuleContext(ChooseColumnsContext.class,0);
		}
		public EqualContext equal(int i) {
			return getRuleContext(EqualContext.class,i);
		}
		public ChooseSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chooseSub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).enterChooseSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).exitChooseSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationToSQLVisitor ) return ((RelationToSQLVisitor<? extends T>)visitor).visitChooseSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChooseSubContext chooseSub() throws RecognitionException {
		ChooseSubContext _localctx = new ChooseSubContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_chooseSub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); match(XIGEMA);
			setState(152); chooseColumns();
			setState(157);
			switch (_input.LA(1)) {
			case EQUAL:
				{
				setState(153); equal();
				}
				break;
			case NEQUAL:
				{
				setState(154); notEqual();
				}
				break;
			case LESS:
				{
				setState(155); small();
				}
				break;
			case MORE:
				{
				setState(156); big();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(159); loopChooseColumns();
				setState(160); chooseColumnsAfterAndOr();
				setState(165);
				switch (_input.LA(1)) {
				case EQUAL:
					{
					setState(161); equal();
					}
					break;
				case NEQUAL:
					{
					setState(162); notEqual();
					}
					break;
				case LESS:
					{
					setState(163); small();
					}
					break;
				case MORE:
					{
					setState(164); big();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(171);
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

	public static class EqualContext extends ParserRuleContext {
		public Token equ;
		public Token num;
		public TerminalNode EQUAL() { return getToken(RelationToSQLParser.EQUAL, 0); }
		public TerminalNode NUM() { return getToken(RelationToSQLParser.NUM, 0); }
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationToSQLVisitor ) return ((RelationToSQLVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172); ((EqualContext)_localctx).equ = match(EQUAL);
			setState(173); ((EqualContext)_localctx).num = match(NUM);
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

	public static class NotEqualContext extends ParserRuleContext {
		public Token nequ;
		public Token num;
		public TerminalNode NEQUAL() { return getToken(RelationToSQLParser.NEQUAL, 0); }
		public TerminalNode NUM() { return getToken(RelationToSQLParser.NUM, 0); }
		public NotEqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notEqual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).enterNotEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).exitNotEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationToSQLVisitor ) return ((RelationToSQLVisitor<? extends T>)visitor).visitNotEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotEqualContext notEqual() throws RecognitionException {
		NotEqualContext _localctx = new NotEqualContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_notEqual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175); ((NotEqualContext)_localctx).nequ = match(NEQUAL);
			setState(176); ((NotEqualContext)_localctx).num = match(NUM);
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

	public static class SmallContext extends ParserRuleContext {
		public Token less;
		public Token num;
		public TerminalNode LESS() { return getToken(RelationToSQLParser.LESS, 0); }
		public TerminalNode NUM() { return getToken(RelationToSQLParser.NUM, 0); }
		public SmallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_small; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).enterSmall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).exitSmall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationToSQLVisitor ) return ((RelationToSQLVisitor<? extends T>)visitor).visitSmall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SmallContext small() throws RecognitionException {
		SmallContext _localctx = new SmallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_small);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); ((SmallContext)_localctx).less = match(LESS);
			setState(179); ((SmallContext)_localctx).num = match(NUM);
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

	public static class BigContext extends ParserRuleContext {
		public Token more;
		public Token num;
		public TerminalNode NUM() { return getToken(RelationToSQLParser.NUM, 0); }
		public TerminalNode MORE() { return getToken(RelationToSQLParser.MORE, 0); }
		public BigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_big; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).enterBig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationToSQLListener ) ((RelationToSQLListener)listener).exitBig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationToSQLVisitor ) return ((RelationToSQLVisitor<? extends T>)visitor).visitBig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BigContext big() throws RecognitionException {
		BigContext _localctx = new BigContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_big);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); ((BigContext)_localctx).more = match(MORE);
			setState(182); ((BigContext)_localctx).num = match(NUM);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\25\u00bb\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\5\2/\n\2\3\2\3\2\6\2"+
		"\63\n\2\r\2\16\2\64\3\3\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\7\4E\n\4\f\4\16\4H\13\4\3\4\3\4\3\4\3\4\7\4N\n\4\f\4\16\4Q"+
		"\13\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5Y\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5a\n"+
		"\5\7\5c\n\5\f\5\16\5f\13\5\3\5\3\5\3\5\7\5k\n\5\f\5\16\5n\13\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t{\n\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\5\16\u0087\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\7\21\u0092\n\21\f\21\16\21\u0095\13\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00a0\n\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u00a8\n\22\7\22\u00aa\n\22\f\22\16\22\u00ad\13\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\2\27\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*\2\3\4\2\13\13\r\r\u00c0\2\62\3\2\2\2\4"+
		"\66\3\2\2\2\6A\3\2\2\2\bR\3\2\2\2\no\3\2\2\2\fq\3\2\2\2\16s\3\2\2\2\20"+
		"z\3\2\2\2\22|\3\2\2\2\24~\3\2\2\2\26\u0080\3\2\2\2\30\u0082\3\2\2\2\32"+
		"\u0086\3\2\2\2\34\u0088\3\2\2\2\36\u008a\3\2\2\2 \u008c\3\2\2\2\"\u0099"+
		"\3\2\2\2$\u00ae\3\2\2\2&\u00b1\3\2\2\2(\u00b4\3\2\2\2*\u00b7\3\2\2\2,"+
		"/\5\b\5\2-/\5\6\4\2.,\3\2\2\2.-\3\2\2\2/\60\3\2\2\2\60\61\7\25\2\2\61"+
		"\63\3\2\2\2\62.\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\3"+
		"\3\2\2\2\66;\7\6\2\2\67:\5 \21\28:\5\"\22\29\67\3\2\2\298\3\2\2\2:=\3"+
		"\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7\5\2\2?@\7\7\2\2@\5"+
		"\3\2\2\2AB\7\4\2\2BF\5\n\6\2CE\5\16\b\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2"+
		"FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IO\5\4\3\2JK\5\20\t\2KL\5\32\16\2LN\3\2"+
		"\2\2MJ\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\7\3\2\2\2QO\3\2\2\2RS\7"+
		"\b\2\2SX\5\f\7\2TY\5$\23\2UY\5&\24\2VY\5(\25\2WY\5*\26\2XT\3\2\2\2XU\3"+
		"\2\2\2XV\3\2\2\2XW\3\2\2\2Yd\3\2\2\2Z[\5\34\17\2[`\5\36\20\2\\a\5$\23"+
		"\2]a\5&\24\2^a\5(\25\2_a\5*\26\2`\\\3\2\2\2`]\3\2\2\2`^\3\2\2\2`_\3\2"+
		"\2\2ac\3\2\2\2bZ\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2el\3\2\2\2fd\3\2"+
		"\2\2gh\5\20\t\2hi\5\32\16\2ik\3\2\2\2jg\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm"+
		"\3\2\2\2m\t\3\2\2\2nl\3\2\2\2op\7\5\2\2p\13\3\2\2\2qr\7\5\2\2r\r\3\2\2"+
		"\2st\7\f\2\2tu\7\5\2\2u\17\3\2\2\2v{\5\22\n\2w{\5\24\13\2x{\5\26\f\2y"+
		"{\5\30\r\2zv\3\2\2\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2{\21\3\2\2\2|}\7\21"+
		"\2\2}\23\3\2\2\2~\177\7\22\2\2\177\25\3\2\2\2\u0080\u0081\7\23\2\2\u0081"+
		"\27\3\2\2\2\u0082\u0083\7\24\2\2\u0083\31\3\2\2\2\u0084\u0087\5\"\22\2"+
		"\u0085\u0087\5 \21\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\33"+
		"\3\2\2\2\u0088\u0089\t\2\2\2\u0089\35\3\2\2\2\u008a\u008b\7\5\2\2\u008b"+
		"\37\3\2\2\2\u008c\u008d\7\4\2\2\u008d\u008e\5\n\6\2\u008e\u0093\7\6\2"+
		"\2\u008f\u0092\5 \21\2\u0090\u0092\5\"\22\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7\5\2\2\u0097"+
		"\u0098\7\7\2\2\u0098!\3\2\2\2\u0099\u009a\7\b\2\2\u009a\u009f\5\f\7\2"+
		"\u009b\u00a0\5$\23\2\u009c\u00a0\5&\24\2\u009d\u00a0\5(\25\2\u009e\u00a0"+
		"\5*\26\2\u009f\u009b\3\2\2\2\u009f\u009c\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u009e\3\2\2\2\u00a0\u00ab\3\2\2\2\u00a1\u00a2\5\34\17\2\u00a2\u00a7\5"+
		"\36\20\2\u00a3\u00a8\5$\23\2\u00a4\u00a8\5&\24\2\u00a5\u00a8\5(\25\2\u00a6"+
		"\u00a8\5*\26\2\u00a7\u00a3\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a1\3\2\2\2\u00aa"+
		"\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac#\3\2\2\2"+
		"\u00ad\u00ab\3\2\2\2\u00ae\u00af\7\t\2\2\u00af\u00b0\7\n\2\2\u00b0%\3"+
		"\2\2\2\u00b1\u00b2\7\20\2\2\u00b2\u00b3\7\n\2\2\u00b3\'\3\2\2\2\u00b4"+
		"\u00b5\7\16\2\2\u00b5\u00b6\7\n\2\2\u00b6)\3\2\2\2\u00b7\u00b8\7\17\2"+
		"\2\u00b8\u00b9\7\n\2\2\u00b9+\3\2\2\2\23.\649;FOX`dlz\u0086\u0091\u0093"+
		"\u009f\u00a7\u00ab";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}