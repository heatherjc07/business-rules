package me.heather.pojos;

/**
 * Created by heathercampbell on 26/01/2015.
 */
public class AreaGreaterThanSpecification extends CompositeSpecification<Application>{
    float targetArea;

    public AreaGreaterThanSpecification(Float targetArea)
    {
        this.targetArea = targetArea;
    }

    public boolean IsSatisfiedBy(Application o){
        return o.getArea() > targetArea;
    }

}
