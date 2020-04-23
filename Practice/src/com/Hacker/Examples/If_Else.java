package com.Hacker.Examples;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number : ");
        int N=s.nextInt();
        if(N%2!=0){
            System.out.println("weird");
        }else if (N==2||N==4){
            System.out.println("Not weird");
        }else if (N%2==0&&N<=20){
            System.out.println(" weird");
        }else {
            System.out.println("Not weird");
        }
    }
}
