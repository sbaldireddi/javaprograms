package com.nit.Examples;

import java.util.Scanner;

public class Shapes {
    private static Scanner scn=new Scanner(System.in);
    public static void main(String[] args) {
        AreasForAll areas=new AreasForAll();
        System.out.print("Enter length : ");
        System.out.print("Enter wide : ");
        areas.setArea(scn.nextDouble(),scn.nextDouble());
        System.out.print("Enter redius : ");
        areas.setArea1(scn.nextDouble());
        System.out.print("Enter side : ");
        areas.setArea(scn.nextDouble());
        System.out.print("Enter breath : ");
        System.out.print("Enter height : ");
        areas.setArea1(scn.nextDouble(),scn.nextDouble());
        areas.display();
    }


}
