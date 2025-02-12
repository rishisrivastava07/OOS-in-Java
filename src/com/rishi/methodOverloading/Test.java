package com.rishi.methodOverloading;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello");
        Test.main("Hi");
    }

    public static void main(String args1) {
        System.out.println("One arg " + args1);
        Test.main("Hello", "World");
    }

    public static void main(String args1, String args2) {
        System.out.println("Two args " + args1 + " " + args2);
    }
}
