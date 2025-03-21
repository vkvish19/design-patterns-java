package com.github.vkvish19.designpatterns.behavioural.observer_pattern.solution;

public class MobileDevice implements Observer
{
    @Override
    public void update(double temperature)
    {
        System.out.println("Temperature on Mobile device is " + temperature + " C");
    }
}
