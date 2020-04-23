package com.nit.Staticmembers;

public class Example3 {
    static int a=10;

    public static void main(String[] args) {
        int a=20;
        Example3.a=a;
        System.out.println(a);
        System.out.println(Example3.a);
    }
}
