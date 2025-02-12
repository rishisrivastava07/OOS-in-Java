package com.rishi.initialisationBlocks;

public class Example {
    static int[] elements;
    static{
        elements = new int[10];
        for (int i = 0; i < 10; i++) {
            elements[i] = i+1;
        }
//        this.display();
    }

    void display(){
        for (int i = 0; i < 10; i++) {
            System.out.println(elements[i]);
        }
    }

    public static void main(String[] args) {
        Example e1 = new Example();
        Example e2 = new Example();
        e2.display();
    }
}
