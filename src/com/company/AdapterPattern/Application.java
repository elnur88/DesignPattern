package com.company.AdapterPattern;

public class Application {

    private Logger logger;

    public Application(Logger logger) {
        this.logger = logger;
    }

    public void doSomething() {
        logger.log("Something is happening...");
    }
}
