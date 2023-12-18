package com.company.SOLID.ISP;



public class Client {

    public static void main(String[] args) {

        Worker manager = new Manager();
        Worker programmer = new Programmer();
        Eater eater = new Manager();

        manager.work();
        ((Eater) manager).eat();

        programmer.work();

        eater.eat();

    }
}
