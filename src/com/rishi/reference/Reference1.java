package com.rishi.reference;

class Cube{
    int length;
    Cube(int length) {
        this.length = length;
    }
}

public class Reference1 {
    public static void main(String[] args) {
        Cube cube1 = new Cube(5);
        Cube cube2;
        cube2 = cube1;
        cube2.length = 7;

        if(cube1 == cube2){
            System.out.println("Cube1 and Cube2 are the same");
        } else {
            System.out.println("Cube1 and Cube2 are not the same");
        }

        System.out.println(cube1.length);
    }
}
