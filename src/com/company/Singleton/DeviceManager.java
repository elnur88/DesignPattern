package com.company.Singleton;

public class DeviceManager {
    private static final DeviceManager instance;
    private String deviceStatus;

    private DeviceManager() {
        deviceStatus = "Bağlı";
    }

    public static DeviceManager getInstance() {
        return instance;
    }

    static {
        try {
            instance = new DeviceManager();
        } catch (Exception e) {
            throw new RuntimeException("Error singleton occured.");
        }
    }

    public void turnOn() {
        deviceStatus = "Açıq";
    }

    public void turnOff() {
        deviceStatus = "Bağlı";
    }

    public String getDeviceStatus() {
        return deviceStatus;
    }
}
