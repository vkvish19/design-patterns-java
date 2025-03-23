package com.github.vkvish19.designpatterns.behavioural.command_pattern.solution;

public class Button
{
    private Command command;

    public void setCommand(Command command)
    {
        this.command = command;
    }

    public void click()
    {
        command.execute();
    }
}
