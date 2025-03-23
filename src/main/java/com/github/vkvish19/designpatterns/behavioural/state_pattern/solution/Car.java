package com.github.vkvish19.designpatterns.behavioural.state_pattern.solution;

public class Car implements TransportationMode
{
    @Override
    public int calculateETA() {
        System.out.println("Calculating ETA for car...");
        return 12;
    }

    @Override
    public String getDirections() {
        return "Directions for car!";
    }
}
