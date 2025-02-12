package com.rishi.Streams;

import java.io.DataOutputStream;
import java.io.*;

public class DataOutputStreamDemo {
    public static void main(String[] args) {
        DataOutputStream dos = null;

        try{
            dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("D:\\Codes\\oop\\OOPsInJava\\src\\com\\rishi\\Streams\\sourceFile.txt")));
            dos.writeInt(5);
        } catch (IOException e) {
            System.out.println("Exception caught");
        }
    }
}
