package com.rishi.Packages;
import com.rishi.Calulate.Multiply.*;
import com.rishi.Calulate.Add.*;


public class ImportSub {
    public static void main(String[] args) {
        Multiplication m = new Multiplication();
        System.out.println(m.product(2,3));

        Addition a = new Addition();
        System.out.println(a.add(3, 6));
    }
}
