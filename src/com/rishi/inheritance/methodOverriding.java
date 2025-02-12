package com.rishi.inheritance;

class Employee{
    public static int basic = 30000;
    int salary(){
        return basic;
    }
}

class Manager extends Employee{
    int salary(){
        return (basic + 20000);
    }
}

class Clerk extends Employee{
    int salary(){
        return (basic + 10000);
    }
}

public class methodOverriding {
    static void printSalary(Employee e){
        System.out.println(e.salary());
    }

    public static void main(String[] args) {
        Employee e1 = new Manager();
        printSalary(e1);

        Employee e2 = new Clerk();
        printSalary(e2);
    }
}
