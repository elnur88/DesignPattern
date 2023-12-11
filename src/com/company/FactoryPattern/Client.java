package com.company.FactoryPattern;

import com.company.AdapterPattern.LegacyDevice;
import com.company.AdapterPattern.LegacyDeviceAdapter;
import com.company.AdapterPattern.NewDevice;

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
