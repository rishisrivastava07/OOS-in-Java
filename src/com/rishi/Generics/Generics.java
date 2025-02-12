package com.rishi.Generics;

class Test<T> {
    T obj;
    Test (T obj){
        this.obj = obj;
    }

    void getObject(){
        System.out.println("type object value is : " + obj);
    }
}
public class Generics {
    public static void main(String[] args) {
        Test<Integer> iob = new Test<Integer>(10);
        iob.getObject();

        Test<Double> dob =  new Test<Double>(10.0);
        dob.getObject();

        Test<String> sob = new Test<String>("Hello");
        sob.getObject();
    }
}
