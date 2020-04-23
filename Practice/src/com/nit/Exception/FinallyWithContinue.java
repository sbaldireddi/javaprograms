package com.nit.Exception;

public class FinallyWithContinue {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            try{
                System.out.println("In try");
                if (i==5){
                    continue;
                }
            }
            finally {
                System.out.println("Infinally");
            }
            System.out.println("After try/finally");
        }
        System.out.println("\nAfter loop");
    }
}
