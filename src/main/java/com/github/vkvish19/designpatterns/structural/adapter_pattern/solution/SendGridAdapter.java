package com.github.vkvish19.designpatterns.structural.adapter_pattern.solution;

public class SendGridAdapter implements NotificationService
{
    private SendGridService sendGridService;

    public SendGridAdapter(SendGridService sendGridService)
    {
        this.sendGridService = sendGridService;
    }

    @Override
    public void send(String to, String subject, String body)
    {
        // Adapter method -> converts parameters and calls to SendGrid method
        sendGridService.sendEmail(to, subject, body);
    }
}
