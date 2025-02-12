package com.rishi.Calulate.Add;

public class Addition {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Addition cal = new Addition();
        System.out.println(cal.add(10, 20));
    }
}
