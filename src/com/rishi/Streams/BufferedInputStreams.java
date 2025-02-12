package com.rishi.Streams;

import java.io.BufferedInputStream;
import java.io.*;

public class BufferedInputStreams {
    public static void main(String[] args) {
        BufferedInputStream bis = null;
        int nextByte;

        try{
            bis = new BufferedInputStream(new FileInputStream("D:\\Codes\\oop\\OOPsInJava\\src\\com\\rishi\\Streams\\sourceFile.txt"));
            while((nextByte =  bis.read()) != -1){
                System.out.println((char)nextByte);
            }
        } catch(IOException e){
            System.out.println("Error handled : " + e.getMessage());
        }
        finally {
            try{
                bis.close();
            } catch (IOException e) {
                System.out.println("Error handled finally");
            }
        }
    }
}
