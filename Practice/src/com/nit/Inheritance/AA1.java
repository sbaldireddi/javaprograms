package com.nit.Inheritance;

public class AA1 {
    int x = 10;
    int y = 20;

    void m1() {
        System.out.println("m1");
    }

}
class BB1 extends AA1{
       int x=30;
       int y=40;
    void m2(){
        System.out.println("x: "+x);
        System.out.println("y: "+y);
        System.out.println("x: "+super.x);
        System.out.println("y: "+super.y);

    }
    void m3(){
    int x=50;
    int y=60;
    System.out.println("local x: "+x);
    System.out.println("local y: "+y);

    System.out.println("sub class x: "+this.x);
    System.out.println("sub class y: "+this.y);

    System.out.println("super class x: "+super.x);
    System.out.println("super class y: "+super.y);
    }

    public static void main(String[] args) {
        BB1 b=new BB1();
        b.m2();
        b.m3();
    }
}

