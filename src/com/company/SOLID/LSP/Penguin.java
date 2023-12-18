package com.company.SOLID.LSP;

public class Penguin extends Bird{

    @Override
    void fly() {
        System.out.println("Penguins can't fly");
    }

    void swim() {
        System.out.println("Swimming");
    }
}
