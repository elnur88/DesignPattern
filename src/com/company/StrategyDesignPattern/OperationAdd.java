package com.company.StrategyDesignPattern;

public class OperationAdd implements Operation{

    @Override
    public double calculate(double firstNumber, double secondNumber) {
        return firstNumber+secondNumber;
    }
}
