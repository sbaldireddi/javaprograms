package com.nit.Exception;

public class FinallywithBreak {
    public static void main(String[] args) {
       for (int i=1;i<=10;i++){
           try {
               System.out.println("In try");
               if (i==5){
                   break;
               }
           }
           finally {
               System.out.println("In finally");
           }
           System.out.println("After try/finally");
       }
       System.out.println("\nAfter loop");
    }
}
