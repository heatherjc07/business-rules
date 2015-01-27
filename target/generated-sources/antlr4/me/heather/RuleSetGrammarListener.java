// Generated from me/heather/RuleSetGrammar.g4 by ANTLR 4.3
package me.heather;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RuleSetGrammarParser}.
 */
public interface RuleSetGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#single_rule}.
	 * @param ctx the parse tree
	 */
	void enterSingle_rule(@NotNull RuleSetGrammarParser.Single_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#single_rule}.
	 * @param ctx the parse tree
	 */
	void exitSingle_rule(@NotNull RuleSetGrammarParser.Single_ruleContext ctx);

	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#area_greater_than}.
	 * @param ctx the parse tree
	 */
	void enterArea_greater_than(@NotNull RuleSetGrammarParser.Area_greater_thanContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#area_greater_than}.
	 * @param ctx the parse tree
	 */
	void exitArea_greater_than(@NotNull RuleSetGrammarParser.Area_greater_thanContext ctx);

	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#specification_operand}.
	 * @param ctx the parse tree
	 */
	void enterSpecification_operand(@NotNull RuleSetGrammarParser.Specification_operandContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#specification_operand}.
	 * @param ctx the parse tree
	 */
	void exitSpecification_operand(@NotNull RuleSetGrammarParser.Specification_operandContext ctx);

	/**
	 * Enter a parse tree produced by the {@code LogicalExpressionAnd}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpressionAnd(@NotNull RuleSetGrammarParser.LogicalExpressionAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpressionAnd}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpressionAnd(@NotNull RuleSetGrammarParser.LogicalExpressionAndContext ctx);

	/**
	 * Enter a parse tree produced by the {@code LogicalExpressionOr}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpressionOr(@NotNull RuleSetGrammarParser.LogicalExpressionOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpressionOr}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpressionOr(@NotNull RuleSetGrammarParser.LogicalExpressionOrContext ctx);

	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#rule_set}.
	 * @param ctx the parse tree
	 */
	void enterRule_set(@NotNull RuleSetGrammarParser.Rule_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#rule_set}.
	 * @param ctx the parse tree
	 */
	void exitRule_set(@NotNull RuleSetGrammarParser.Rule_setContext ctx);

	/**
	 * Enter a parse tree produced by the {@code NumericConst}
	 * labeled alternative in {@link RuleSetGrammarParser#numeric_entity}.
	 * @param ctx the parse tree
	 */
	void enterNumericConst(@NotNull RuleSetGrammarParser.NumericConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumericConst}
	 * labeled alternative in {@link RuleSetGrammarParser#numeric_entity}.
	 * @param ctx the parse tree
	 */
	void exitNumericConst(@NotNull RuleSetGrammarParser.NumericConstContext ctx);

	/**
	 * Enter a parse tree produced by the {@code SpecificationExpressionWithOperator}
	 * labeled alternative in {@link RuleSetGrammarParser#specification_expr}.
	 * @param ctx the parse tree
	 */
	void enterSpecificationExpressionWithOperator(@NotNull RuleSetGrammarParser.SpecificationExpressionWithOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SpecificationExpressionWithOperator}
	 * labeled alternative in {@link RuleSetGrammarParser#specification_expr}.
	 * @param ctx the parse tree
	 */
	void exitSpecificationExpressionWithOperator(@NotNull RuleSetGrammarParser.SpecificationExpressionWithOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#includes_option}.
	 * @param ctx the parse tree
	 */
	void enterIncludes_option(@NotNull RuleSetGrammarParser.Includes_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#includes_option}.
	 * @param ctx the parse tree
	 */
	void exitIncludes_option(@NotNull RuleSetGrammarParser.Includes_optionContext ctx);

	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#specification}.
	 * @param ctx the parse tree
	 */
	void enterSpecification(@NotNull RuleSetGrammarParser.SpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#specification}.
	 * @param ctx the parse tree
	 */
	void exitSpecification(@NotNull RuleSetGrammarParser.SpecificationContext ctx);

	/**
	 * Enter a parse tree produced by the {@code NumericVariable}
	 * labeled alternative in {@link RuleSetGrammarParser#numeric_entity}.
	 * @param ctx the parse tree
	 */
	void enterNumericVariable(@NotNull RuleSetGrammarParser.NumericVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumericVariable}
	 * labeled alternative in {@link RuleSetGrammarParser#numeric_entity}.
	 * @param ctx the parse tree
	 */
	void exitNumericVariable(@NotNull RuleSetGrammarParser.NumericVariableContext ctx);

	/**
	 * Enter a parse tree produced by the {@code SpecificationExpression}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterSpecificationExpression(@NotNull RuleSetGrammarParser.SpecificationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SpecificationExpression}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitSpecificationExpression(@NotNull RuleSetGrammarParser.SpecificationExpressionContext ctx);
}