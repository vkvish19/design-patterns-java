package com.github.vkvish19.designpatterns.behavioural.state_pattern.solution;

public class DirectionService
{
    private TransportationMode transportationMode;

    public DirectionService(TransportationMode transportationMode)
    {
        this.transportationMode = transportationMode;
    }

    public void setTransportationMode(TransportationMode transportationMode)
    {
        this.transportationMode = transportationMode;
    }

    public int getETA()
    {
        return transportationMode.calculateETA();
    }

    public String getDirections()
    {
        return transportationMode.getDirections();
    }
}
