package com.rishi.abstractPackage;

interface IN1{
    void method1();
    void method2();
}
interface IN2{
    void method3();
}

class INT_Inherit implements IN1, IN2{
    public void method1(){
        System.out.println("method1");
    }
    public void method2(){
        System.out.println("method2");
    }
    public void method3(){
        System.out.println("method3");
    }
}
public class Interface_Main {
    public static void main(String[] args) {
        INT_Inherit obj = new INT_Inherit();
        obj.method1();
        obj.method2();
        obj.method3();
    }
}
