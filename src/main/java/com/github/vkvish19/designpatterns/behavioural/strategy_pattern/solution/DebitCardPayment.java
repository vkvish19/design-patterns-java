package com.github.vkvish19.designpatterns.behavioural.strategy_pattern.solution;

public class DebitCardPayment implements PaymentStrategy
{
    @Override
    public void processPayment()
    {
        System.out.println("Making payment via debit card.");
    }
}
