package com.github.vkvish19.designpatterns.behavioural.mediator_pattern.solution;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator
{
    private final List<User> users;

    public ChatRoom()
    {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User sender)
    {
        for(User receiver : users)
        {
            // doing direct object comparison because two Users can have same name.
            // so only if sender and receiver are same object only then we do not send msg to it.
            if(receiver != sender)
                receiver.receiveMsg(msg, sender);
        }
    }

    @Override
    public void addUser(User user)
    {
        if(user != null)
            users.add(user);
    }
}
