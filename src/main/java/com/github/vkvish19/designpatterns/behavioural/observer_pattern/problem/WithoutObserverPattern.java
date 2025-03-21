package com.github.vkvish19.designpatterns.behavioural.observer_pattern.problem;

public class WithoutObserverPattern
{
    public static void main(String[] args)
    {
        DisplayDevice displayDevice = new DisplayDevice();
        WeatherStation weatherStation = new WeatherStation(displayDevice);
        // tight coupling between station and the devices.b
        weatherStation.setTemperature(26);
        weatherStation.setTemperature(32);
    }
}
