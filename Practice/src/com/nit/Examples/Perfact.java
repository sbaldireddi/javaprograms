package com.nit.Examples;
import java.util.Scanner;
public class Perfact {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enetr number : ");
        int num = scn.nextInt();
        int temp;
        temp=num;
        int fact=0;
        for(int i=1;i<num;i++) {
            if (num % i == 0) {
                fact =+ i;
            }
        }
            if(temp==fact){
                System.out.println("number "+temp+" is perfact number");
            }else{
                System.out.println("number "+temp+" is not a perfact number");
            }
    }
}
