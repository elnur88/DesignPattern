package com.company.BuilderPattern;

public class ComputerDirector {

    public void construct(ComputerBuilder builder) {
        builder.buildProcessor();
        builder.buildMemory();
        builder.buildStorage();
    }
}
