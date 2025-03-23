package com.github.vkvish19.designpatterns.behavioural.state_pattern.solution;

public class Walking implements TransportationMode
{
    @Override
    public int calculateETA() {
        System.out.println("Calculating ETA for walking...");
        return 55;
    }

    @Override
    public String getDirections() {
        return "Directions for walking!";
    }
}
