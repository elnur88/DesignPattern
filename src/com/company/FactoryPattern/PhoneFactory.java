package com.company.FactoryPattern;

public class PhoneFactory implements DeviceFactory{

    @Override
    public Device createDevice() {
        return new Phone();
    }
}
