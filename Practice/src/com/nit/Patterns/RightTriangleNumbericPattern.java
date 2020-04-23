package com.nit.Patterns;

import java.util.Scanner;

public class RightTriangleNumbericPattern {
    private static Scanner scn=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        int num=scn.nextInt();
        for(int i=1;i<=num;i++) {
            for(int j=i;j>=1;j--) {
                System.out.print(j+" ");

            }
            System.out.println();
        }
    }
}
