package com.nit.Patterns;

import java.util.Scanner;

public class RightAlphebeticTrianglePattern {
    private static Scanner scn=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        int num=scn.nextInt();
        int a=65;
        for(int i=0;i<=num;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print((char)(a+j) +" ");
            }
            System.out.println();
        }
    }

}
