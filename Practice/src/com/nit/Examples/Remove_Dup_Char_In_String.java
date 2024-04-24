package com.nit.Examples;

import java.util.Scanner;

public class Remove_Dup_Char_In_String {
	
	private static Scanner scanner;
	private static String s2;
	public static void main(String[] args) {
		scanner=new Scanner(System.in);
		System.out.print("Enter String : ");
		String s1=scanner.nextLine();
		int j=0;
		for (int i = 0; i < s1.length(); i++) {
			for (j = i+1; j < s1.length()-1; j++) {
				if (s1.charAt(i) == s1.charAt(j)) {
					s2=s1.charAt(i)+"";
					System.out.print(s2);
					//break;			 
				}
				//System.out.print(s2);
			}
			
		}
		

	}

}
