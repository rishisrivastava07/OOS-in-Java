package com.rishi.ExceptionHandling;

public class ExceptionThrows1 {
    void g1() throws ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException{
        try{
            f1();
        } catch(ArithmeticException e){
            System.out.println("Caught and handled in g1()");
            throw e;
        }
    }

    void f1() throws ArithmeticException{
        throw new ArithmeticException();
    }

    public static void main(String[] args) {
        ExceptionThrows1 ex = new ExceptionThrows1();
        try{
            ex.g1();
        } catch(ArithmeticException e){
            System.out.println("Caught and handled in main()");
        }
    }
}
