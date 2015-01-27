package me.heather.compiler;

import me.heather.RuleSetGrammarBaseListener;
import me.heather.RuleSetGrammarParser;
import me.heather.pojos.*;

import java.util.List;
import java.lang.reflect.Constructor;
import org.antlr.v4.runtime.misc.NotNull;

public class TreeBuilder extends RuleSetGrammarBaseListener {

    private RuleSet ruleSet = null;
    private List<CompositeSpecification> specifications = null;
    private String parameter = null;
    private String specificationType = null;
    private SpecificationFactory factory = null;

    public RuleSet getRuleSet() {
        return ruleSet;
    }

    @Override
    public void enterRule_set(@NotNull RuleSetGrammarParser.Rule_setContext ctx) {
        assert ruleSet == null;
        this.ruleSet = new RuleSet();
        this.factory = new SpecificationFactory();

    }


    @Override
    public void exitArea_greater_than(@NotNull RuleSetGrammarParser.Area_greater_thanContext ctx) {

        specificationType= "AreaGreater";

    }

    public void exitSpecification_operand(@NotNull RuleSetGrammarParser.Specification_operandContext ctx) {
        parameter = ctx.numeric_entity().children.get(0).toString();

    }

    @Override
    public void exitIncludes_option(@NotNull RuleSetGrammarParser.Includes_optionContext ctx) {
         specificationType= "IncludesOption";
    }

    @Override public void exitSpecificationExpressionWithOperator(@NotNull RuleSetGrammarParser.SpecificationExpressionWithOperatorContext ctx) {
        ruleSet.addRule(factory.getSpecification(specificationType, parameter));
    }

    }
