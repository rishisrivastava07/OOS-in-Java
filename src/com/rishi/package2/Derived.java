package com.rishi.package2;
import com.rishi.package1.Base;

public class Derived extends Base {
    public void pri(){
        System.out.println("Private : Derived");
    }

    void def(){
        System.out.println("Default : Derived");
    }

    protected void pro() {
        System.out.println("Protected : Derived");
    }

    public void pub(){
        System.out.println("Public : Derived");
    }
}
