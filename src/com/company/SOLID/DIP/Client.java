package com.company.SOLID.DIP;


import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        NotificationService emailService = new EmailNotificationService();
        NotificationService smsService = new SmsNotificationService();


        NotificationManager emailManager = new NotificationManager(emailService);
        emailManager.sendNotification("Hello, this is an email notification.");

        NotificationManager smsManager = new NotificationManager(smsService);
        List<String> smsMessages = new ArrayList<>();
        smsMessages.add("Hello, this is an SMS notification.");
        smsMessages.add("Another SMS notification.");
        smsManager.sendNotifications(smsMessages);

    }
}
