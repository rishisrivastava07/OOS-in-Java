package com.rishi.Reflection;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Simple1{
    private String s;
    public Simple1(){
        s = "JU IT";
    }

    public void method1(){
        System.out.println("method1");
    }

    public void method2(int n){
        System.out.println("method2 : " + n);
    }

    private void method3(){
        System.out.println("method3 : " + s);
    }
}

public class ReflectionDemo2 {
    public static void main(String[] args) throws Exception {
        Simple1 ob = new Simple1();
        Class c = ob.getClass();
        System.out.println(c.getName());
        Constructor con = c.getConstructor();
        System.out.println(con.getName());

        Method methods[] = c.getDeclaredMethods();

        for(int i = 0; i < methods.length; i++){
            System.out.println(methods[i]);
        }

        Field field = c.getDeclaredField("s");
        field.setAccessible(true);
        field.set(ob, "JU OOS");

        Method methodCall1 = c.getDeclaredMethod("method1");
        methodCall1.invoke(ob);

        Method methodCall2 = c.getDeclaredMethod("method2", int.class);
        methodCall2.invoke(ob, 20);

        Method methodCall3 = c.getDeclaredMethod("method3");
        methodCall3.setAccessible(true);
        methodCall3.invoke(ob);
    }
}
