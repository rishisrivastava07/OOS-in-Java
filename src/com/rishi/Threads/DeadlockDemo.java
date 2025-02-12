package com.rishi.Threads;

class MyThread4 extends Thread{
    String r1, r2;
    int id;

    MyThread4(int i, String s1, String s2){
        this.id = i;
        r1 = s1;
        r2 = s2;

        start();
    }

    public void run(){
        synchronized (r1){
            System.out.println("Thread " + id + " obtained a lock on : " + r1);
            try{
                Thread.sleep(2000);
            } catch(InterruptedException e){
                System.out.println("Thread " + id + " interrupted");
            }
            System.out.println("Thread " + id + " is waiting to obtain a lock on : " + r2);
            synchronized (r2){
                System.out.println("Thread " + id + " obtained a lock on : " + r2);
            }
        }
    }
}

public class DeadlockDemo {
    public static void main(String[] args) {
        int[] a = {2, 6, 4, 0, 1, 5, 3};
        String r1 = new String("R1"), r2 = new String("R2");
        MyThread4 t1 = new MyThread4(0, r1, r2);
        MyThread4 t2 = new MyThread4(1, r1, r2);
    }
}
