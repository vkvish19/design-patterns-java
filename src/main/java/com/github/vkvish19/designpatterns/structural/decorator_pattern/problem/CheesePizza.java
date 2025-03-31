package com.github.vkvish19.designpatterns.structural.decorator_pattern.problem;

public class CheesePizza extends BasicPizza
{
    @Override
    public String getDescription()
    {
        return super.getDescription() + ", Cheese";
    }

    @Override
    public double getCost()
    {
        return super.getCost() + 50.0;
    }
}
