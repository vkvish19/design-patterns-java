package com.github.vkvish19.designpatterns.structural.facade_pattern.problem;

public class ClientWithoutFacade
{
    public static void main(String[] args)
    {
        // client interacts with all services directly
        UserService userService = new UserService();
        OrderService orderService = new OrderService();
        PaymentService paymentService = new PaymentService();

        // Tasks
        System.out.println(userService.getUserDetails("123"));
        System.out.println(orderService.getOrderDetails("456"));
        System.out.println(paymentService.processPayment("789"));

        // Problems
        //  -> complexity
        //  -> tight coupling
    }
}
