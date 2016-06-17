// Generated from C:\Users\Calton\Documents\Antlr Projects\RelationToSQL\RelationToSQL.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RelationToSQLLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, PAI=2, IDENT=3, LEFT=4, RIGHT=5, XIGEMA=6, EQUAL=7, NUM=8, AND=9, 
		DOU=10, OR=11, LESS=12, MORE=13, NEQUAL=14, BING=15, JIAO=16, NJOIN=17, 
		CHU=18, SEMI=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"WS", "'H'", "IDENT", "'('", "')'", "'G'", "'='", "NUM", "'@'", "','", 
		"'^'", "'<'", "'>'", "'!='", "'*'", "'~'", "'&'", "'/'", "';'"
	};
	public static final String[] ruleNames = {
		"WS", "PAI", "IDENT", "LEFT", "RIGHT", "XIGEMA", "EQUAL", "NUM", "AND", 
		"DOU", "OR", "LESS", "MORE", "NEQUAL", "BING", "JIAO", "NJOIN", "CHU", 
		"SEMI"
	};


	public RelationToSQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RelationToSQL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\25[\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\6\2+\n\2\r\2\16\2,\3\2\3\2\3\3\3\3\3\4\6\4\64"+
		"\n\4\r\4\16\4\65\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\6\tA\n\t\r\t\16\t"+
		"B\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\2\25\3\3\2\5\4\1\7\5\1\t\6\1"+
		"\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20"+
		"\1\37\21\1!\22\1#\23\1%\24\1\'\25\1\3\2\3\5\2\13\f\17\17\"\"]\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\3*\3\2\2\2\5\60\3\2\2\2\7\63\3\2\2\2\t\67\3\2\2\2\13"+
		"9\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2\21@\3\2\2\2\23D\3\2\2\2\25F\3\2\2\2\27"+
		"H\3\2\2\2\31J\3\2\2\2\33L\3\2\2\2\35N\3\2\2\2\37Q\3\2\2\2!S\3\2\2\2#U"+
		"\3\2\2\2%W\3\2\2\2\'Y\3\2\2\2)+\t\2\2\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2"+
		",-\3\2\2\2-.\3\2\2\2./\b\2\2\2/\4\3\2\2\2\60\61\7J\2\2\61\6\3\2\2\2\62"+
		"\64\4c|\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\b"+
		"\3\2\2\2\678\7*\2\28\n\3\2\2\29:\7+\2\2:\f\3\2\2\2;<\7I\2\2<\16\3\2\2"+
		"\2=>\7?\2\2>\20\3\2\2\2?A\4\62;\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2"+
		"\2\2C\22\3\2\2\2DE\7B\2\2E\24\3\2\2\2FG\7.\2\2G\26\3\2\2\2HI\7`\2\2I\30"+
		"\3\2\2\2JK\7>\2\2K\32\3\2\2\2LM\7@\2\2M\34\3\2\2\2NO\7#\2\2OP\7?\2\2P"+
		"\36\3\2\2\2QR\7,\2\2R \3\2\2\2ST\7\u0080\2\2T\"\3\2\2\2UV\7(\2\2V$\3\2"+
		"\2\2WX\7\61\2\2X&\3\2\2\2YZ\7=\2\2Z(\3\2\2\2\6\2,\65B";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}