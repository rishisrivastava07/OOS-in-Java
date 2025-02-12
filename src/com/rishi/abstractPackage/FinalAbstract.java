package com.rishi.abstractPackage;

import org.w3c.dom.ls.LSOutput;

abstract class Figure{
    private int height;
    private int width;

    Figure(int h, int w){
        this.height = h;
        this.width = w;
    }

    int getHeight(){
        return height;
    }
    int getWidth(){
        return width;
    }

    abstract int getArea();
}

class Rectangle extends Figure{
    Rectangle(int h, int w){
        super(h, w);
    }

    int getArea(){
        return super.getHeight() * super.getWidth();
    }
}

class Square1 extends Figure{
    Square1(int length){
        super(length, length);
    }

    int getArea() {
        return super.getHeight() * super.getWidth();
    }
}

public class FinalAbstract {
    public static void main(String[] args) {
        Figure rectangle = new Rectangle(10, 20);
        Figure square1 = new Square1(10);
        System.out.println("Area of Rectangle = " + rectangle.getArea());
        System.out.println("Area of Square = " + square1.getArea());
    }
}
