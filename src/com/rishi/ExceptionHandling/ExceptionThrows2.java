package com.rishi.ExceptionHandling;

public class ExceptionThrows2 {
    void g2() throws ArithmeticException, Exception, ArrayIndexOutOfBoundsException {
        try{
            f2();
        } catch(Exception e){
            System.out.println("Caught and handled in g2() : " + e.getMessage());
            throw e;
        }
    }

    void f2() throws Exception {
        try{
            int d = 0;
            int res = 100 / d;

            int a[] = new int[5];
            a[6] = 8;
        } catch(Exception e){
            System.out.println("Caught and handled in f2() : " + e.getMessage());
            throw e;
        }
    }

    public static void main(String[] args) {
        ExceptionThrows2 e = new ExceptionThrows2();
        try{
            e.g2();
        } catch(Exception ob){
            System.out.println("Caught and handled in main() : " + ob.getMessage());
        }
    }
}
