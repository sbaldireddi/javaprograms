package com.nit.Inheritance;

public class C1 {
    static int a=10;
    static {
        System.out.println("C1 SB");
        System.out.println(a);
        System.out.println(D1.b);
    }
    static void m1(){
        System.out.println("C m1");
    }
}
class D1 extends C1{
    static int b=20;
    static {
        System.out.println("D1 SB");
        System.out.println(a);
        System.out.println(b);
    }
}
class Main1{
    public static void main(String[] args) {
        D1.m1();
        System.out.println(D1.a);
    }
}

