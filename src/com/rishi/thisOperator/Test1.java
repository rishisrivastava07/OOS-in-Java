package com.rishi.thisOperator;

public class Test1 {
    int a, b;
    Test1(){
        a = 10;
        b = 20;
        System.out.println("Inside the def constructor");
    }

    Test1 get(){
        System.out.println("Inside the get method");
        return this;
    }

    void display(Test1 ob){
        System.out.println("Inside the display method");
        System.out.println("a = " + a + " & b = " + b);
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.get();
    }
}
