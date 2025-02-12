package com.rishi.methodHiding;

class B{
    void fun(){
        System.out.println("B : fun()");
    }
}

class C extends B{
    void fun(){
        System.out.println("C : fun()");
    }
}
public class Super1 {
    public static void main(String[] args) {
        C c = new C();
        c.fun();

        B b = new C();
        b.fun();
    }
}
