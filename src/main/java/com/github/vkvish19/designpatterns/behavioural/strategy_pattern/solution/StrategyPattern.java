package com.github.vkvish19.designpatterns.behavioural.strategy_pattern.solution;

public class StrategyPattern
{
    public static void main(String[] args)
    {
        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentService(new CreditCardPayment());
        paymentService.makePayment();

        paymentService.setPaymentService(new DebitCardPayment());
        paymentService.makePayment();


        paymentService.setPaymentService(new UPIPayment()); // only here in caller we need to change the payment method.
        paymentService.makePayment();

        // in service class, there is no change needed to be done if we add more payment methods
        // hence it obeys Open/Close principle.
        // Single Responsibility principle is also obeyed.
    }
}
