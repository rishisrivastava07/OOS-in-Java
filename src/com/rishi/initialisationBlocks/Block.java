package com.rishi.initialisationBlocks;

public class Block {
    static {
        System.out.println("InitialisationBlock");
    }
    Block(){
        System.out.println("InitialisationBlock - def");
    }
    Block(int x){
        System.out.println(x + 1 + " : InitialisationBlock - param");
    }

    public static void main(String[] args) {
//        Block b = new Block();
//        Block b2 = new Block(10);
        Block b[] = new Block[10];

        for(int i = 0; i < 10; i++){
            b[i] = new Block(i);
        }
    }
}
