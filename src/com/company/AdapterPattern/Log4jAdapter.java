package com.company.AdapterPattern;

public class Log4jAdapter implements  Logger{

    private Log4jLogger log4jLogger;

    public Log4jAdapter(Log4jLogger log4jLogger) {
        this.log4jLogger = log4jLogger;
    }

    @Override
    public void log(String message) {
        log4jLogger.logInfo(message);
    }
}
