package com.company.SOLID.DIP;

import java.util.List;

public class SmsNotificationService implements  NotificationService{

    @Override
    public void sendNotification(String message) {
        System.out.println("SMS notification: " + message);
        // SMS gönderme işlemleri...
    }

    @Override
    public void sendNotifications(List<String> messages) {
        for (String message : messages) {
            sendNotification(message);
        }
    }
}
