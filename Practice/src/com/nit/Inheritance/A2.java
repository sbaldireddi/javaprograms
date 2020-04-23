package com.nit.Inheritance;

public class A2 {
    static int a=m1();
    static private int m1(){
        System.out.println("A SV");
        return 10;
    }
    static {
        System.out.println("A SB");
    }

    public static void main(String[] args) {
        System.out.println("A main");
    }
}
class B2 extends A2{
    static private int b=m2();

    static private int m2(){
        System.out.println("B SV");
        return 20;
    }
    static {
        System.out.println("B SB");
    }

    public static void main(String[] args) {
        System.out.println("B main");
        System.out.println("B main a: "+a);
        System.out.println("B main b: "+b);
    }
}