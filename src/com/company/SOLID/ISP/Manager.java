package com.company.SOLID.ISP;

public class Manager implements Worker,Eater{

    @Override
    public void work() {
        System.out.println("Manager is working");
    }

    @Override
    public void eat() {
        System.out.println("Manager is eating");
    }
}
