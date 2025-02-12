package com.rishi.inheritance;

class Base3{
//    public int fun(int i){
//        System.out.println("Base");
//        return (i+3);
//    }
    final void show(){
        System.out.println("Base3");
    }
}

class Child3 extends Base3{
//    private double fun(double i){
//        System.out.println("Child");
//        return (i+3.5);
//    }
//    void show(){
//        System.out.println("Child3");
//    }
}
public class methodOverloading {
    public static void main(String[] args) {
        Child3 obj = new Child3();
//        System.out.println(obj.fun(5));
//        System.out.println(obj.fun(6.5));
        obj.show();
    }
}
