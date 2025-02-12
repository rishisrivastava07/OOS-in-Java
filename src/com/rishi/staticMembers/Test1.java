package com.rishi.staticMembers;

class TestDemo1{
    int count;
    static int data = 10;

    TestDemo1(){
        System.out.println("TestDemo1 const called and count = " + count + " & data = " + data);
        count = ++data;
        System.out.println("TestDemo1 const called and count = " + count + " & data = " + data);
    }
}

public class Test1 {
    public static void main(String[] args) {
        TestDemo1 t1 = new TestDemo1();
        TestDemo1 t2 = new TestDemo1();

        System.out.println(t1.count);
        System.out.println(t2.count);
        System.out.println(t1.data);
        System.out.println(TestDemo1.data);
        System.out.println(TestDemo1.data);
    }
}
