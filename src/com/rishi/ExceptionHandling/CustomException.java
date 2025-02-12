package com.rishi.ExceptionHandling;

class DivideByZeroException extends Exception{
    int divisior;
    DivideByZeroException(int divisior) {
        this.divisior = divisior;
    }
}

class Divide {
    void div (int d) throws DivideByZeroException{
        try {
            double q = (double) 100 / d;
            System.out.println("Quotient : " + q);
            throw new DivideByZeroException(1);
        }
//        catch (DivideByZeroException e) {
//            System.out.println("Caught and handled in Divide -> div -> catch block : " + e);
//        }

        finally {
            System.out.println("Caught in finally block");
        }
    }
}
public class CustomException {
    public static void main(String[] args) {
        Divide d = new Divide();
        try{
            d.div(0);
        } catch(DivideByZeroException e) {
            System.out.println("Caught and handled in main() : " + e);
        }
    }
}
