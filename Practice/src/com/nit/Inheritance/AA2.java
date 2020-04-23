package com.nit.Inheritance;

public class AA2 {
    int x=10;
    int y=20;
}
class BB2 extends AA2{
    int x=30;
    int y=40;
}
class TestAABB2{
    public static void main(String[] args) {
        BB2 b=new BB2();
        AA2 a=new BB2();
        System.out.println(b.x+"..."+b.y);
        System.out.println(a.x+"..."+a.y);
        b.x=5;
        a.x=6;
        System.out.println(b.x+"..."+b.y);
        System.out.println(a.x+"..."+a.y);
    }
}