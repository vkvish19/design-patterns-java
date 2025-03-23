package com.github.vkvish19.designpatterns.behavioural.mediator_pattern.solution;

public interface ChatMediator
{
    void sendMessage(String msg, User user);
    void addUser(User user);
}
