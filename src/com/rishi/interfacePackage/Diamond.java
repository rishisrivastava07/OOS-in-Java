package com.rishi.interfacePackage;

interface Interface1 {
    void getName();
}

interface Interface2 {
    void getInstitute();
}

interface Interface3 extends Interface1, Interface2 {
    default void getInstitute() {
        System.out.println("JU");
    }

    default void getBranch(){
        System.out.println("IT");
    }
}
public class Diamond implements Interface3 {
    public void getName(){
        System.out.println("Rishi");
    }

//    public void getInstitute(){
//        System.out.println("Jadavpur University");
//    }

//    public void getBranch(){
//        System.out.println("Information Technology");
//    }

    public static void main(String[] args) {
        Diamond ob = new Diamond();
        ob.getName();
        ob.getInstitute();
        ob.getBranch();
    }

}
