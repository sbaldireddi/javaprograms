package com.nit.Inheritance;

public class AA4 {
    int x=10;
    int y=20;
    void m1(){
        System.out.println(x);
        System.out.println(y);
    }
}
class BB4 extends AA4{
    int x=30;
    int y=40;
    void m2(){
        System.out.println(x);
        System.out.println(y);

    }
    public static void main(String[] args) {
        BB4 b1=new BB4();
        BB4 b2=new BB4();
        b2.x=50;
        b2.y=60;
        b1.m1();
        b1.m2();
        System.out.println();
        b2.m1();
        b2.m2();

    }
}
