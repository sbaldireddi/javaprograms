package com.nit.Innerclass;

public class Example4 {
    static {
        System.out.println("Outer class is loaded");
    }
    private Example4(){
        System.out.println("Outer class constructor");
    }
    static class A{
        static {
            System.out.println("Inner class is loaded");
        }
        A(){
            System.out.println("Inner class constructor");
        }
        static void m1(){
            System.out.println("inner class SM");
        }
        void m2(){
            System.out.println("Inner class NSB");
        }

        public static void main(String[] args) {
            System.out.println("Inner class main");
            A.m1();
            A a=new A();
            a.m2();
        }
    }
    private static void m3(){
        System.out.println("Outer class SM");
    }
    private void m4(){
        System.out.println("Outer class NSM");
    }

    public static void main(String[] args) {
        System.out.println("Outer class main");
        Example4.m3();
        Example4 e=new Example4();
        e.m4();
    }
}
