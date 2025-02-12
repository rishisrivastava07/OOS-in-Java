package com.rishi.inheritance;

class Base1{
    public void print(){
        System.out.println("Base");
    }
}

class Child1 extends Base1{
    public void print(){
        System.out.println("Child");
    }
}
public class inheritance02 {
    public static void main(String[] args) {
        Base1 child1 = new Child1();
        child1.print();
    }
}
