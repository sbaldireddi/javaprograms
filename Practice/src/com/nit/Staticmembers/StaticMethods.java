package com.nit.Staticmembers;

public class StaticMethods {
    static void m1(){
        System.out.println("In m1");
    }
    static void m2(){
        System.out.println("m2 is started");
        int m=10;
        int n=20;
        System.out.println("m2 is ended");
    }
    static void m3(){
        System.out.println("m3 is started");
        int m=30;
        int n=40;
        System.out.println("m3 is ended");
    }

    public static void main(String[] args) {
        System.out.println("main started");
        m1();m2();
        int m=50;
        int n=60;
        System.out.println("main ended");
    }
}
