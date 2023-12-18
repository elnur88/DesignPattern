package com.company.SOLID.OCP;

public class Client {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        // Calculating areas without modifying AreaCalculator class
        double circleArea = AreaCalculator.calculateArea(circle);
        double rectangleArea = AreaCalculator.calculateArea(rectangle);

        System.out.println("Circle Area: " + circleArea);
        System.out.println("Rectangle Area: " + rectangleArea);
    }
}
