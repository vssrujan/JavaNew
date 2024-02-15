package com.mordernjava.functionalprogramming;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> c = (x) -> System.out.println(x + " ,the length of the string:"+x.length());
        c.accept("Up in the air");
    }
}
