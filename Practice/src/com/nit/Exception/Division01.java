package com.nit.Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Division01 {
    public static void div(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int a;
            while (true) {
                try {
                    System.out.print("\n Enter first number: ");
                    a = Integer.parseInt(br.readLine());
                    break;
                } catch (NumberFormatException nfe) {
                    System.out.println("Enter only integer");
                }
            }
            while (true) {
                try {
                    System.out.println("\n Enter second Number: ");
                    int b = Integer.parseInt(br.readLine());
                    try {
                        int c = a / b;
                        System.out.println("Result : " + c);
                        break;
                    } catch (ArithmeticException ae) {
                        System.out.println("Do not pass zero");
                    }
                } catch (NumberFormatException nfe) {
                    System.out.println("Enter integer only ");
                }
            }
        }
                catch (IOException ioe){
                    ioe.printStackTrace();

        }
    }
}
