package com.github.vkvish19.designpatterns.structural.adapter_pattern.problem;

public class EmailClient
{
    public static void main(String[] args)
    {
        NotificationService service = new EmailNotificationService();
        service.send("test@gmail.com", "Order delivered", "Your order has been delivered to security");
    }
}
