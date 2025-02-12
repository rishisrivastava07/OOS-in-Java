package com.rishi.Generics;

public class GenericsFunction {
    static <T> void display(T t) {
        System.out.println("Contains : " + t);
    }
    public static void main(String[] args) {
        display(10);
        display(10.0);
        display("Hello World");
    }
}
