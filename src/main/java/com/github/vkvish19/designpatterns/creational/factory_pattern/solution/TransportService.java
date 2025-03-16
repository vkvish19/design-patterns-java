package com.github.vkvish19.designpatterns.creational.factory_pattern.solution;

public class TransportService
{
    public static void main(String[] args)
    {
        // Creates Runtime.
        // Loose coupling
        // Honours Open/Close principle.
        Transport vehicle = TransportFactory.createTransport("biKe");
        vehicle.deliver();

        vehicle = TransportFactory.createTransport("car");
        vehicle.deliver();

        try
        {
            TransportFactory.createTransport("truck"); // exception expected.
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
