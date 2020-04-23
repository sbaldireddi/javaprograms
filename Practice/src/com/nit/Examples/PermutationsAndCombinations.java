package com.nit.Examples;

import java.util.Scanner;
public class PermutationsAndCombinations{
    public static void main(String[] agrs){
        Scanner scn =new Scanner(System.in);

        System.out.print("Enter N value: ");
        int num=  scn.nextInt();
        double result=1;
        for (int i=1;i<=num;i++) {
            result = result * i;
        }

     //   System.out.println(result);
        System.out.print("Enter r value  : ");
        int r=scn.nextInt();
        double t=1;
        for(int i=1;i<=r;i++){
           t=t*i;
        }
    //    System.out.println(t);

        int R=1;
        R=  (num-r);
        double F=1;
     //   System.out.println(R);
        for (int j=1;j<=R;j++) {
            F = F*j;

        }
     //   System.out.println(F);
         double S=result/F;
        System.out.println(num+"P"+r+" = "+S);

         double m=result/(t*F);
        System.out.println(num+"C"+r+" = "+m);
    }
}
