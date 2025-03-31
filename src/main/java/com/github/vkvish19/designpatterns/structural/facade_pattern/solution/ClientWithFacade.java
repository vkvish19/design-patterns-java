package com.github.vkvish19.designpatterns.structural.facade_pattern.solution;

public class ClientWithFacade
{
    public static void main(String[] args)
    {
        APIGateway apiGateway = new APIGateway();
        String userOrderDetails = apiGateway.getUserOrderDetails("123", "456", "789");
        System.out.println(userOrderDetails);

        // Simplified
        // Decoupling
        // Consistency
        // Centralized Control
    }
}
