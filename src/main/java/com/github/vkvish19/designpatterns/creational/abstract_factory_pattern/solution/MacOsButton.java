package com.github.vkvish19.designpatterns.creational.abstract_factory_pattern.solution;

public class MacOsButton implements Button
{
    @Override
    public void render()
    {
        System.out.println("MacOs button...");
    }
}
