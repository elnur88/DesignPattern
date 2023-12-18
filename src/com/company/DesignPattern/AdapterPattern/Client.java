package com.company.DesignPattern.AdapterPattern;

public class Client {
    public static void main(String[] args) {

        Logger consoleLogger = new ConsoleLogger();
        Application appWithConsoleLogger = new Application(consoleLogger);
        appWithConsoleLogger.doSomething();

        Log4jLogger log4jLogger = new Log4jLogger();
        Logger log4jAdapter = new Log4jAdapter(log4jLogger);
        Application appWithLog4jLogger = new Application(log4jAdapter);
        appWithLog4jLogger.doSomething();
    }
}
