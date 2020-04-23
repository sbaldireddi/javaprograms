package com.nit.Arrays;
import java.util.Scanner;

public class DecimalToBinary1 {
    private static Scanner scn=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        int num=scn.nextInt();
        StringBuilder s= new StringBuilder();
        int rem;
        int[] ia= {0,1};
        while(num>0) {
            rem=num%2;
            s.insert(0, ia[rem]);
            num/=2;
        }
        System.out.println(s);
    }

}
