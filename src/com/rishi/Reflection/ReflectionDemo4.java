package com.rishi.Reflection;
import java.lang.reflect.*;

class A{
    private int x = 10;
    public int y = 2;
}

public class ReflectionDemo4 {
    public static void main(String[] args) throws Exception {
        A ob = new A();
        Class c = ob.getClass();

        String fname = new String("x");
        Field f = c.getDeclaredField(fname);
        f.setAccessible(true);

        System.out.println("Before " + fname + " : " + f.getInt(ob));
        f.set(ob, 13);
        System.out.println("After " + fname + " : " + f.getInt(ob));

//        String int_x = new String("x");
//        Field f2 = A.class.getDeclaredField(int_x);
//        f2.setAccessible(true);
//        System.out.println("x (using int_x) = " + f2.getInt(ob));
//        f.setInt(ob, 4);
//        System.out.println("x = " + f.getInt(ob));

//        A ob = new A();
//        Class c = ob.getClass();
//        Field[] fields = c.getDeclaredFields();
//
//        for(Field f : fields){
//            f.setAccessible(true);
//            System.out.println(f.getName() + " : " + f.getModifiers());
//        }
    }
}
