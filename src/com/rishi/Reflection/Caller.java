package com.rishi.Reflection;

public class Caller {
    public static void main(String[] args) throws Exception {
        Subject s = new Target();
        int x = 4, y = 5;
        int result = s.add(x, y);
        System.out.println("In caller : send : " + x + " and " + y);
        System.out.println("In caller : received : " + result);
    }
}
