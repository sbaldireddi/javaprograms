package com.nit.Exception;

public class Example002 {
    public static void main(String[] args) {
        System.out.println("main start");
        m1();
        System.out.println("main end");
    }
    static void m1(){
        System.out.println("In m1 method start ");
        System.out.println(10/0);
        System.out.println("In m1 method end");
    }
}
