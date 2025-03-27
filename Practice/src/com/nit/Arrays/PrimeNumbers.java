package com.nit.Arrays;

import java.util.Scanner;

public class PrimeNumbers {

	public static Scanner scn =  new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter number : ");
        int num=scn.nextInt();
        
        for(int i=2; i<=num; i++) {
        	int j;
        	for(j=2; j<=i;j++) {
        		if(i%j==0) {
        			break;
        		}
        	}
        	if(i==j) {
        		System.out.print(i + " ");
        	}
        }

	}

}
