package com.rishi.Streams;

import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, count = 0;

        System.out.println("Enter the values below : ");
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            sum += num;
            count++;
        }

        float mean = (float)sum/count;
        System.out.println("Mean : " + mean);
    }
}
