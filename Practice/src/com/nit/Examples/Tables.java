package com.nit.Examples;

public class Tables {
    public static void main(String[] args) {
        int result;
	/*	Scanner scn=new Scanner(System.in);
		System.out.print("Enter table number : ");
		int num=scn.nextInt();
	9*/	for(int i=1;i<=20;i++) {
            for(int j=1;j<=10;j++) {
                result = j*i;
                System.out.println(i+"*"+j+"="+result);
            }
            System.out.println("\n");
        }
        System.out.println();

    }

}
