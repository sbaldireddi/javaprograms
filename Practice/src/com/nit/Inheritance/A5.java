package com.nit.Inheritance;

public class A5 {
    static int a=10;

    static {
        System.out.println("A SB");
        System.out.println("a: "+a);
        System.out.println("b: "+B5.b);
    }

    public static void main(String[] args) {
        System.out.println("A main");
        System.out.println("A main a: "+a);
        System.out.println("A main b: "+B5.b);
    }
}
class B5 extends A5{
    static int b=m1();
    static int m1(){
        System.out.println("m1() method");
        return 20;
    }
    static {
        System.out.println("B SB");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}