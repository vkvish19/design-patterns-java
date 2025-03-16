package com.github.vkvish19.designpatterns.creational.factory_pattern.problem;

public class Car implements Transport
{
    @Override
    public void deliver()
    {
        System.out.println("Deliver Car...");
    }
}
