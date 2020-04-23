package com.nit.Examples;

import java.util.Scanner;

public class SimpleInterest {
    private double simpleinterest(int p, float r, float m){
        return (p*r*m)/100;
    }
    public static void main(String [] agrs){
        Scanner scn=new Scanner(System.in);
        System.out.print("enter Amount : ");
        int p=scn.nextInt();
        System.out.print("enter rate : ");
        float r=scn.nextFloat();
        System.out.print("Enter months : ");
        float y=scn.nextFloat();
        SimpleInterest si=new SimpleInterest();
        System.out.println(si.simpleinterest(p,r,y));
    }
}
