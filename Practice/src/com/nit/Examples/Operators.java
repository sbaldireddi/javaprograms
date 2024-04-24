package com.nit.Examples;

public class Operators {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        x=y;
        System.out.println(x==y);
        System.out.println("x++ "+ x++);
        System.out.println("x-- "+ x--);
        System.out.println("--x "+ --x);
        System.out.println("++x "+ ++x);
        System.out.println("++x "+ ++x);
        System.out.println(x=30);
        System.out.println(x);
        System.out.println(x==30);
        System.out.println(x);
        x=97;
        char ch='a';
        System.out.println(x==ch);
      //  System.out.println(true==10);
     //   System.out.println(5&&6);
        System.out.println(true&&false);
        System.out.println(m1()&&m2());
        System.out.println(m2()&&m1());
      //  System.out.println(6||5);
        System.out.println(5&6);
        System.out.println(true&true);
        System.out.println(true&false);
        System.out.println(false&true);
        System.out.println(false&false);
    }
   static boolean m1(){
        System.out.println("from m1");
        return false;
   }
   static boolean m2(){
      System.out.println("from m2");
      return true;
   }

}
