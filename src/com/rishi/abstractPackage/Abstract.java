package com.rishi.abstractPackage;

abstract class Shape{
    int data1;
    Shape(){
        System.out.println("Shape Constructor");
        data1 = 10;
    }
    void show(){
        System.out.println("Shape show method = " + data1);
    }

//    abstract void draw();
}

//class Rectangle extends Shape{
//    void draw(){
//        System.out.println("Rectangle");
//    }
//}
//
//class Circle extends Shape{
//    void draw(){
//        System.out.println("Circle");
//    }
//}

class Square extends Shape{
    int data2;
    Square(){
        System.out.println("Square Constructor");
        data2 = 20;
    }
    void show(){
        System.out.println("Square show method = " + data2);
    }
}

public class Abstract {
    public static void main(String[] args) {
//        Shape s1=new Rectangle();
//        s1.draw();
//
//        Shape s2=new Circle();
//        s2.draw();
        Shape s1 = new Square();
        System.out.println(s1.data1);   // value will give according to reference creation
        s1.show();  // method will give according to object creation

//        System.out.println(s1.data2);
    }
}
