package com.rishi.reference;

class X{
    int i = 4;
}

class Reference {
    public static void fun(X o){
        o.i = 5;
        o = null;
    }

    public static void main(String[] args) {
        X ob = new X();
        System.out.println("Before call of fun() i : " + ob.i);

        fun(ob);

        System.out.println("After call of fun() i : " + ob.i);
    }
}
