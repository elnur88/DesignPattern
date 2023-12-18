package com.company.DesignPattern.AbstractFactory;

public class DeviceManager {

    private final DeviceFactory deviceFactory;
    private Device mobileDevice;
    private Device computerDevice;

    public DeviceManager(DeviceFactory deviceFactory) {
        this.deviceFactory = deviceFactory;
        this.mobileDevice = deviceFactory.createMobileDevice();
        this.computerDevice = deviceFactory.createComputerDevice();
    }

    public void displayDeviceInformation() {
        System.out.println("Mobile Device Information:");
        mobileDevice.displayInfo();

        System.out.println("\nComputer Device Information:");
        computerDevice.displayInfo();
    }
}
