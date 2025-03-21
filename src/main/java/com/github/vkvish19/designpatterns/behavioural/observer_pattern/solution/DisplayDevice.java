package com.github.vkvish19.designpatterns.behavioural.observer_pattern.solution;

public class DisplayDevice implements Observer
{
    private String displayName;

    public DisplayDevice(String displayName)
    {
        this.displayName = displayName;
    }

    @Override
    public void update(double temperature)
    {
        System.out.printf("Temperature on %s device is %.1f C%n", displayName, temperature);
    }
}
