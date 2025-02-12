package com.rishi.inheritance;

class B{
    int value = 10;
    B(){
        System.out.println("B");
    }
}

class C extends B{
    int value = 20;
    C(){
        System.out.println("C");
    }
}
public class inheritance3 {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.value);
        B b = new C();
        System.out.println(b.value);
    }
}
