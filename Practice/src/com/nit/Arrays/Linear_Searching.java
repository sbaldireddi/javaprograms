package com.nit.Arrays;

import java.util.Scanner;

public class Linear_Searching {
    public static void main(String[] args) {
        int[] arr={56,2,48,6,22};
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter Searching key : ");
        int key=scn.nextInt();
        int i=0;
            if (arr[i] == key) {
                System.out.println("Number is found at index "+i);
            } else {
                System.out.println("Number is not found");
            }

    }
}
