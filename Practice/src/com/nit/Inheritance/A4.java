package com.nit.Inheritance;

public class A4 {
    static int a=10;
    static int b=m1();
    static int m1(){
        System.out.println("m1() method");
        return 20;
    }
    static {
        System.out.println("A SB");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }

    public static void main(String[] args) {
        System.out.println("A main");
        System.out.println("A main a: "+a);
        System.out.println("A main b: "+b);
    }
}
