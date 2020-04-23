package com.nit.Patterns;

import java.util.Scanner;

public class DaimondStar {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
            System.out.print("Enter your number : ");
            int num= scn.nextInt();
            for(int i=num;i>=1;i--) {
                for(int j=1;j<=i;j++) {
                    System.out.print(" ");
                }
                for(int j=num;j>=i;j--) {
                    System.out.print(" *");
                }
                System.out.println();
            }
            for(int i=2;i<=num;i++) {
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
