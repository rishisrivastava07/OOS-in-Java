package com.rishi.inheritance;

class B3{
    int x, y;
    B3(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class methodOverloading2 {
    public static void main(String[] args) {
        B3 b1 = new B3(5, 20);
        B3 b2 = new B3(5, 20);
        B3 b3 = b1;

        if(b1 == b3){
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal"); // op
        }

    }
}
