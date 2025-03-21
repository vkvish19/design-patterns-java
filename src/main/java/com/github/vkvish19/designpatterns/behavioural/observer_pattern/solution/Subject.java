package com.github.vkvish19.designpatterns.behavioural.observer_pattern.solution;

public interface Subject
{
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
