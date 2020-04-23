package com.nit.Polymorphism;

import com.nit.Exception.A;

public class A1 {
    static void m1(){
        System.out.println("A m1");
    }
    void m2(){
        System.out.println("A m2");
    }
    static void m3(){
        System.out.println("A m3 no-param");
    }
    int m3(String s){
        System.out.println("A m3 String-param");
        return 50;
    }
}
class B1 extends A1{
    static void m1(){
        System.out.println("B m1");
    }
    void m2(){
        System.out.println("B m2");
    }
    void m3(float f1,int i){
        System.out.println("B m3 float,int param");
    }
}
class Test1{
    public static void main(String[] args) {
       B1 b=new B1();                    A1 a=new B1();
       b.m1();                           a.m1();
       b.m2();                           a.m2();
       b.m3();                           a.m3();
       b.m3("abc");                   a.m3("abc");
       //  b.m3(45.2,67);                 //  a.m3(45.2f,67);
        b.m3(45.2f,67);

    }
}