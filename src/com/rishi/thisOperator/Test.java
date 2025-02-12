package com.rishi.thisOperator;

public class Test {
    int a, b;
    Test(){
        this(10, 20);
        System.out.println("within the def constructor");
    }

    Test(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("within the param constructor");
    }

    void display(){
        System.out.println("a = " + a + " & b = " + b);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.display();
    }
}
