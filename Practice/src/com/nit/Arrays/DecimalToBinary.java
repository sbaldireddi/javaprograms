package com.nit.Arrays;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num=scn.nextInt();
        int rem;
        StringBuilder s= new StringBuilder();
        StringBuilder rev= new StringBuilder();
        while(num>0) {
            rem=num%2;
            //   System.out.print(rem);

            s.append(String.valueOf(rem));


            //      System.out.print(s);
            num/=2;
        }

        for(int i=s.length()-1;i>=0;i-- ) {
            rev.append(s.charAt(i));

            //	 System.out.print(i);

        }
        System.out.println(rev);
    }

}
