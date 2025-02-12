package com.rishi.Reflection;

public class Target implements Subject{
    public int add(int a, int b){
        System.out.println("In add() : received : " + a + " and " + b);
        int result = a + b;
        System.out.println("In add() : sent : " + result);
        return result;
    }
}
