package com.Hacker.Examples;

import java.util.Scanner;

public class Stdin_Stdout {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter integer : ");
        int i=scn.nextInt();
        System.out.print("Enter double : ");
        double d=scn.nextDouble();scn.nextLine();
        System.out.print("Enter string : ");
        String s=scn.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
