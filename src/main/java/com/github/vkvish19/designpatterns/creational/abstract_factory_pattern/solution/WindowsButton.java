package com.github.vkvish19.designpatterns.creational.abstract_factory_pattern.solution;

public class WindowsButton implements Button
{
    @Override
    public void render()
    {
        System.out.println("Windows button...");
    }
}
