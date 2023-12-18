package com.company.SOLID.SRP;

public class UserManager {
    public void login(User user) {
        System.out.println("User"+ user.getUsername());
    }

    public void logout(User user) {
        System.out.println("User logout");
    }


}
