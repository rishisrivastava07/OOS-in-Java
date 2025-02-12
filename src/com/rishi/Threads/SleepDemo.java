package com.rishi.Threads;

public class SleepDemo {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            System.out.println("Local date and time : " + new java.util.Date());
            try{
                Thread.sleep(2000);
            } catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
