package com.github.vkvish19.designpatterns.structural.facade_pattern.solution;

public class APIGateway
{
    private final UserService userService;
    private final OrderService orderService;
    private final PaymentService paymentService;

    public APIGateway()
    {
        this.userService = new UserService();
        this.orderService = new OrderService();
        this.paymentService = new PaymentService();
    }

    // Task
    public String getUserOrderDetails(String userId, String orderId, String paymentId)
    {
        String userDetails = userService.getUserDetails(userId);
        String orderDetails = orderService.getOrderDetails(orderId);
        String paymentDetails = paymentService.processPayment(paymentId);

        return String.format("%s%n%s%n%s", userDetails, orderDetails, paymentDetails);
    }
}
