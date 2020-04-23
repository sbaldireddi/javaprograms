package com.nit.Patterns;

import java.util.Scanner;
import java.util.SortedMap;

public class Plus_Star_Pattern {
    public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      System.out.print("Enter number : ");
      int num=scn.nextInt();
      for(int i=1;i<=num;i++) {
          for (int j = 1; j <= num/2; j++) {
              System.out.print(" ");
          }
          for(int j=1;j<=1;j++){
              System.out.print("*");
          }
          System.out.println();
      }
          for(int j=1;j<=num;j++){
              System.out.print("*");
      }
            System.out.println();
        for(int i=1;i<=num;i++) {
            for (int j = 1; j <= num / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
