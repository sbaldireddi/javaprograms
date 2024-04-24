package com.nit.Examples;

import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int sum=0;
        System.out.print("Enter number : ");
        int num=scn.nextInt();
        String s="";
        while(num>0){
            int rem=num%10;
            sum += rem;//sum=sum+rem; if it is sum =+ rem then sum=rem
            s=""+rem;
            num=num/10;
        }
        System.out.println("Sum of digits : "+sum);
        
    }

}
