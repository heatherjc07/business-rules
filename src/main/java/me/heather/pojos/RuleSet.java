package me.heather.pojos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by heathercampbell on 26/01/2015.
 */
public class RuleSet {
    public final List<CompositeSpecification> rules;

    public RuleSet() {
        this.rules = new ArrayList<>();
    }

    public RuleSet(Collection<CompositeSpecification> rules) {
        this.rules = new ArrayList<>(rules);
    }

    public List<CompositeSpecification> getRules() {
        return Collections.unmodifiableList(rules);
    }

    public void addRule(CompositeSpecification rule) {
        this.rules.add(rule);
    }

    public Boolean containsBrokenRules(Application application)
    {
        for(CompositeSpecification rule:rules)
        {
            if(!rule.IsSatisfiedBy(application))
            {
                return true;
            }
        }
        return false;
    }
}
