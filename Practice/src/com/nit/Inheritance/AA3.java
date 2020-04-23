package com.nit.Inheritance;

public class AA3 {
    static int a=10;
    int x=20;
}
class BB3 extends AA3{
    static int a=30;
    int x=40;
}
class AABB3_1{
    public static void main(String[] args) {
        BB3 b=new BB3();
        AA3 a=new AA3();
        System.out.println(b.a+"...."+b.x);
        System.out.println(a.a+"...."+a.x);
        System.out.println(AA3.a+"...."+BB3.a);

        b.a=5;
        a.a=6;

        System.out.println(b.a+"...."+b.x);
        System.out.println(a.a+"...."+a.x);
        System.out.println(AA3.a+"...."+BB3.a);
    }
}
class AABB2_2{
    public static void main(String[] args) {
        BB3 b=new BB3();
        AA3 a=b;

        System.out.println("a: "+b.a);
        System.out.println("a: "+a.a);

        System.out.println("x: "+b.x);
        System.out.println("x: "+a.x);

    }
}