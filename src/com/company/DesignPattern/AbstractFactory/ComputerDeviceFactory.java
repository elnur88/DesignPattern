package com.company.DesignPattern.AbstractFactory;

public class ComputerDeviceFactory implements DeviceFactory{

    @Override
    public Device createMobileDevice() {
        return new Laptop();
    }

    @Override
    public Device createComputerDevice() {
        return new Desktop();
    }


}
