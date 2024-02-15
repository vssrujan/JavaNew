package com.git.javanew;

public class IncrementByFiveLambda {
    public static void main(String[] args) {
        IncrementByFiveInterface incrementByFiveInterface = (x) -> x + 5;
        System.out.println("using Lambda : " +incrementByFiveInterface.incrementByFive(2));
    }
}
