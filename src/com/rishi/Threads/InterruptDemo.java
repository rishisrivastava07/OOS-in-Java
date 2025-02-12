package com.rishi.Threads;

class Timer extends Thread {
    public void run(){
        while(true){
            System.out.println("Timer running. Date and time : " + new java.util.Date());
            // Way 01
            /*try{
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                System.out.println("Timer Interrupted");
                return;
            }*/

            // Way 02
            if(Thread.interrupted()){
                System.out.println("Timer Interrupted");
                return;
            }
        }
    }
}

public class InterruptDemo {
    public static void main(String[] args) throws InterruptedException {
        Timer t = new Timer();
        t.start();

        Thread.sleep(40);
        t.interrupt();
    }
}
