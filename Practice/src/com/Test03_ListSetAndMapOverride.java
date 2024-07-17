package com;

import com.nit.Examples.Employee;

import java.util.HashSet;

public class Test03_ListSetAndMapOverride {
    public static void main(String[] args) {
        Employee e1=new Employee(100,"satish","CJ",2000);
        Employee e2=new Employee(100,"satish","CJ",2000);
        Employee e3=new Employee(101,"satish","ADJ",2000);
        Employee e4=new Employee(100,"satish",null,2000);
        Employee e5=e4;
        HashSet<Employee>hs=new HashSet<>();
        hs.add(e1);System.out.println();
        hs.add(e2);System.out.println();
        hs.add(e3);System.out.println();
        hs.add(e4);System.out.println();
        hs.add(e5);System.out.println();
        System.out.println(hs);
        System.out.println("************************************************");
        System.out.println("************************************************");
    }
}
