package com.rishi.thisOperator;

public class Test2 {
    int a, b;
    Test2(){
        a = 10;
        b = 20;
        System.out.println("Inside the def constructor");
    }

    void get(){
        display(this);
        System.out.println("Inside the get method");
    }

    void display(Test2 ob){
        System.out.println("a = " + a + " & b = " + b);
        System.out.println("Inside the display method");
    }

    public static void main(String[] args) {
        Test2 t = new Test2();
        t.get();
    }
}
