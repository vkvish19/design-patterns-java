package com.github.vkvish19.designpatterns.behavioural.strategy_pattern.problem;

public class PaymentService
{
    // huge algorithm in actual.
    // violates Open/Close principle.
    public void processPayment(String paymentMethod)
    {
        if(paymentMethod.equals("CreditCard"))
        {
            System.out.println("Making payment via credit card.");
        }
        else if(paymentMethod.equals("DebitCard"))
        {
            System.out.println("Making payment via debit card.");
        }
        else if(paymentMethod.equals("UPI"))
        {
            System.out.println("Making payment via UPI.");
        }
        else
        {
            System.out.println("Unsupported Payment method.");
        }
    }
}
