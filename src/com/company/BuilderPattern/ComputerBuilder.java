package com.company.BuilderPattern;

public interface ComputerBuilder {

    void buildProcessor();
    void buildMemory();
    void buildStorage();
    Computer getComputer();
}
