package com.github.vkvish19.designpatterns.behavioural.observer_pattern.problem;

public class WeatherStation
{
    private double temperature;
    private DisplayDevice displayDevice;  // can be multiple such devices later on.

    public WeatherStation(DisplayDevice displayDevice)
    {
        this.displayDevice = displayDevice;
    }

    public void setTemperature(double temperature)
    {
        this.temperature = temperature;
        notifyDevice();
    }

    public void notifyDevice()
    {
        displayDevice.showTemperature(temperature);
    }
}
