package com.rishi.nestedClasses;

public class Outer {
    private String msg = "JU IT";
    private void fun(){
        System.out.println("Outer fun : ");
    }

    class Inner{
        private void fun(){
            System.out.println("Inner fun : ");
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.fun();
        System.out.println(outer.msg);

        Inner inner = outer.new Inner();
        inner.fun();
    }

}
