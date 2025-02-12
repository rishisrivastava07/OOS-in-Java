package com.rishi.Reflection;

interface INTER{
    // used for example 2 & 3
}

class Demo implements INTER{
    // used for example 2 & 3
}

class Simple{
    // used for example 4
}

public class ReflectionDemo {
    public static void main(String[] args) {

    /*
        // Example 1
        String s = new String("Java");
        Class c = s.getClass();
        System.out.println("Output : " + c);

        char a[] = new char[10];
        Class c = a.getClass();
        System.out.println("Output : " + c);
    */
    /*
        // Example 2
        // Usage of Reflection Class -> getClass() method;
        INTER i = new Demo();
        Class c = i.getName();
        System.out.println(c);
    */

    /*
        // Example 3
        Class c = int.class;
        Class c1 = int[].class;
        Class c2 = String.class;
        Class c3 = INTER.class;
        Class c4 = Demo.class;

        System.out.println("For int.class : " + c);
        System.out.println("For int[].class : " + c1);
        System.out.println("For String.class : " + c2);
        System.out.println("For INTER.class : " + c3);
        System.out.println("For Demo.class : " + c4);
    */
    /*
        // Example 4
        // forName() method of Class
        try{
            Class c = Class.forName("com.rishi.Reflection.Simple");
            System.out.println("c.getName() : " + c.getName());
        } catch (Exception e) {
            System.out.println("Caught : " + e);
        }
    */
    /*
        // Example 5
        Class c = boolean.class;
        System.out.println(c.getName());

        Class c1 = ReflectionDemo.class;
        System.out.println(c1.getName());
    */

    }
}
