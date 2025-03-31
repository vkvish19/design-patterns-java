package com.github.vkvish19.designpatterns.structural.adapter_pattern.problem;

// Legacy code: old email notification service
public class EmailNotificationService implements NotificationService
{
    @Override
    public void send(String to, String subject, String body)
    {
        System.out.println("Sending email to: " + to);
        System.out.println("Email Subject: " + subject);
        System.out.println("Contents of email: " + body);
    }
}
