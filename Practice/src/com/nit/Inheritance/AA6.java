package com.nit.Inheritance;

public class AA6 {
    static int a=10;
    int x=20;
    static {
        System.out.println("A is loaded");
    }
}
class BB6 extends AA6{
    static int b=30;
    int y=40;
    static {
        System.out.println("B is loaded");
    }
}
class CC6 extends AA6{
    static int c=50;
    int z =60;
    static {
        System.out.println("C is loaded");
    }
}
class TestABC6{
    static {
        System.out.println("TestABC6 is loaded");
    }

    public static void main(String[] args) {
        BB6 b=new BB6();
        CC6 c=new CC6();
        b.a=15;
        b.x=16;
        System.out.println("b.a: "+b.a);
        System.out.println("c.a: "+c.a);

        System.out.println("b.x: "+b.x);
        System.out.println("c.x: "+c.x);
    }
}