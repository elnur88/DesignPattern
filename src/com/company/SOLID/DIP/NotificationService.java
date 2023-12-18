package com.company.SOLID.DIP;

import java.util.List;

public interface NotificationService {

    void sendNotification(String message);
    void sendNotifications(List<String> messages);
}
