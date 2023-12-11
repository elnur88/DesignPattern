package com.company.AbstractFactory;

public class MobileDeviceFactory implements DeviceFactory{

    @Override
    public Device createMobileDevice() {
        return new Smartphone();
    }

    @Override
    public Device createComputerDevice() {
        return new Tablet();
    }

}
