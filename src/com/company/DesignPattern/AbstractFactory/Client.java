package com.company.DesignPattern.AbstractFactory;

import com.company.DesignPattern.AdapterPattern.LegacyDevice;
import com.company.DesignPattern.AdapterPattern.LegacyDeviceAdapter;
import com.company.DesignPattern.AdapterPattern.NewDevice;

public class Client {
    public static void main(String[] args) {
        DeviceFactory mobileDeviceFactory = new MobileDeviceFactory();
        DeviceManager mobileDeviceManager = new DeviceManager(mobileDeviceFactory);
        mobileDeviceManager.displayDeviceInformation();

        System.out.println("\n------------------------\n");

        DeviceFactory computerDeviceFactory = new ComputerDeviceFactory();
        DeviceManager computerDeviceManager = new DeviceManager(computerDeviceFactory);
        computerDeviceManager.displayDeviceInformation();
    }
}
