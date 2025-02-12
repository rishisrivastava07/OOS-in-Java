package com.rishi.ExceptionHandling;

public class ExceptionThrows {
    void g(){
        try {
            f();
        } catch(Exception e){
            System.out.println("Exception caught inside try-catch of g()");
        }
    }

    void f() throws Exception{
        throw new Exception("Test");
    }

    public static void main(String[] args) {
        ExceptionThrows e = new ExceptionThrows();
        e.g();
    }
}
