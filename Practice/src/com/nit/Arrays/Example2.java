package com.nit.Arrays;

public class Example2 {
    int x=10;
    int y=20;
    static {
        System.out.println("Example is loaded");
    }
    Example2(){
        System.out.println("Example object is created");
    }
}
class Test2{
    static Example2[] e1=new Example2[5];
    Example2[] e2={new Example2(),new Example2()};

    public static void main(String[] args) {
        System.out.println("Test main");
        Example2[] e3=new Example2[2];
        System.out.println("e3 array object is Created");
        e1[1]=new Example2();
        e3[1]=new Example2();
        System.out.println(e1[1].x);
     //   System.out.println(e2[1].x); Error:(24, 28) java: non-static variable e2 cannot be referenced from a static context
        System.out.println(e3[1].x);
     //   System.out.println(e3[0].x); NullPointerException
        Test2 t=new Test2();
        System.out.println(t.e2[1].x);
        System.out.println();
     //   System.out.println(e1[0].x); NullPointerException
        System.out.println(t.e2[0].x);
     //   System.out.println(e3[0].x); NullPointerException
        System.out.println(t.e1[1].y);

    }
}