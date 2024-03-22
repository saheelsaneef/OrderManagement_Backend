package com.example.backend.orderManagement.Service;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {


    public boolean sendAssignNotification() {
        // Logic to send the assign notification
        // This could involve calling an external API, sending an email, or using a messaging system
        // For simplicity, we'll return true to indicate that the notification was sent successfully
        return true;
    }
}
