// Generated from me/heather/RuleSetGrammar.g4 by ANTLR 4.3
package me.heather;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RuleSetGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, IF=3, THEN=4, AND=5, OR=6, TRUE=7, FALSE=8, DECIMAL=9, 
		IDENTIFIER=10, NEWLINE=11, COMMENT=12, WS=13;
	public static final String[] tokenNames = {
		"<INVALID>", "'application area greater than'", "'application includes option'", 
		"'if'", "'then'", "'and'", "'or'", "'true'", "'false'", "DECIMAL", "IDENTIFIER", 
		"NEWLINE", "COMMENT", "WS"
	};
	public static final int
		RULE_rule_set = 0, RULE_single_rule = 1, RULE_logical_expr = 2, RULE_specification_expr = 3, 
		RULE_specification = 4, RULE_specification_operand = 5, RULE_area_greater_than = 6, 
		RULE_includes_option = 7, RULE_numeric_entity = 8;
	public static final String[] ruleNames = {
		"rule_set", "single_rule", "logical_expr", "specification_expr", "specification", 
		"specification_operand", "area_greater_than", "includes_option", "numeric_entity"
	};

	@Override
	public String getGrammarFileName() { return "RuleSetGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RuleSetGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Rule_setContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(RuleSetGrammarParser.EOF, 0); }
		public Single_ruleContext single_rule(int i) {
			return getRuleContext(Single_ruleContext.class,i);
		}
		public List<Single_ruleContext> single_rule() {
			return getRuleContexts(Single_ruleContext.class);
		}
		public Rule_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterRule_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitRule_set(this);
		}
	}

	public final Rule_setContext rule_set() throws RecognitionException {
		Rule_setContext _localctx = new Rule_setContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_rule_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__0) {
				{
				{
				setState(18); single_rule();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24); match(EOF);
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

	public static class Single_ruleContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(RuleSetGrammarParser.NEWLINE, 0); }
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public Single_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterSingle_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitSingle_rule(this);
		}
	}

	public final Single_ruleContext single_rule() throws RecognitionException {
		Single_ruleContext _localctx = new Single_ruleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_single_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); logical_expr(0);
			setState(27); match(NEWLINE);
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

	public static class Logical_exprContext extends ParserRuleContext {
		public Logical_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expr; }
	 
		public Logical_exprContext() { }
		public void copyFrom(Logical_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalExpressionAndContext extends Logical_exprContext {
		public List<Logical_exprContext> logical_expr() {
			return getRuleContexts(Logical_exprContext.class);
		}
		public TerminalNode AND() { return getToken(RuleSetGrammarParser.AND, 0); }
		public Logical_exprContext logical_expr(int i) {
			return getRuleContext(Logical_exprContext.class,i);
		}
		public LogicalExpressionAndContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterLogicalExpressionAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitLogicalExpressionAnd(this);
		}
	}
	public static class LogicalExpressionOrContext extends Logical_exprContext {
		public List<Logical_exprContext> logical_expr() {
			return getRuleContexts(Logical_exprContext.class);
		}
		public TerminalNode OR() { return getToken(RuleSetGrammarParser.OR, 0); }
		public Logical_exprContext logical_expr(int i) {
			return getRuleContext(Logical_exprContext.class,i);
		}
		public LogicalExpressionOrContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterLogicalExpressionOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitLogicalExpressionOr(this);
		}
	}
	public static class SpecificationExpressionContext extends Logical_exprContext {
		public Specification_exprContext specification_expr() {
			return getRuleContext(Specification_exprContext.class,0);
		}
		public SpecificationExpressionContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterSpecificationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitSpecificationExpression(this);
		}
	}

	public final Logical_exprContext logical_expr() throws RecognitionException {
		return logical_expr(0);
	}

	private Logical_exprContext logical_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_exprContext _localctx = new Logical_exprContext(_ctx, _parentState);
		Logical_exprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_logical_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SpecificationExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(30); specification_expr();
			}
			_ctx.stop = _input.LT(-1);
			setState(40);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(38);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalExpressionAndContext(new Logical_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expr);
						setState(32);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(33); match(AND);
						setState(34); logical_expr(4);
						}
						break;

					case 2:
						{
						_localctx = new LogicalExpressionOrContext(new Logical_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expr);
						setState(35);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(36); match(OR);
						setState(37); logical_expr(3);
						}
						break;
					}
					} 
				}
				setState(42);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class Specification_exprContext extends ParserRuleContext {
		public Specification_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specification_expr; }
	 
		public Specification_exprContext() { }
		public void copyFrom(Specification_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SpecificationExpressionWithOperatorContext extends Specification_exprContext {
		public SpecificationContext specification() {
			return getRuleContext(SpecificationContext.class,0);
		}
		public Specification_operandContext specification_operand() {
			return getRuleContext(Specification_operandContext.class,0);
		}
		public SpecificationExpressionWithOperatorContext(Specification_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterSpecificationExpressionWithOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitSpecificationExpressionWithOperator(this);
		}
	}

	public final Specification_exprContext specification_expr() throws RecognitionException {
		Specification_exprContext _localctx = new Specification_exprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_specification_expr);
		try {
			_localctx = new SpecificationExpressionWithOperatorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(43); specification();
			setState(44); specification_operand();
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

	public static class SpecificationContext extends ParserRuleContext {
		public Includes_optionContext includes_option() {
			return getRuleContext(Includes_optionContext.class,0);
		}
		public Area_greater_thanContext area_greater_than() {
			return getRuleContext(Area_greater_thanContext.class,0);
		}
		public SpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitSpecification(this);
		}
	}

	public final SpecificationContext specification() throws RecognitionException {
		SpecificationContext _localctx = new SpecificationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_specification);
		try {
			setState(48);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46); area_greater_than();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(47); includes_option();
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

	public static class Specification_operandContext extends ParserRuleContext {
		public Numeric_entityContext numeric_entity() {
			return getRuleContext(Numeric_entityContext.class,0);
		}
		public Specification_operandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specification_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterSpecification_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitSpecification_operand(this);
		}
	}

	public final Specification_operandContext specification_operand() throws RecognitionException {
		Specification_operandContext _localctx = new Specification_operandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_specification_operand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); numeric_entity();
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

	public static class Area_greater_thanContext extends ParserRuleContext {
		public Area_greater_thanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_area_greater_than; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterArea_greater_than(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitArea_greater_than(this);
		}
	}

	public final Area_greater_thanContext area_greater_than() throws RecognitionException {
		Area_greater_thanContext _localctx = new Area_greater_thanContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_area_greater_than);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); match(T__1);
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

	public static class Includes_optionContext extends ParserRuleContext {
		public Includes_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includes_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterIncludes_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitIncludes_option(this);
		}
	}

	public final Includes_optionContext includes_option() throws RecognitionException {
		Includes_optionContext _localctx = new Includes_optionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_includes_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); match(T__0);
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

	public static class Numeric_entityContext extends ParserRuleContext {
		public Numeric_entityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_entity; }
	 
		public Numeric_entityContext() { }
		public void copyFrom(Numeric_entityContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumericConstContext extends Numeric_entityContext {
		public TerminalNode DECIMAL() { return getToken(RuleSetGrammarParser.DECIMAL, 0); }
		public NumericConstContext(Numeric_entityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterNumericConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitNumericConst(this);
		}
	}
	public static class NumericVariableContext extends Numeric_entityContext {
		public TerminalNode IDENTIFIER() { return getToken(RuleSetGrammarParser.IDENTIFIER, 0); }
		public NumericVariableContext(Numeric_entityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterNumericVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitNumericVariable(this);
		}
	}

	public final Numeric_entityContext numeric_entity() throws RecognitionException {
		Numeric_entityContext _localctx = new Numeric_entityContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_numeric_entity);
		try {
			setState(58);
			switch (_input.LA(1)) {
			case DECIMAL:
				_localctx = new NumericConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(56); match(DECIMAL);
				}
				break;
			case IDENTIFIER:
				_localctx = new NumericVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(57); match(IDENTIFIER);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2: return logical_expr_sempred((Logical_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logical_expr_sempred(Logical_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 3);

		case 1: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17?\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\7\2\26"+
		"\n\2\f\2\16\2\31\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\7\4)\n\4\f\4\16\4,\13\4\3\5\3\5\3\5\3\6\3\6\5\6\63\n\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\5\n=\n\n\3\n\2\3\6\13\2\4\6\b\n\f\16\20\22"+
		"\2\2:\2\27\3\2\2\2\4\34\3\2\2\2\6\37\3\2\2\2\b-\3\2\2\2\n\62\3\2\2\2\f"+
		"\64\3\2\2\2\16\66\3\2\2\2\208\3\2\2\2\22<\3\2\2\2\24\26\5\4\3\2\25\24"+
		"\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\32\3\2\2\2\31\27"+
		"\3\2\2\2\32\33\7\2\2\3\33\3\3\2\2\2\34\35\5\6\4\2\35\36\7\r\2\2\36\5\3"+
		"\2\2\2\37 \b\4\1\2 !\5\b\5\2!*\3\2\2\2\"#\f\5\2\2#$\7\7\2\2$)\5\6\4\6"+
		"%&\f\4\2\2&\'\7\b\2\2\')\5\6\4\5(\"\3\2\2\2(%\3\2\2\2),\3\2\2\2*(\3\2"+
		"\2\2*+\3\2\2\2+\7\3\2\2\2,*\3\2\2\2-.\5\n\6\2./\5\f\7\2/\t\3\2\2\2\60"+
		"\63\5\16\b\2\61\63\5\20\t\2\62\60\3\2\2\2\62\61\3\2\2\2\63\13\3\2\2\2"+
		"\64\65\5\22\n\2\65\r\3\2\2\2\66\67\7\3\2\2\67\17\3\2\2\289\7\4\2\29\21"+
		"\3\2\2\2:=\7\13\2\2;=\7\f\2\2<:\3\2\2\2<;\3\2\2\2=\23\3\2\2\2\7\27(*\62"+
		"<";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}