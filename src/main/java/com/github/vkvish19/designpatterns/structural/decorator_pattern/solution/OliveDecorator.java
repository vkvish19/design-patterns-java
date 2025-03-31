package com.github.vkvish19.designpatterns.structural.decorator_pattern.solution;

public class OliveDecorator extends PizzaDecorator
{
    public OliveDecorator(Pizza decoratedPizza)
    {
        super(decoratedPizza);
    }

    @Override
    public String getDescription()
    {
        return super.getDescription() + ", Olive";
    }

    @Override
    public double getCost()
    {
        return super.getCost() + 35.0;
    }
}
