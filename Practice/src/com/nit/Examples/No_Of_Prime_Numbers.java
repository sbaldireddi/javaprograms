package com.nit.Examples;

import java.util.Scanner;

public class No_Of_Prime_Numbers {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter num: ");
		int num=scanner.nextInt();
		int j=2;
		for (int i = 1; i <= num; i++) {
			for (j = 2; j <= i; j++) {
				if(i%j == 0) {
					break;
				}
			}
			if(i == j) {
				System.out.print(i+" ");
			}
		}
		
	}

}
