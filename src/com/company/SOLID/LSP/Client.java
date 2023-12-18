package com.company.SOLID.LSP;



public class Client {

    public static void main(String[] args) {

        Bird bird = new Bird();
        Penguin penguin = new Penguin();

        bird.fly(); // "Flying"
        penguin.fly(); // "Penguins can't fly"
        penguin.swim(); // "Swimming"

        Bird penguinAsBird = new Penguin();
        penguinAsBird.fly(); // "Penguins can't fly", çünkü Penguin sınıfının fly metodu override edildi.

    }
}
