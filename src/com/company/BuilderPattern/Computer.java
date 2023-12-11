package com.company.BuilderPattern;

public class Computer {

    private String processor;
    private String memory;
    private String storage;

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer { Processor: " + processor + ", Memory: " + memory + ", Storage: " + storage + " }";
    }

}
