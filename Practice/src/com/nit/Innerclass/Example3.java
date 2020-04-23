package com.nit.Innerclass;

public class Example3 {
    static {
        System.out.println("Outer class is loaded");
    }
    static class A{
        static {
            System.out.println("Inner class is loaded ");
        }

        public static void main(String[] args) {
            System.out.println("Inner class main");
        }
    }

    public static void main(String[] args) {
        System.out.println("Outer class main");
    }
}
