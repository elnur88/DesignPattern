package com.company.ProxyPattern;

public class RealSubjectImpl implements RealSubject{

    @Override
    public void request() {
        System.out.println("RealSubject: Handling the request.");
    }

}
