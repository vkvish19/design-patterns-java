package com.github.vkvish19.designpatterns.structural.facade_pattern.problem;

// microservice for PaymentManagement
public class PaymentService
{
    public String processPayment(String paymentId)
    {
        // simulate processing payment
        return "Processing payment for payment Id: " + paymentId;
    }
}
