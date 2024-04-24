package com.nit.strings;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter string : ");
		String s1=scanner.nextLine();
		System.out.println(s1.length());
		for (int i=s1.length()-1; i >=0 ; i--) {
			String s2=s1.charAt(i)+"";
			System.out.print(s2);
		}
	}

}
