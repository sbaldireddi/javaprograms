package com.nit.Innerclass;

public class Example1 {
    int x=10;
    static class A{
        static void m1(){
            A a=new A();
        //    System.out.println(a.x); cannot find symbol
                         //            symbol:   variable x
        //                             location: variable a of type innerclass.Example1.A

            Example1 e=new Example1();
            System.out.println(e.x);
        }
    }
}
