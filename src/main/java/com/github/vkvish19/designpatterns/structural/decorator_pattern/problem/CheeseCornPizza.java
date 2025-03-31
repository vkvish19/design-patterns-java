package com.github.vkvish19.designpatterns.structural.decorator_pattern.problem;

public class CheeseCornPizza extends CheesePizza
{
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
