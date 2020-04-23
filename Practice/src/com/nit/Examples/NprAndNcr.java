package com.nit.Examples;

import java.util.Scanner;

public class NprAndNcr {


    double fact(double num){
        double fact=1;
        int i=1;
        while(i<=num){
            fact=fact*i;
            i++;
        }
        return fact;
    }
    double permutation(int num,int r){
       double per=fact(num)/fact(num-r);
        return per;
    }
    double combination(int num,int r){
        double com=fact(num)/(fact(r)*fact(num-r));
        return com;
    }
    public static void main(String[] agrs){
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter N value : ");
        int num=scn.nextInt();
        System.out.print("Enter r value : ");
        int r=scn.nextInt();
        NprAndNcr cap=new NprAndNcr();
        if(num>=r){
            System.out.println(num+"c"+r+"="+cap.combination(num,r));
            System.out.println(num+"p"+r+"="+cap.permutation(num,r));
        }else{
           System.out.println("Enter N value greater than r value");
        }
    }
}
