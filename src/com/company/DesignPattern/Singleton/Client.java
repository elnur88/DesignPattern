package com.company.DesignPattern.Singleton;



public class Client {
    public static void main(String[] args) {
        DeviceManager deviceManager = DeviceManager.getInstance();

        System.out.println("Tv: " + deviceManager.getDeviceStatus());

        deviceManager.turnOn();
        System.out.println("Tv: " + deviceManager.getDeviceStatus());

        DeviceManager anotherReference = DeviceManager.getInstance();
        System.out.println("Tv: " + anotherReference.getDeviceStatus());

        System.out.println("Equal? " + (deviceManager == anotherReference));
    }
}
