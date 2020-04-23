package com.nit.Examples;
import java.util.Scanner;
public class Addition {
    {
        System.out.println("Result is:");
    }
    Addition(int i,int j){
        //  System.out.println("Result is:");
        System.out.println(i+j);
    }
    Addition(float f1,float f2){
        //  System.out.println("Result is:");
        System.out.println(f1+f2);
    }
    Addition(String s1,String s2){
        // System.out.println("Result is:");
        System.out.println(s1+s2);
    }

    public Addition() {

    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        Addition a1=new Addition(10,20);

        System.out.println();
    }

}
