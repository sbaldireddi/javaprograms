package com.nit.Examples;

import java.util.Scanner;

public class LeapYear {
    private static Scanner scn;

    public static void main(String[] args) {
        scn = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year=scn.nextInt();
        if(year%4==0) {
            System.out.println("year "+year+" is leap year ");
        }else {
            System.out.println("year "+year+" is not a leap year ");
        }
    }


}
