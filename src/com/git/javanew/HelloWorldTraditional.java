package com.git.javanew;

public class HelloWorldTraditional implements HelloWorldInterface{

    @Override
    public String sayHelloWorld() {
        return "Hello World";
    }

    public static void main(String[] args) {
        HelloWorldInterface helloWorldInterface = new HelloWorldTraditional();
        System.out.println(helloWorldInterface.sayHelloWorld());
    }
}
