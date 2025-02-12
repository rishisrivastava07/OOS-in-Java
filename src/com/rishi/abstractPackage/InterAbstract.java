package com.rishi.abstractPackage;

import org.w3c.dom.ls.LSOutput;

interface IN{
    void fun1();
    void fun2();
    void fun3();
}

abstract class AB implements IN{
    public void fun3(){
        System.out.println("AB fun3");
    }
}

class ABC extends AB{
    public void fun2(){
        System.out.println("ABC fun2");
    }
    public void fun1(){
        System.out.println("ABC fun1");
    }
}

public class InterAbstract {
    public static void main(String[] args) {
        IN in = new ABC();
        in.fun1();
        in.fun2();
        in.fun3();
    }
}
