package com.nit.Examples;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter number : ");
        int num= scn.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++) {
            sum=sum+i;
        }
        System.out.println(num+" natural numbers sum = "+sum);

    }

}
