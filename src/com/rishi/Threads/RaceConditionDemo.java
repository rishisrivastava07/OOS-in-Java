package com.rishi.Threads;

class Counter{
    int val = 0;
    synchronized void inr(){val++;}
    synchronized void dcr(){val--;}
}

public class RaceConditionDemo extends Thread {
    Counter c;
    RaceConditionDemo(Counter c) {
//        System.out.println("Inside RaceConditionDemo Param Constructor : " + c.val);
        this.c = c;
        start();
    }

    public void run() {
        System.out.println("Inside run() method before : " + c.val);
        for(int i = 0; i < 10000; i++)
            c.dcr();

        System.out.println("Inside run() method after : " + c.val);
    }

    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        RaceConditionDemo r = new RaceConditionDemo(c);

        System.out.println("Inside main() Before c.inr() : " + c.val);
        for(int i = 0; i < 10000; i++)
            c.inr();
        System.out.println("Inside main() After c.inr() : " + c.val);

        r.join();
        System.out.println("Final Value : " + c.val);
    }
}
