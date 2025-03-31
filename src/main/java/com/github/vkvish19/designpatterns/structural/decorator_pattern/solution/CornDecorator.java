package com.github.vkvish19.designpatterns.structural.decorator_pattern.solution;

public class CornDecorator extends PizzaDecorator
{
    public CornDecorator(Pizza decoratedPizza)
    {
        super(decoratedPizza);
    }

    @Override
    public String getDescription()
    {
        return super.getDescription() + ", Corn";
    }

    @Override
    public double getCost()
    {
        return super.getCost() + 35.0;
    }
}
