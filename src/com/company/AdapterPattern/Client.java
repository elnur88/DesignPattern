package com.company.AdapterPattern;

public class Client {
    public static void main(String[] args) {
        LegacyDevice legacyDevice = new LegacyDevice();
        NewDevice adapter = new LegacyDeviceAdapter(legacyDevice);

        System.out.println("New System Information:");
        adapter.displayInfo();
    }
}
