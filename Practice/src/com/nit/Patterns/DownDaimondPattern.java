package com.nit.Patterns;

import java.util.Scanner;

public class DownDaimondPattern {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num= scn.nextInt();
        for(int i=1;i<=num;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(" ");
            }
            for(int j=num;j>=i;j--) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }


}
