package com.nit.Examples;

import java.util.Scanner;

public class AddNnumbers {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int sum=0;
        System.out.print("Enter number : ");
        int num=scn.nextInt();
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        System.out.println("sum of N numbers : "+sum);
    }
}
