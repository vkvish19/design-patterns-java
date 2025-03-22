package com.github.vkvish19.designpatterns.behavioural.strategy_pattern.solution;

public class CreditCardPayment implements PaymentStrategy
{
    @Override
    public void processPayment()
    {
        System.out.println("Making payment via credit card.");
    }
}
