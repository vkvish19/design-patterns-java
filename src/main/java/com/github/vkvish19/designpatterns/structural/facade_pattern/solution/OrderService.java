package com.github.vkvish19.designpatterns.structural.facade_pattern.solution;

// microservice for OrderManagement
public class OrderService
{
    public String getOrderDetails(String orderId)
    {
        // simulate fetching order details
        return "Order details for order Id: " + orderId;
    }
}
