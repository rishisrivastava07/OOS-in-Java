package com.rishi.Streams;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age : ");
        int age = sc.nextInt();

        System.out.print("Enter name : ");
        String name = sc.nextLine();
        name = sc.nextLine();

//        System.out.print("Enter gender : ");
//        char gender = sc.next().charAt(0);
//
//        System.out.print("Enter Mobile Number : ");
//        long mobileNumber = sc.nextLong();
//
//        System.out.print("Enter CGPA : ");
//        double cgpa = sc.nextDouble();

        System.out.println("Name : " + name);
//        System.out.println("Gender : " + gender);
        System.out.println("Age : " + age);
//        System.out.println("Mobile Number : " + mobileNumber);
//        System.out.println("CGPA : " + cgpa);
    }
}
