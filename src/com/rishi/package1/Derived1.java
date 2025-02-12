package com.rishi.package1;
import com.rishi.package2.Derived;

public class Derived1 extends Derived {
    public void pri(){
        System.out.println("Private_Public : Derived1");
    }

    public void def(){
        System.out.println("Derived_Default : Derived1");
    }

    public void pro(){
        System.out.println("Protected_Public : Derived1");
    }

    public void pub(){
        System.out.println("Public_Public : Derived1");
    }
}
