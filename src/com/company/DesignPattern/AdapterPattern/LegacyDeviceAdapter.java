package com.company.DesignPattern.AdapterPattern;

public class LegacyDeviceAdapter implements NewDevice{

    private LegacyDevice legacyDevice;

    LegacyDeviceAdapter(LegacyDevice legacyDevice) {
        this.legacyDevice = legacyDevice;
    }

    @Override
    public void displayInfo() {
        legacyDevice.displayLegacyInfo();
    }
}
