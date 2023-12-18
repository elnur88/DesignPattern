package com.company.DesignPattern.ProxyPattern;

public class AuthorizationProxy implements  RealSubject{

    private RealSubject realSubject;
    private String username;

    AuthorizationProxy(String username) {
        this.username = username;
    }

    private boolean authorize() {
        return username.equals("admin");
    }

    @Override
    public void request() {
        if (authorize()) {
            if (realSubject == null) {
                realSubject = new RealSubjectImpl();
            }

            realSubject.request();
        } else {
            System.out.println("AuthorizationProxy: Unauthorized access.");
        }
    }

}
