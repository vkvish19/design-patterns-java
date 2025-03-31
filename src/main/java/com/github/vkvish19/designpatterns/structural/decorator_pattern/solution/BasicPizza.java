package com.github.vkvish19.designpatterns.structural.decorator_pattern.solution;

public class BasicPizza implements Pizza
{
    @Override
    public String getDescription()
    {
        return "Basic pizza";
    }

    @Override
    public double getCost()
    {
        return 100.0;
    }
}
