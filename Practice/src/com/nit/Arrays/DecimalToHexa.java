package com.nit.Arrays;

import java.util.Scanner;

public class DecimalToHexa {
    private static Scanner scn=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enetr number : ");
        int num=scn.nextInt();
        String s="";
        int rem;
        char[] ch={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(num>0)
        {
            rem=num%16;
            s=ch[rem]+s;
            num/=16;
        }
        System.out.println(s);

    }


}
