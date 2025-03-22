package com.github.vkvish19.designpatterns.behavioural.strategy_pattern.solution;

public class PaymentService
{
    private PaymentStrategy strategy;

    public void setPaymentService(PaymentStrategy strategy)
    {
        this.strategy = strategy;
    }

    public void makePayment()
    {
        strategy.processPayment();
    }
}
