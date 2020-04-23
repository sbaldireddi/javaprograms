package com.nit.Inheritance;

public class Example01 {
    void m1(){
        System.out.println("m1");
    }
}
class Sample01 extends Example01{
    void m2(){
        System.out.println("m2");
    }
}
class Test01{
  /*   static void m3(Example01 e){
        e.m1();
        // e.m2();

        Sample01 s=(Sample01)e;
      //  s.m2(); java.lang.ClassCastException
    }
    public static void main(String[] args) {
      //  Example01 e=new Sample01();
        Test01.m3(new Sample01());
        Test01.m3(new Example01());
     //   e.m1();
     //   e.m2();
      //   Sample01 s=(Sample01)e;
      //  s.m2();
    }
*/
/* static void m3(Example01 e){
     e.m1();
     if(e instanceof Sample01){
         Sample01 s=(Sample01)e;
         s.m2();
     }
 }

    public static void main(String[] args) {
      //  Test01.m3(new Sample01());
        Test01.m3(new Example01());
    } */
  static void m3(Object obj){
      if(obj instanceof Example01){
          Example01 e=(Example01)obj;
          e.m1();
      }else if(obj instanceof Sample01){
          Sample01 s=(Sample01)obj;
          s.m1();
          s.m2();
      }
  }

    public static void main(String[] args) {
       Test01.m3(new Example01());
       Test01.m3(new Sample01());
       Test01.m3(new Object());

    }
}