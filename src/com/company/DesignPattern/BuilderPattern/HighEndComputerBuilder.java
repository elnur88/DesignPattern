package com.company.DesignPattern.BuilderPattern;

public class HighEndComputerBuilder implements ComputerBuilder{

    private Computer computer;

    public HighEndComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.setProcessor("Intel Core i7");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("16GB DDR4");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("512GB SSD");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
