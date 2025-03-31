package com.github.vkvish19.designpatterns.structural.adapter_pattern.solution;

public class SendGridService
{
    public void sendEmail(String to, String subject, String body)
    {
        System.out.println("[SendGrid] Sending email to: " + to);
        System.out.println("[SendGrid] Email Subject: " + subject);
        System.out.println("[SendGrid] Contents of email: " + body);
    }
}
