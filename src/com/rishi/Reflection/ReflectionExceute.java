package com.rishi.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class Z {
    private final double pfd = 1.0;
    Z(){
        System.out.println("Z def constructor");
    }
    Z(int n){
        System.out.println("Z param constructor - 1");
    }
    Z(int n, int m){
        System.out.println("Z param constructor - 2");
    }
}

public class ReflectionExceute {
    public static void main(String[] args) {
        Z ob = new Z(10);
        Class c = ob.getClass();

        System.out.println("c = " + c);

        Constructor[] cons = c.getDeclaredConstructors();
        for(Constructor con : cons){
            System.out.println(con);
        }
    }
}
