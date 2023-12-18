package com.company.DesignPattern.BuilderPattern;

public class Client {

    /*public static void main(String[] args) {
        Order order = new Order.Builder("Elnur", "Sumgait", "Book, Notebook")
                .withGift(true)
                .build();

        order.display();
    }

     */

    public static void main(String[] args) {

        ComputerDirector director = new ComputerDirector();
        ComputerBuilder builder = new HighEndComputerBuilder();

        director.construct(builder);
        Computer computer = builder.getComputer();

        System.out.println(computer);
    }

}
