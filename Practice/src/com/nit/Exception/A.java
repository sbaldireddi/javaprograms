package com.nit.Exception;

public class A {
    public static void main(String[] args) {
        int a;
        try {
            a=10;
         //   System.out.println(a);
          //  System.out.println(b);
        }
        catch (ArithmeticException ae){
            a=30;
         //   System.out.println(a);

       //  int   b=40;
        }
        finally {
            a=30;
          //  System.out.println(a);
        }
        System.out.println(a);
    }
}
