package com.rishi.abstractPackage;

abstract class A{
    abstract void f();
    void show(){
        System.out.println("A - show");
    }
    A(){
        System.out.println("A");
    }
}

class B extends A{
    void f(){
        System.out.println("B - f()");
    }
    void show(){
        System.out.println("B - show");
    }
}

public class Abstract_Test {
    public static void main(String[] args) {
        A a = new B();
        a.f();
        a.show();
    }
}
