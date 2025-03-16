package com.github.vkvish19.designpatterns.creational.factory_pattern.problem;

public class TransportService
{
    public static void main(String[] args)
    {
        // tightly coupled.
        Transport car = new Car();
        Transport bike = new Bike();
        Transport bus = new Bus();

        car.deliver();
        bike.deliver();
        bus.deliver();

        // if we add new transport implementation, we need to modify this class as well which means we are violating
        // Open/Close principle.
    }
}
