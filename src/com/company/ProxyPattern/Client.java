package com.company.ProxyPattern;

public class Client {

    public static void main(String[] args) {
        RealSubject unauthorizedProxy = new AuthorizationProxy("guest");
        unauthorizedProxy.request();

        System.out.println("\n------------------------\n");

        RealSubject authorizedProxy = new AuthorizationProxy("admin");
        authorizedProxy.request();
    }
}
