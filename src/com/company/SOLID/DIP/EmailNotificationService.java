package com.company.SOLID.DIP;

import java.util.List;

public class EmailNotificationService implements  NotificationService{

    @Override
    public void sendNotification(String message) {
        System.out.println("Email notification: " + message);
        // E-posta gönderme işlemleri...
    }

    @Override
    public void sendNotifications(List<String> messages) {
        for (String message : messages) {
            sendNotification(message);
        }
    }
}
