package me.heather;

import me.heather.compiler.Compiler;
import me.heather.pojos.Application;
import me.heather.pojos.RuleSet;
import java.util.Arrays;

public class CompilerApplication {
    public static void main(String[] args) {
        Compiler compiler = new Compiler();
        RuleSet ruleSet = compiler.compile("application area greater than 3.00\n" +
                "application includes option GH\n");
        Application application = new Application();
        application.setArea(2);
        application.setOptions(Arrays.asList("HA", "GH"));
        Boolean result = ruleSet.containsBrokenRules(application);
        System.out.println("Broken rules: " + result);
    }
}
