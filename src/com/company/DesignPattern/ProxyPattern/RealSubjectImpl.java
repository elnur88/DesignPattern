package com.company.DesignPattern.ProxyPattern;

public class RealSubjectImpl implements RealSubject{

    @Override
    public void request() {
        System.out.println("RealSubject: Handling the request.");
    }

}
