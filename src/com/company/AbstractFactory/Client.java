package com.company.AbstractFactory;

import com.company.AdapterPattern.LegacyDevice;
import com.company.AdapterPattern.LegacyDeviceAdapter;
import com.company.AdapterPattern.NewDevice;

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
