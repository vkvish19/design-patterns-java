package com.github.vkvish19.designpatterns.behavioural.state_pattern.solution;

public class Train implements TransportationMode
{
    @Override
    public int calculateETA() {
        System.out.println("Calculating ETA for train...");
        return 20;
    }

    @Override
    public String getDirections() {
        return "Directions for train!";
    }
}
