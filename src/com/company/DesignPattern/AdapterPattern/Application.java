package com.company.DesignPattern.AdapterPattern;

public class Application {

    private Logger logger;

    public Application(Logger logger) {
        this.logger = logger;
    }

    public void doSomething() {
        logger.log("Something is happening...");
    }
}
