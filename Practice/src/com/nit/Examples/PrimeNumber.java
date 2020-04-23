package com.nit.Examples;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] agrs){
    Scanner scn=new Scanner(System.in);
    System.out.print("Enter number : ");
    int num=scn.nextInt();
    int temp=0;
    int m;
    m=num/2;
    if(num==0||num==1){
        System.out.println(num+" Number is not a prime number");
    }else{
    for(int i=2;i<=m;i++)

    {
        if (num % i == 0) {
            System.out.println(num+" Number is not a prime number");
            temp = 1;
            break;
        }
    }
        if(temp==0){

            System.out.println(num+" Number is a prime number");
        }
    }
}
    }