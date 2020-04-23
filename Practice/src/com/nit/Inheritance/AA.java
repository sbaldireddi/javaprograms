package com.nit.Inheritance;

public class AA {
    static int a=10;
    int x=20;
    static void m1(){
        System.out.println("AA class m1");
    }
    void m2(){
        System.out.println("AA class m2");
    }
    void m3(){
        System.out.println("AA class m3");
    }

}
class BB extends AA{
    static int a=50;
    int x=60;
    static void m1(){
     //   super.m1();
        System.out.println("BB class m1");
    }
    void m2(){
        System.out.println("BB class m2");
        super.m2();
    }
    void m4(){
       System.out.println(super.a+"......"+a);
       System.out.println(super.x+"......"+x);
       super.m1();
       m1();
       super.m2();
       m2();
    }

    public static void main(String[] args) {
        BB b= new BB();
        b.m4();
    }
}