package com.nit.Patterns;

import java.util.Scanner;

public class Sample {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
	for(int i=1;i<=n;i++)
	{
		for(int j=n-1;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
}
	
}
}
