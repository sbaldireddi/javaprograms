package com.nit.Patterns;

import java.util.Scanner;

public class NumberPattern {

    public static void main(String[] args) {
        int k=1;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num= scn.nextInt();
        for(int i=1;i<=num;i++) {
            for(int j=1;j<=i;j++) {

                System.out.print(k++ +" ");
            }
            System.out.println();

        }

    }

}
