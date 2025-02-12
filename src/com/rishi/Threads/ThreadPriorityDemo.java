package com.rishi.Threads;

public class ThreadPriorityDemo extends Thread {
    public void run(){
        System.out.println("Initial Priority : "+ getPriority());
        setPriority(9);
        System.out.println("Final Priority : "+ getPriority());
    }
    public static void main(String[] args) {
//        ThreadPriorityDemo t = new ThreadPriorityDemo();
//        t.start();
        Thread t = Thread.currentThread();

        System.out.println("Main's initial priority : "+ t.getPriority());
        t.setPriority(7);
        System.out.println("Main's final priority : "+ t.getPriority());
        new ThreadPriorityDemo().start();
    }
}
