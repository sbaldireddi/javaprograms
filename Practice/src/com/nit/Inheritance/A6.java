package com.nit.Inheritance;

public class A6 {
    static int a1=10;
    static double a2=m1();
    static double m1(){
        System.out.println("m1() method ");
        return 10;
    }
    static {
        System.out.println("A SB");
        System.out.println("a1: "+a1);
        System.out.println("a2: "+a2);
        System.out.println("b1: "+B6.b1);
        System.out.println("b2: "+B6.b2);
    }
}
class B6 extends A6{
    static int b1=20;
    static double b2=m2();
    static double m2(){
        System.out.println("m2() method");
        return 20;
    }
    static {
        System.out.println("B SB");
        System.out.println("b1: "+b1);
        System.out.println("b2: "+b2);
        System.out.println("a1: "+a1);
        System.out.println("a2: "+a2);
    }

    public static void main(String[] args) {
        System.out.println("B main");
        System.out.println("B main a1: "+a1);
        System.out.println("B main a2: "+a2);
        System.out.println("B main b1: "+b1);
        System.out.println("B main b2: "+b2);
    }
}