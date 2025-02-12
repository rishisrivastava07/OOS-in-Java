package com.rishi.staticMembers;

class Sample {
public
    static String s1 = "Info";
    static void test(String s){
        s1 = s1 + s;
    }
    void display(){
        // same usage for both the lines
        // first one will directly print the s1 and second one will pass the reference to show function
        System.out.println(s1);
        this.show();
    }

    static void show() {
        System.out.println(s1);
    }
}

class SampleDemo{
    public static void main(String[] args) {
        Sample.test("Tech");
        System.out.println(Sample.s1);
        Sample ob = new Sample();
        ob.test("IT");
        System.out.println(ob.s1);
        ob.display();
    }
}