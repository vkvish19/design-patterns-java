package com.github.vkvish19.designpatterns.structural.decorator_pattern.solution;

public abstract class PizzaDecorator implements Pizza
{
    protected Pizza decoratedPizza;

    public PizzaDecorator(Pizza decoratedPizza)
    {
        this.decoratedPizza = decoratedPizza;
    }

    @Override
    public String getDescription()
    {
        return decoratedPizza.getDescription();
    }

    @Override
    public double getCost()
    {
        return decoratedPizza.getCost();
    }
}
