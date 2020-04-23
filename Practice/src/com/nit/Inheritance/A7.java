package com.nit.Inheritance;

public class A7 {
    static int a1=10;

    static {
        System.out.println("A SB");
        System.out.println("a1: "+A7.a1);
        System.out.println("a2: "+A7.a2);
        System.out.println("b1: "+B7.b1);
        System.out.println("b2: "+B7.b2);
    }

    public static void main(String[] args) {
     System.out.println("A main");
     System.out.println("A main a1: "+a1);
     System.out.println("A main a2: "+a2);
     System.out.println("A main b1: "+B7.b1);
     System.out.println("A main b2: "+B7.b2);
    }
    static int a2=20;

}
class B7 extends A7{
    static int b1=30;
    static int b2=m2();
    static int m2(){
        System.out.println("m2() method ");
        return 40;
    }
    static {
        System.out.println("B SB");
        System.out.println("a : "+a1);
        System.out.println("a2: "+a2);
        System.out.println("b1: "+b1);
        System.out.println("b2: "+b2);
    }

    public static void main(String[] args) {
        System.out.println("B main");
        System.out.println("B main a1: "+a1);
        System.out.println("B main a2: "+a2);
        System.out.println("B main b1: "+b1);
        System.out.println("B main b2: "+b2);
    }
}