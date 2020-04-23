package com.nit.Examples;

import java.util.Scanner;

public class Triangular_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("For Input ");
        int a=sc.nextInt()*2;
        int u=(int)Math.sqrt(a);
        System.out.println((a==u*(u+1))?0:1);
    }
}
