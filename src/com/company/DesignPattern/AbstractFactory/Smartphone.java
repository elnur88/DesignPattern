package com.company.DesignPattern.AbstractFactory;

class Smartphone implements Device {
    @Override
    public void displayInfo() {
        System.out.println("Smartphone - Small, portable device.");
    }
}