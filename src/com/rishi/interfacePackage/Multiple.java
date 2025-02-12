package com.rishi.interfacePackage;

interface IN1{
    default void fun(){
        System.out.println("Inside IN1");
    }
}

interface IN2{
    default void fun(){
        System.out.println("Inside IN2");
    }
}

public class Multiple implements IN1, IN2{
    public void fun(){
        System.out.println("Inside Multiple");
        IN1.super.fun();
        IN2.super.fun();
    }

    public static void main(String[] args) {
        Multiple m = new Multiple();
        m.fun();
    }
}
