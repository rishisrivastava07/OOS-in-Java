package com.rishi.Threads;

class MyJoinThread extends Thread {
    int[] a;
    MyJoinThread(int[] ar) {
        System.out.println("Inside MyJoinThread Constructor");
        a = ar;
        start();
    }

    public void run() {
        System.out.println("Inside run method : Sorting started");
        java.util.Arrays.sort(a);
        System.out.println("run() completed sorting");
    }
}

public class JoinDemo {
    public static void main(String[] args) throws Exception {
        int a[] = {1, 4, 3, 8, 5, 7, 6, 2};
        System.out.println("main() array elements");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }

        MyJoinThread t = new MyJoinThread(a);
        t.join();

        System.out.println("main() array elements");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
