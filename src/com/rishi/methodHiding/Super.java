package com.rishi.methodHiding;

class Base{
    Base(){
        System.out.println("Base - default constructor");
    }
    Base(int a){
        System.out.println("Base - parameterized constructor");
    }

    void display(){
        System.out.println("Base");
    }
}

class Child1 extends Base{
    Child1(){
        System.out.println("Child - default constructor");
    }
    Child1(int a){
        super(a);
        System.out.println("Child - parameterized constructor");
    }
    void display(){
        super.display();
        System.out.println("Child");
    }
}
public class Super {
    public static void main(String[] args) {
        Base b = new Child1(5);
        b.display();
    }
}
