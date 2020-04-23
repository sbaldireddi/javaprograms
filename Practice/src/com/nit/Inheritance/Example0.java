package com.nit.Inheritance;

class Example0 {
    static int a=m1();
    static {
        System.out.println("Example SB");
    }
    int x=m2();
    {
        System.out.println("Example NSB\t\t\t\t\t"+this);
    }
    Example0(){
        System.out.println("Example Constructor\t\t\t"+this);
    }
    static int m1(){
        System.out.println("Example SV is created");
        return 10;
    }
    private int m2(){
        System.out.println("Example NSV is created\t\t"+this);
        return 20;
    }
    void abc(){
        System.out.println("Example abc\t\t\t\t"+this);
    }
    void bbc(){
        System.out.println("Example bbc\t\t\t\t\t"+this);
    }
}
class Sample0 extends Example0{
    static int b=m3();
    static {
        System.out.println("Sample SB");
    }
    int y=m4();
    {
        System.out.println("Sample NSB \t\t\t\t\t"+this);
    }
    private Sample0(){
        System.out.println("Sample Constructor\t\t\t"+this);
    }
    private static int m3(){
        System.out.println("Sample SV is created");
        return 30;
    }
    private int m4(){
        System.out.println("Sample NSV is created\t\t"+this);
        return 40;
    }
    void abc(){
        System.out.println("Sample abc\t\t\t\t\t"+this);
    }

    public static void main(String[] args) {
        System.out.println("Sample main");
        Sample0 s=new Sample0();
        Sample0 s1=new Sample0();
        s.abc();
        s1.bbc();
    }
}