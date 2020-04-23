package com.nit.Arrays;

import java.util.Scanner;

public class DecimalToOctal {
    private static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter number : ");
        int num = scn.nextInt();
        int rem;
        String string = "";
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7};
        while (num > 0) {
            rem = num % 8;
            string =  arr[rem]+string;
            num /= 8;
        }
        System.out.println(string);
    }
}