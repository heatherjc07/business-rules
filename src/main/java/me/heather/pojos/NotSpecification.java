package me.heather.pojos;

public class NotSpecification<T> extends CompositeSpecification<T>
{
    ISpecification<T> specification;

    public NotSpecification(ISpecification<T> specification)  {
        this.specification = specification;
    }

    public boolean IsSatisfiedBy(T o)   {
        return !this.specification.IsSatisfiedBy(o);
    }
}
