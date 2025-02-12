package com.rishi.package1;

public class Base {
    private void pri(){
        System.out.println("Private : Base");
    }

    void def(){
        System.out.println("Default : Base");
    }

    protected void pro(){
        System.out.println("Protected : Base");
    }

    public void pub(){
        System.out.println("Public : Base");
    }

    public final void fin(){
        System.out.println("Final : Base");
        pri();
        def();
        pro();
        pub();
    }
}
