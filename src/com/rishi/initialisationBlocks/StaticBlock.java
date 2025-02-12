package com.rishi.initialisationBlocks;

class StaticBlock {
    static int i = 11;
    int j;

    static{
        i++;
        // j = 20; // this is an error non-static cannot be used inside the static block
        System.out.println("Static block called");
    }

    StaticBlock(){
        System.out.println("Static def const called");
    }
}

class MainBlock{
    public static void main(String[] args) {
        StaticBlock s = new StaticBlock();
        StaticBlock s2 = new StaticBlock();
        System.out.println(s.i);
        System.out.println(s2.i);
        System.out.println(StaticBlock.i);
    }
}