package com.nit.Inheritance;

public class C {
    static int a=10;
    static {
        System.out.println("C SB");
        System.out.println(a);
        System.out.println(D.b);
    }
    static void m1(){
        System.out.println("C m1");
    }
}
class D extends C{
    static int b=20;
    static {
        System.out.println("D SB");
        System.out.println(a);
        System.out.println(b);
    }
}
class Main{
    public static void main(String[] args) {
        System.out.println(D.a);
    }
}