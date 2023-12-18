package com.company.DesignPattern.AbstractFactory;

public class Desktop implements Device{

    @Override
    public void displayInfo() {
        System.out.println("Desktop - Stationary computer.");
    }
}
