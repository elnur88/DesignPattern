package com.company.SOLID.ISP;

public class Programmer implements Worker{

    @Override
    public void work() {
        System.out.println("Programmer is coding");
    }
}
