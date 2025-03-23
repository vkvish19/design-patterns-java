package com.github.vkvish19.designpatterns.behavioural.mediator_pattern.problem;

public class WithoutMediatorPattern
{
    public static void main(String[] args)
    {
        User rahul = new User("Rahul");
        User rohit = new User("Rohit");
        User virat = new User("Virat");

        rahul.sendMessage("Hello", rohit);
        rahul.sendMessage("Hello", virat);
    }
}
