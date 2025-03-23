package com.github.vkvish19.designpatterns.behavioural.mediator_pattern.problem;

public class User
{
    private String name;

    public User(String name)
    {
        this.name = name;
    }

    public void sendMessage(String msg, User recipient)
    {
        System.out.printf("%s is sending the message '%s' to recipient %s%n", name, msg, recipient.getName());
    }

    public String getName()
    {
        return name;
    }
}
