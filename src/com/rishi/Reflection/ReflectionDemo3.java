package com.rishi.Reflection;
import java.lang.reflect.Method;

class Y{
    private void f(){
        System.out.println("f() called");
    }
}

public class ReflectionDemo3 {
    public static void main(String[] args) throws Exception {
//        String s = new String("JU IT OOS");
//        System.out.println("String : " + s);
//        Class c = s.getClass();

//        Method m = c.getDeclaredMethod("toLowerCase");
//        System.out.println("m.invoke(s) value : " + m.invoke(s));
//        Y ob = new Y();
//        Class c = Y.class;

        Method m = Y.class.getDeclaredMethod("f");

//        for(int i = 0; i < m.length; i++)
//            System.out.println(m[i]);
        m.setAccessible(true);
        m.invoke(new Y());
    }
}
