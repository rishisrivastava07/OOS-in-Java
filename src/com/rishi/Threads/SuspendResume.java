package com.rishi.Threads;

class MyThread2 extends Thread{
    boolean active = true;
    public void Suspend(){
        active = false;
    }
    public void Resume(){
        active = true;
        notify();
    }

    public synchronized void run(){
        try{
            while(true){
                if(active){
                    System.out.println("Running....");
                    Thread.sleep(500);
                } else {
                    System.out.println("Suspended....");
                    wait();
                }
            }
        } catch(InterruptedException e){
            System.out.println("Thread interrupted");
        }
    }
}

public class SuspendResume {
    public static void main(String[] args) throws InterruptedException {
        MyThread2 t = new MyThread2();
        t.start();

        while(true){
            Thread.sleep(1000);
            t.Suspend();
            Thread.sleep(1000);
            t.Resume();
        }
    }
}
