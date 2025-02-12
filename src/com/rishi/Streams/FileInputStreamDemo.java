package com.rishi.Streams;

import java.io.FileInputStream;
import java.io.*;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        int nextByte;

        try{
            fis = new FileInputStream("D:\\Codes\\oop\\OOPsInJava\\src\\com\\rishi\\Streams\\sourceFile.txt");
            while((nextByte =  fis.read()) != -1){
                System.out.println((char)nextByte);
            }
        } catch(IOException e){
            System.out.println("Error handled : " + e.getMessage());
        }
        finally {
            try{
                fis.close();
            } catch (IOException e) {
                System.out.println("Error handled finally");
            }
        }
    }
}
