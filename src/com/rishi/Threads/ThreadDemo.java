package com.rishi.Threads;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Current Thread : " + t);
        System.out.println("Name : " + t.getName());
        System.out.println("ID : " + t.getId());
        System.out.println("Priority : " + t.getPriority());
        System.out.println("State : " + t.getState());

        System.out.println("Before Changing name and priority");
        t.setName("Primary");
        t.setPriority(10);
        System.out.println("After Changing name and priority");

        System.out.println("Current Thread : " + t);
        System.out.println("Name : " + t.getName());
        System.out.println("ID : " + t.getId());
        System.out.println("Priority : " + t.getPriority());
        System.out.println("State : " + t.getState());
    }
}
