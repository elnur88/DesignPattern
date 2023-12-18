package com.company.SOLID.SRP;


public class Client {

    public static void main(String[] args) {

        User user = new User("Elnur", "12345");

        UserManager userManager = new UserManager();

        userManager.login(user);



    }
}
