package com.rishi.staticMembers;

class Test {
    int data1;
    static int data2;

    Test(int d){
        data1 = d;
        data2++;
    }

    int calculate() {
        return data1 + data2;
    }
}

class TestDemo{
    public static void main(String[] args) {
        Test t1 = new Test(10);
        Test t2 = new Test(20);
        System.out.println(t1.data1);
        System.out.println(t2.data1);
        System.out.println(t1.data2);
        System.out.println(Test.data2);
    }
}
