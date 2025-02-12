package com.rishi.Streams;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;

public class FileCopyDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        int nextByte;
        try{
            fis = new FileInputStream("D:\\Codes\\oop\\OOPsInJava\\src\\com\\rishi\\Streams\\sourceFile.txt");
            fos = new FileOutputStream("D:\\Codes\\oop\\OOPsInJava\\src\\com\\rishi\\Streams\\destinationFile.txt");
//            fos = new FileOutputStream("dest.txt");

            while((nextByte = fis.read()) != -1){
                fos.write((char)nextByte);
            }
        } catch(Exception e){
            System.out.println("Exception caught : " + e);
        }
    }
}
