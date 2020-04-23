package com.nit.Inheritance;

public class A1 {
    static int a=10;
    static {
        System.out.println("In A SB");
        System.out.println("a: "+a);
      //  System.out.println("b: "+b);
        System.out.println("b: "+B1.b);
        System.out.println("b: "+B1.getB());
    }
}
class B1 extends A1{
    static int b=20;
    static {
        System.out.println("In B SB");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("b: "+getB());
    }
    static  int getB(){
        return b;
    }

    public static void main(String[] args) {
        System.out.println("In B main");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
