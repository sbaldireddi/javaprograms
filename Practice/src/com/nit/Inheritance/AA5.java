package com.nit.Inheritance;

public class AA5 {
    int x=10;
    int y=20;
    void m1(){
        System.out.println(x);
        System.out.println(y);
    }
}
class BB5 extends AA5{
    int x=30;
    int y=40;
    void m2(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(super.x);
        System.out.println(super.y);
    }
    void m3(){
        x=50;
        y=60;
        super.x=70;
        super.y=80;
    }
}
class AABB5{
    public static void main(String[] args) {
        BB5 b1=new BB5();
        AA5 a1=b1;
        BB5 b2=new BB5();
        AA5 a2=b2;

        b1.m3();

        System.out.println(b1.x+"...."+b1.y);
        System.out.println(a1.x+"...."+a1.y);
        System.out.println(b2.x+"...."+b2.y);
        System.out.println(a2.x+"...."+a2.y);
        System.out.println();
        b1.m1();b2.m1();
        System.out.println();
        b1.m2();b2.m2();
        System.out.println();
    }
}