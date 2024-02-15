package com.git.javanew;

public class HelloWorldLambda {
    public static void main(String[] args) {
        //implementing sayHelloWorld using Lambda
        HelloWorldInterface helloWorldInterface = () -> {
            return "Hello World Lambda";
        };
        System.out.println(helloWorldInterface.sayHelloWorld());
    }


}
