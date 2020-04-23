package com.nit.Arrays;

import java.util.Scanner;

public class PassingDynamicValues {
    static void add(int... a){
        if(a.length==0){
            System.out.println("Values are not passed");
        }else{
            int sum=0;
            for (int i=0;i<a.length;i++){
                sum+=a[i];
            }
            System.out.println("Result :"+sum);
        }
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("How many values you want input : ");
        int noOfValues=scn.nextInt();
        int[] inputValues=new int[noOfValues];
        for(int i=0;i<noOfValues;i++){
            System.out.print("Enter num"+(i+1)+":");
            inputValues[i]=scn.nextInt();
        }
        add(inputValues);
    }
}
