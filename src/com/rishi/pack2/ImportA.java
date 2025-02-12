package com.rishi.pack2;
import com.rishi.pack1.A;
import com.rishi.pack1.B;

public class ImportA {
    public static void main(String[] args) {
//        com.rishi.pack1.A obj = new com.rishi.pack1.A();
        A obj = new A();
        obj.display();

        B obj2 = new B();
        obj2.show();
    }
}
