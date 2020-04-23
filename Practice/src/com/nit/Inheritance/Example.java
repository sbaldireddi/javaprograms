package com.nit.Inheritance;

public class Example {
    static int a=10;
    static{
        System.out.println("Ex SB");
        System.out.println(Example.a);
        System.out.println(Example.b);
        System.out.println(sample.c);
    }

    public static void main(String[] args) {
        System.out.println("Ex main");
        System.out.println(Example.a);
        System.out.println(Example.b);
        System.out.println(sample.c);
    }
    static int b=20;
}
class sample extends Example {
    static int c=30;
    static {
        System.out.println("Sa SB");
        System.out.println("a: "+a);
        System.out.println("b: "+b );
        System.out.println("c: "+c);
    }

    public static void main(String[] args) {
        System.out.println("Sa main");
        System.out.println("a: "+a);
        System.out.println("b: "+b );
        System.out.println("c: "+c);
    }
}