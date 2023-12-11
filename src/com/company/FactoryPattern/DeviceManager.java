package com.company.FactoryPattern;

public class DeviceManager {
    private DeviceFactory deviceFactory;

    public DeviceManager(DeviceFactory deviceFactory) {
        this.deviceFactory = deviceFactory;
    }

    public void operateDevice() {
        Device device = deviceFactory.createDevice();
        device.start();
        device.stop();
    }
}
