package me.heather.compiler;

import me.heather.RuleSetGrammarLexer;
import me.heather.RuleSetGrammarParser;
import me.heather.pojos.RuleSet;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

/**
 * Created by heathercampbell on 26/01/2015.
 */
public class Compiler {
    public RuleSet compile(String inputString) {
        ANTLRInputStream input = new ANTLRInputStream(inputString);
        RuleSetGrammarLexer lexer = new RuleSetGrammarLexer(input);
        TokenStream tokens = new CommonTokenStream(lexer);
        RuleSetGrammarParser parser = new RuleSetGrammarParser(tokens);

        TreeBuilder treeBuilder = new TreeBuilder();
        parser.addParseListener(treeBuilder);
        parser.setErrorHandler(new ExceptionThrowingErrorHandler());

        parser.rule_set();

        return treeBuilder.getRuleSet();
    }
}
