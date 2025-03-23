package com.github.vkvish19.designpatterns.behavioural.state_pattern.problem;

/**
 *  Problems with this code:-
 *      1. Tight coupling and complex conditional logic.
 *      2. Violation of the Open/Close principle.
 *      3. Code Duplication and Reduced maintainability.
 *      4. Scalability Issues.
 */
public class DirectionService
{
    private TransportationMode mode;

    public DirectionService(TransportationMode mode)
    {
        this.mode = mode;
    }

    public void setMode(TransportationMode mode)
    {
        this.mode = mode;
    }

    // method to calculate ETA depending on mode of transport
    public int getETA()
    {
        switch(mode)
        {
            case WALKING:
                System.out.println("ETA for walking");
                return 55;
            case CYCLING:
                System.out.println("ETA for cycling");
                return 35;
            case CAR:
                System.out.println("ETA for car");
                return 12;
            case TRAIN:
                System.out.println("ETA for train");
                return 20;
            default:
                throw new IllegalArgumentException("Unsupported mode of transport: " + mode);
        }
    }

    // method to calculate direction depending on mode of transport
    public String getDirections()
    {
        switch(mode)
        {
            case WALKING:
                return "Directions for walking";
            case CYCLING:
                return "Directions for cycling";
            case CAR:
                return "Directions for car";
            case TRAIN:
                return "Directions for train";
            default:
                throw new IllegalArgumentException("Unsupported mode of transport: " + mode);
        }
    }
}
