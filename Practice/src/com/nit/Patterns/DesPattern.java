package com.nit.Patterns;

import java.util.Scanner;

public class DesPattern {

        private static Scanner scn=new Scanner(System.in);
        public static void main(String[] args) {
            System.out.print("Enter number : ");
            int num=scn.nextInt();
            for(int i=1;i<=num;i++) {
                for(int j=0;j<i;j++) {
                    System.out.print( " "+(num-j));

                }
                System.out.println();
            }

        }

    }

