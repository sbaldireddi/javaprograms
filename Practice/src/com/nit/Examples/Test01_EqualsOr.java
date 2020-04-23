package com.nit.Examples;

public class Test01_EqualsOr {
    public static void main(String[] args) {
        Student s1 = new Student(100, "satish", "Cj", 2000);
        Student s2 = new Student(100, "satish", "cj", 2000);
        Student s3= new Student(101,"satya","Adj",3000);
        Student s4=s1;
        System.out.println(s1==s4);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println();
        System.out.println(s3.equals(s1));
        System.out.println(s1.equals(null));
    }
}
