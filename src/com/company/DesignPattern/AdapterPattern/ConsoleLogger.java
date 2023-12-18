package com.company.DesignPattern.AdapterPattern;

public class ConsoleLogger implements Logger{

    @Override
    public void log(String message) {
        System.out.println("Console Log: " + message);
    }
}
