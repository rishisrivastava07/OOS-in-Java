package com.rishi.ExceptionHandling;

public class Exception1 {
    public static void main(String[] args) {
        int d = 2, res;

        try{
            res = 100 / d;
//            throw new ArithmeticException();

        } catch(Exception e) {
            System.out.println("Catch block");
        }

        finally {
            System.out.println("Finally block");
        }
    }
}
