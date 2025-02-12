package com.rishi.inheritance;

class Base{
    void print(){
        System.out.println("Base");
    }
}

class Child extends Base{
    void print(){
        super.print();
        System.out.println("Child");
    }
}

class GrandChild extends Child{
    void print(){
        super.print();
        System.out.println("GrandChild");
    }
}
public class inheritance01 {
    public static void main(String[] args) {
        GrandChild gc = new GrandChild();
        gc.print();
    }
}
