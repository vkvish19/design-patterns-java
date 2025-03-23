package com.github.vkvish19.designpatterns.behavioural.state_pattern.problem;

public class WithoutStatePattern
{
    public static void main(String[] args)
    {
        DirectionService directionService = new DirectionService(TransportationMode.TRAIN);
        System.out.println(directionService.getDirections());
        directionService.getETA();

        directionService.setMode(TransportationMode.CYCLING);
        System.out.println(directionService.getDirections());
        directionService.getETA();
    }
}
