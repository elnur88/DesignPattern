package com.company.SOLID.DIP;

import java.util.List;

public class NotificationManager {

    private NotificationService notificationService;

    public NotificationManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendNotification(String message) {
        notificationService.sendNotification(message);
    }

    public void sendNotifications(List<String> messages) {
        notificationService.sendNotifications(messages);
    }
}
