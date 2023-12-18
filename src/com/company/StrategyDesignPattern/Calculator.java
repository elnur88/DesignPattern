package com.company.StrategyDesignPattern;

public class Calculator {

    private static double firstNumber;
    private static double secondNumber;
    private static String mathematicalOperation;

    public static void calculate(String mathematicalProblem){
        determineProblemMembers(mathematicalProblem);
        Operation operation = OperationStrategy.findStrategy(mathematicalOperation);
        //OperationStrategy.findStrategy(mathematicalOperation)
        if(operation!=null){
            System.out.println("Result : "+String.valueOf(operation.calculate(firstNumber, secondNumber)));
        }
        else{
            System.out.println("Missing operation!");
        }
    }

    private static void determineProblemMembers(String mathematicalProblem){
        String[] problemArray = mathematicalProblem.split(" ");
        firstNumber = Double.valueOf(problemArray[0]);
        mathematicalOperation = problemArray[1];
        secondNumber = Double.valueOf(problemArray[2]);
    }
}
