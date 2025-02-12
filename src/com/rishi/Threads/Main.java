package com.rishi.Threads;

class MyThread1 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("In MyThread1 : " + i);
    }
}

public class Main{
    public static void main(String[] args) {
//        Thread t1 = new Thread(new MyThread1());
        MyThread1 myThread1 = new MyThread1();
        Thread t1 = new Thread(myThread1);
        t1.start();
    }
}


