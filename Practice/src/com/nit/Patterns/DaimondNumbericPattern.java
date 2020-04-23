package com.nit.Patterns;

import java.util.Scanner;

public class DaimondNumbericPattern {

        private static Scanner scn=new Scanner(System.in);
        public static void main(String[] args) {
            System.out.print("Enetr number : ");
            int num=scn.nextInt();
            for(int i=1;i<num;i++) {
                for(int j=1;j<=i;j++) {
                    System.out.print(" ");
                }
                for(int j=i;j<=num;j++) {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
            for(int i=num;i>=1;i--) {
                for(int j=i;j>1;j--) {
                    System.out.print(" ");
                }
                for(int j=i;j<=num;j++) {
                    System.out.print(" "+j);
                }
                System.out.println();
            }

        }

    }


