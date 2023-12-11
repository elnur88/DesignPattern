package com.company.FactoryPattern;

public class ComputerFactory implements DeviceFactory{
    @Override
    public Device createDevice() {
        return new Computer();
    }
}
