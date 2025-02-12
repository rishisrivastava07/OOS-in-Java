package com.rishi.Streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;

public class DifferentSolution {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter your age : ");
        int age = Integer.parseInt(br.readLine());

        System.out.print("Enter your name : ");
        String name = br.readLine();

        System.out.println("Your age : "+age);
        System.out.println("Your name : "+name);
    }
}
