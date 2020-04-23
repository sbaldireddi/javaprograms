package com.nit.Exception;

public class Division {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]) ; //ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
            int b = Integer.parseInt("a");
            int c = a / b;
            System.out.println("Result :" + c);
        }
        catch (ArrayIndexOutOfBoundsException aiob){
            System.out.println("Please pass atleast two integer values");
        }catch (NumberFormatException nfe){
            System.out.println("Please pass only integer values");
        }
        catch (ArithmeticException ae){
            System.out.println("Please DONOT pass second value zero");
        }
    }
}
