package com.rishi.methodHiding;

class Parent{
    static void m1(){
        System.out.println("In parent static m1");
    }
    void m2(){
        System.out.println("In parent non-static m2");
    }
}

class Child extends Parent{
    static void m1(){
        System.out.println("In child static m1");
    }
    void m2(){
        System.out.println("In child non-static m2");
    }
}
public class Hide {
    public static void main(String[] args) {
        Parent p = new Child();
        p.m1();
        p.m2();
    }
}
