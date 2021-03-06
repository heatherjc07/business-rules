package me.heather.pojos;

/**
 * Created by heathercampbell on 26/01/2015.
 */
public class OrSpecification<T> extends CompositeSpecification<T>
{
    ISpecification<T> leftSpecification;
    ISpecification<T> rightSpecification;

    public OrSpecification(ISpecification<T> left, ISpecification<T> right)  {
        this.leftSpecification = left;
        this.rightSpecification = right;
    }

    public boolean IsSatisfiedBy(T o)   {
        return this.leftSpecification.IsSatisfiedBy(o)
                || this.rightSpecification.IsSatisfiedBy(o);
    }
}
