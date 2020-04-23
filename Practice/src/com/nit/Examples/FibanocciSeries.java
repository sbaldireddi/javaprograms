package com.nit.Examples;

import java.util.Scanner;

public class FibanocciSeries {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your count : ");
        int count=scn.nextInt();
        int num=0,num1=1,fib;
        System.out.print(num+" "+num1);
        for(int i=1;i<=count;i++) {
            fib=num+num1;
            System.out.print(" "+fib);
            num=num1;
            num1=fib;
        }
    }

}
