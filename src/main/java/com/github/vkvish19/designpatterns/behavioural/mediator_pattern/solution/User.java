package com.github.vkvish19.designpatterns.behavioural.mediator_pattern.solution;

public class User
{
    private final String name;
    private final ChatMediator chatMediator;

    public User(String name, ChatMediator chatMediator)
    {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public void sendMessage(String msg)
    {
        System.out.printf("%s is sending the message '%s'%n", name, msg);
        chatMediator.sendMessage(msg, this);
    }

    public void receiveMsg(String msg, User sender)
    {
        System.out.printf("%s received the message '%s' from Sender: %s%n", name, msg, sender.getName());
    }

    public String getName()
    {
        return name;
    }
}
