package com.nit.Arrays;

import java.util.Scanner;

public class GM_I_NI {
    public static void main(String[] args) {
           Scanner scn=new Scanner(System.in);
           System.out.print("Enter length : ");
           int arr=scn.nextInt();
        for (int i = 0; i < arr; i++) {
            for (int j = 0; j < arr; j++) {
                if (i == j) {
                    System.out.print(" 1");
                } else {
                    System.out.print(" 0");
                }
            }
            System.out.println();
        }
        System.out.println();
          int[][]arr1= {{2,3,1},{5,6,4},{9,7,8}};
        for (int[] ints : arr1) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(" " + ints[j]);
            }
            System.out.println();
        }
    }
}