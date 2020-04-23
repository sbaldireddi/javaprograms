package com.nit.Examples;

import java.util.Scanner;

public class Armstrong {
       public static void main(String[] args) {
           Scanner scn = new Scanner(System.in);
            System.out.print("Enter Number : ");
            int num=scn.nextInt();
            int result=0,temp;
            temp=num;
            while(num>0) {
                int rem=num%10;
                result=result+rem*rem*rem;
                num/=10;
            }
            if(temp==result) {
                System.out.println("Number "+temp+" is Armstrong number ");

            }else {
                System.out.println("Number "+temp+" is not a Armstrong number ");
            }

        }

    }


