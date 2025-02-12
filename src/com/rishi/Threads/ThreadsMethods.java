package com.rishi.Threads;

class Thread1 extends Thread{
    public void run(){
        int i = 5;
        while(i-- > 0) {
            System.out.println("Thread1 is running : " + new java.util.Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread1 is interrupted");
                return;
            }
        }
    }
}

class Thread2 extends Thread{
    public void run(){
        while(true) {
            System.out.println("Thread2 is running : " + new java.util.Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread2 is interrupted");
                return;
            }
        }
    }
}

public class ThreadsMethods {
    public static void main(String[] args) throws Exception{
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
//        t1.join();
        t2.start();
    }
}
