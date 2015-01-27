// Generated from me/heather/RuleSetGrammar.g4 by ANTLR 4.3
package me.heather;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RuleSetGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, IF=3, THEN=4, AND=5, OR=6, TRUE=7, FALSE=8, DECIMAL=9, 
		IDENTIFIER=10, NEWLINE=11, COMMENT=12, WS=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'"
	};
	public static final String[] ruleNames = {
		"T__1", "T__0", "IF", "THEN", "AND", "OR", "TRUE", "FALSE", "DECIMAL", 
		"IDENTIFIER", "NEWLINE", "COMMENT", "WS"
	};


	public RuleSetGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RuleSetGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17\u00a1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\5\ns\n\n\3\n\6\nv\n\n\r\n\16\nw\3\n\3\n\6\n|"+
		"\n\n\r\n\16\n}\5\n\u0080\n\n\3\13\3\13\7\13\u0084\n\13\f\13\16\13\u0087"+
		"\13\13\3\f\5\f\u008a\n\f\3\f\3\f\3\r\3\r\3\r\3\r\6\r\u0092\n\r\r\r\16"+
		"\r\u0093\3\r\5\r\u0097\n\r\3\r\3\r\3\16\6\16\u009c\n\16\r\16\16\16\u009d"+
		"\3\16\3\16\3\u0093\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\3\2\7\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\3\3\f\f\5\2"+
		"\13\f\16\17\"\"\u00a8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5;\3\2\2"+
		"\2\7W\3\2\2\2\tZ\3\2\2\2\13_\3\2\2\2\rc\3\2\2\2\17f\3\2\2\2\21k\3\2\2"+
		"\2\23r\3\2\2\2\25\u0081\3\2\2\2\27\u0089\3\2\2\2\31\u008d\3\2\2\2\33\u009b"+
		"\3\2\2\2\35\36\7c\2\2\36\37\7r\2\2\37 \7r\2\2 !\7n\2\2!\"\7k\2\2\"#\7"+
		"e\2\2#$\7c\2\2$%\7v\2\2%&\7k\2\2&\'\7q\2\2\'(\7p\2\2()\7\"\2\2)*\7c\2"+
		"\2*+\7t\2\2+,\7g\2\2,-\7c\2\2-.\7\"\2\2./\7i\2\2/\60\7t\2\2\60\61\7g\2"+
		"\2\61\62\7c\2\2\62\63\7v\2\2\63\64\7g\2\2\64\65\7t\2\2\65\66\7\"\2\2\66"+
		"\67\7v\2\2\678\7j\2\289\7c\2\29:\7p\2\2:\4\3\2\2\2;<\7c\2\2<=\7r\2\2="+
		">\7r\2\2>?\7n\2\2?@\7k\2\2@A\7e\2\2AB\7c\2\2BC\7v\2\2CD\7k\2\2DE\7q\2"+
		"\2EF\7p\2\2FG\7\"\2\2GH\7k\2\2HI\7p\2\2IJ\7e\2\2JK\7n\2\2KL\7w\2\2LM\7"+
		"f\2\2MN\7g\2\2NO\7u\2\2OP\7\"\2\2PQ\7q\2\2QR\7r\2\2RS\7v\2\2ST\7k\2\2"+
		"TU\7q\2\2UV\7p\2\2V\6\3\2\2\2WX\7k\2\2XY\7h\2\2Y\b\3\2\2\2Z[\7v\2\2[\\"+
		"\7j\2\2\\]\7g\2\2]^\7p\2\2^\n\3\2\2\2_`\7c\2\2`a\7p\2\2ab\7f\2\2b\f\3"+
		"\2\2\2cd\7q\2\2de\7t\2\2e\16\3\2\2\2fg\7v\2\2gh\7t\2\2hi\7w\2\2ij\7g\2"+
		"\2j\20\3\2\2\2kl\7h\2\2lm\7c\2\2mn\7n\2\2no\7u\2\2op\7g\2\2p\22\3\2\2"+
		"\2qs\7/\2\2rq\3\2\2\2rs\3\2\2\2su\3\2\2\2tv\t\2\2\2ut\3\2\2\2vw\3\2\2"+
		"\2wu\3\2\2\2wx\3\2\2\2x\177\3\2\2\2y{\7\60\2\2z|\t\2\2\2{z\3\2\2\2|}\3"+
		"\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177y\3\2\2\2\177\u0080\3\2\2"+
		"\2\u0080\24\3\2\2\2\u0081\u0085\t\3\2\2\u0082\u0084\t\4\2\2\u0083\u0082"+
		"\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\26\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a\7\17\2\2\u0089\u0088\3\2\2"+
		"\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7\f\2\2\u008c\30"+
		"\3\2\2\2\u008d\u008e\7\61\2\2\u008e\u008f\7\61\2\2\u008f\u0091\3\2\2\2"+
		"\u0090\u0092\13\2\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0097\t\5\2\2\u0096"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\b\r\2\2\u0099\32\3\2\2"+
		"\2\u009a\u009c\t\6\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\b\16\2\2"+
		"\u00a0\34\3\2\2\2\f\2rw}\177\u0085\u0089\u0093\u0096\u009d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}