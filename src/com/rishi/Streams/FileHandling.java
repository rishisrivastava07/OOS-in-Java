package com.rishi.Streams;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileHandling {
    public static void main(String[] args) throws FileNotFoundException {
        int nextByte;
        try(FileInputStream fis = new FileInputStream("D:\\Codes\\oop\\OOPsInJava\\src\\com\\rishi\\Streams\\sourceFile.txt")){
            while((nextByte = fis.read()) != -1){
                System.out.print((char)nextByte);
            }
            System.out.println();
        } catch(Exception e){
            System.out.println("Within Catch Block");
        }
        finally {
            System.out.println("File operation successful");
        }
    }
}
