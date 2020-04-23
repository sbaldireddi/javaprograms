package com.nit.Inheritance;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enyter Sno : ");
        int sno=scn.nextInt();scn.nextLine();
        System.out.print("Enter Name : ");
        String name=scn.nextLine();
        System.out.print("Enter Course : ");
        String course=scn.nextLine();
        System.out.print("Enter Fee : ");
        double fee=scn.nextDouble();
        Student1 s1=new Student1();
        s1.setCourse(course);
        s1.setFee(fee);
        s1.setSno(sno);
        s1.setName(name);
        s1.write();
        s1.read();
        s1.listen();
        s1.eat();
        s1.sleep();
        s1.display();

    }
}
