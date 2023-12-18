package com.company.StrategyDesignPattern;

public class OperationMultiply implements Operation{

    @Override
    public double calculate(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }
}
