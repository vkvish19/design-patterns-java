package com.github.vkvish19.designpatterns.behavioural.state_pattern.solution;

public class Cycling implements TransportationMode
{
    @Override
    public int calculateETA() {
        System.out.println("Calculating ETA for cycling...");
        return 35;
    }

    @Override
    public String getDirections() {
        return "Directions for cycling!";
    }
}
