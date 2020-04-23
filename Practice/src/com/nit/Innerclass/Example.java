package com.nit.Innerclass;

public class Example {
    static int a=10;
    int x=20;
    private int y=30;
   static class A{
        public static void main(String[] args) {
            System.out.println(a);
        //    System.out.println(x); non-static variable x cannot be referenced from a static context
        //    System.out.println(y); non-static variable y cannot be referenced from a static context

            Example e=new Example();
            System.out.println(e.a);
            System.out.println(e.x);
            System.out.println(e.y);
        }
    }
}
