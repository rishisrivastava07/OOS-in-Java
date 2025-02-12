package com.rishi.strings;

public class StringBufferClass {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Info");
        System.out.println(sb.insert(0, 1));
        System.out.println(sb.insert(1, "a"));
        System.out.println(sb.insert(2, 2.5d));
        System.out.println(sb.insert(3, 3.5f));
    }
}
