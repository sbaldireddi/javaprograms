package com.nit.Exception;

public class Example {
    public static void main(String[] args) {
      //   m1();
        System.out.println(m1());
    }
    static int m1(){
        try {
            System.out.println("In try");
          //  System.out.println(10/0);
            return 10;
        }
        catch (NullPointerException ae){
            System.out.println("In catch");
         //   return 20;
        }
        finally {
            System.out.println("In finally");
            if (true) {
                return 30;
            }
        }
            System.out.println("After try/catch/finally");
        return 0;
    }
}
