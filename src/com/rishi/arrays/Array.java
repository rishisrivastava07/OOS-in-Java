package com.rishi.arrays;

class Array_2D{
    int i;
    Array_2D(int x, int y){
        i = x + y;
    }

    void display(){
        System.out.println("i = " + i);
    }
}
public class Array {
    public static void main(String[] args) {
        Array_2D a[][] = new Array_2D[3][2];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                a[i][j] = new Array_2D(i, j);
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                a[i][j].display();
            }
            System.out.println();
        }
    }
}
