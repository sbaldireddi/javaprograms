package com.nit.Exception;

public class Division1 {
    static int div(String[] args){
        int res=-1;
        try {
            int a=Integer.parseInt("10");
            int b=Integer.parseInt("0");
            int c=a/b;
            res=4;
        }
        catch (ArrayIndexOutOfBoundsException aiob){
            res=5;
        }
        catch (NumberFormatException e){
            res=6;
        }
        catch (ArithmeticException e){
            res=7;
        }
        System.out.println("After try/catch");
        return res;
    }

    public static void main(String[] args) {
        int res= Division1.div(args);
        System.out.println("Result : "+res);
    }
}
