package com.github.vkvish19.designpatterns.structural.decorator_pattern.solution;

public class CheeseDecorator extends PizzaDecorator
{
    public CheeseDecorator(Pizza decoratedPizza)
    {
        super(decoratedPizza);
    }

    @Override
    public String getDescription()
    {
        return decoratedPizza.getDescription() + ", Cheese";
    }

    @Override
    public double getCost()
    {
        return decoratedPizza.getCost() + 50.0;
    }
}
