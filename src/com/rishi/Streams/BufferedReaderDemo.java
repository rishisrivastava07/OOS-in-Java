package com.rishi.Streams;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        BufferedReader br = null;
        try{
            System.out.print("Hi, within try : Please input : ");
            br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            System.out.println("Entered through keyboard (output) : " + str);
        } catch (Exception e){
            System.out.println("Exception caught");
        }
    }
}
