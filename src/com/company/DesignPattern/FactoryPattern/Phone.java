package com.company.DesignPattern.FactoryPattern;

public class Phone implements Device{
    @Override
    public void start() {
        System.out.println("Phone started.");
    }

    @Override
    public void stop() {
        System.out.println("Phone stopped.");
    }
}
