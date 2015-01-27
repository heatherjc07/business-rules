package me.heather.pojos;

/**
 * Created by heathercampbell on 27/01/2015.
 */
public class SpecificationFactory {
    public CompositeSpecification getSpecification(String specificationType, String param){
        if(specificationType == null){
            return null;
        }
        if(specificationType.equalsIgnoreCase("AreaGreater")){
            return new AreaGreaterThanSpecification(Float.parseFloat(param));

        } else if(specificationType.equalsIgnoreCase("IncludesOption")){
            return new IncludesOptionSpecification(param);

        }

        return null;
    }
}
