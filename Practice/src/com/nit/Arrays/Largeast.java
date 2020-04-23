package com.nit.Arrays;

public class Largeast {
    public static void main(String[] args) {
        int[] arr= {26,2,65,68};
        int largeast=0;/*
		scn=new Scanner(System.in);
		System.out.print("Enter Array : ");
		arr=scn.nextInt();*/
        for (int value : arr) {

            if (value > largeast) {
                largeast = value;
            }
        }
        System.out.println(largeast);
    }

}
