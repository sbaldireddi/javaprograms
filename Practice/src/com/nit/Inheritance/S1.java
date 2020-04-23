package com.nit.Inheritance;

public class S1 {
    static int a=10;
    static {
        System.out.println("S SB");
    }
    static void m1(){
        System.out.println("S m1");
    }
}
class L extends S1 {
    static int b=20;
    static {
        System.out.println("L SB");
    }
}
class Test05{
    public static void main(String[] args) {
        System.out.println(L.class);
        System.out.println(L.a);
        System.out.println(L.b);
    }
}
