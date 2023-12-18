package com.company.StrategyDesignPattern;

public class OperationStrategy {

    public static Operation findStrategy(String mathematicalOperation){
        if(mathematicalOperation.equals(OperationConstants.ADD)){
            return new OperationAdd();
        }
        else if(mathematicalOperation.equals(OperationConstants.MULTIPLY)){
            return new OperationMultiply();
        }
        else{
            return null;
        }
    }
}
