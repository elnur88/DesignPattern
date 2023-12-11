package com.company.AbstractFactory;

public class Tablet implements Device{

    @Override
    public void displayInfo() {
        System.out.println("Tablet - Larger screen device.");
    }
}
