package com.modernjava.lambda;

public class HelloWorldLambda {
    public static void main(String[] args) {
        //implementing sayHelloWorld using Lambda
        HelloWorldInterface helloWorldInterface = () -> {
            return "Hello World Lambda";
        };
        System.out.println(helloWorldInterface.sayHelloWorld());

        //single line lambda
        HelloWorldInterface helloWorldInterface1 = () -> "HelloWorld single line Lambda";
        System.out.println(helloWorldInterface1.sayHelloWorld());
    }


}
