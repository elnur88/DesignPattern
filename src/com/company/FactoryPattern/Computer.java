package com.company.FactoryPattern;

public class Computer implements Device{
    @Override
    public void start() {
        System.out.println("Computer started.");
    }

    @Override
    public void stop() {
        System.out.println("Computer stopped.");
    }
}
