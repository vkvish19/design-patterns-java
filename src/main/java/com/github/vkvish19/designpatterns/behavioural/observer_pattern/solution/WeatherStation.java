package com.github.vkvish19.designpatterns.behavioural.observer_pattern.solution;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject
{
    private double temperature;
    private List<Observer> observerList;

    public WeatherStation()
    {
        observerList = new ArrayList<>();
    }

    public void setTemperature(double temperature)
    {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void attach(Observer observer)
    {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer)
    {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers()
    {
        for(Observer observer : observerList)
        {
            observer.update(temperature);  // runtime polymorphism
        }
    }
}
