package me.heather.pojos;

/**
 * Created by heathercampbell on 26/01/2015.
 */
public class IncludesOptionSpecification extends CompositeSpecification<Application>{
    String option;

    public IncludesOptionSpecification(String option)
    {
        this.option= option.toString();
    }

    public boolean IsSatisfiedBy(Application o){
        return o.getOptions().contains(option);
    }

}
