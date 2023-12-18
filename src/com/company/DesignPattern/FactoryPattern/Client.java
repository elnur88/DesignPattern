package com.company.DesignPattern.FactoryPattern;

import com.company.DesignPattern.AdapterPattern.LegacyDevice;
import com.company.DesignPattern.AdapterPattern.LegacyDeviceAdapter;
import com.company.DesignPattern.AdapterPattern.NewDevice;

public class Client {
    public static void main(String[] args) {
        DeviceFactory computerFactory = new ComputerFactory();
        DeviceManager computerManager = new DeviceManager(computerFactory);
        computerManager.operateDevice();

        DeviceFactory phoneFactory = new PhoneFactory();
        DeviceManager phoneManager = new DeviceManager(phoneFactory);
        phoneManager.operateDevice();
    }
}
