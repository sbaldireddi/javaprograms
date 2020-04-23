package com.nit.Exception;

public class LVwithTry {
    public static void main(String[] args) {
        int a=-1;
        try {
            a=Integer.parseInt("a");
            System.out.println("In try a: "+a);
        }
        catch (ArithmeticException ae){
            a=20;
            System.out.println("In catch a: "+a);
        }
        finally {
            System.out.println("In finally a: "+a);
        }
        System.out.println("After try/catch/finally a: "+a);
    }
}
