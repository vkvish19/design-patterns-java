package com.github.vkvish19.designpatterns.structural.adapter_pattern.solution;

/**
 *  Problem: When two systems or components have incompatible interfaces, they cannot work together directly.
 *  </p>
 *  Solution: The Adapter pattern bridges the gap by converting the interface of one class into another
 *          that the client expects.
 *  </p>
 *  Real world Analogy: A power adapter that allows a device with a US power plug to fit and work
 *          with a European power socket.
 *  </p>
 *  Examples:
 *      -> Adapters in Software Frameworks.
 *      -> Adapter in Java I/O.
 *      -> Adapter in APIs.
 *  </p>
 *  Benefits:
 *      -> Reusability
 *      -> Flexibility
 *      -> Decoupling
 */
public class EmailClientUsingAdapterPattern
{
    public static void main(String[] args)
    {
        SendGridService sendGridService = new SendGridService();
        NotificationService service = new SendGridAdapter(sendGridService);
        // still can use the .send() method
        service.send("test@gmail.com", "Order delivered", "Your order has been delivered to security");
    }
}
