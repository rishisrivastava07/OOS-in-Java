package com.rishi.Streams;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileStreamDemo {
    public static void main(String[] args) {
        int nextByte;
        try{
            File aFile = new File("D:\\Codes\\oop\\OOPsInJava\\src\\com\\rishi\\Streams\\sourceFile.txt");
            FileReader fr = new FileReader(aFile);
            while((nextByte = fr.read()) != -1){
                System.out.print((char)nextByte);
            }
        } catch(IOException e){
            System.out.println("Caught !!");
        }
    }
}
