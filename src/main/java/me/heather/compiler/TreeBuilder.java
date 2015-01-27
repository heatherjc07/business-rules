package me.heather.compiler;

import me.heather.RuleSetGrammarBaseListener;
import me.heather.RuleSetGrammarParser;
import me.heather.pojos.AreaGreaterThanSpecification;
import me.heather.pojos.CompositeSpecification;
import me.heather.pojos.IncludesOptionSpecification;
import me.heather.pojos.RuleSet;
import java.util.List;
import java.lang.reflect.Constructor;
import org.antlr.v4.runtime.misc.NotNull;

public class TreeBuilder extends RuleSetGrammarBaseListener {

    private RuleSet ruleSet = null;
    private List<CompositeSpecification> specifications = null;
    private Object parameter = null;

    public RuleSet getRuleSet() {
        return ruleSet;
    }

    @Override
    public void enterRule_set(@NotNull RuleSetGrammarParser.Rule_setContext ctx) {
        assert ruleSet == null;
        this.ruleSet = new RuleSet();
    }


    @Override
    public void exitArea_greater_than(@NotNull RuleSetGrammarParser.Area_greater_thanContext ctx) {

        ruleSet.addRule(new AreaGreaterThanSpecification(5f));

    }

    public void exitSpecification_operand(@NotNull RuleSetGrammarParser.Specification_operandContext ctx) {
        parameter = ctx.numeric_entity();
        int i = 1;
    }

    @Override
    public void exitIncludes_option(@NotNull RuleSetGrammarParser.Includes_optionContext ctx) {
        ruleSet.addRule(new IncludesOptionSpecification("GH"));
    }

}
