package com.github.vkvish19.designpatterns.behavioural.strategy_pattern.problem;

public class WithoutStrategyPattern
{
    public static void main(String[] args)
    {
        PaymentService paymentService = new PaymentService();
        paymentService.processPayment("CreditCard");
        paymentService.processPayment("UPI");
        paymentService.processPayment("CashOnDelivery");
        paymentService.processPayment("DebitCard");
    }
}
