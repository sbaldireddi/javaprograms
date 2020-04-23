package com.nit.Examples;

import java.util.Scanner;

public class Swaping {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter a value : ");
        int a= scn.nextInt();
        System.out.print("Enter b value : ");
        int b= scn.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+" b="+b);

    }

}
