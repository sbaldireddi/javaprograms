package com.nit.Examples;

import java.util.Scanner;

public class ReverseNumber {
	
	static Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter Num: ");
		int num=scanner.nextInt();
		int sum=0;

		String string2="";
		while (num>0) {
			int rem=num%10;
			
			sum=rem+sum*10;
			
			num=num/10;
			string2 += rem;
		}
		System.out.println(sum);
		System.out.println(string2);
		

	}

}
