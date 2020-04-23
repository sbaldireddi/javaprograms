package com.nit.Arrays;

public class Test1 {
    static int[] ia1=new int[5];
    int[] ia2={40,50,60,70};

    public static void main(String[] args) {
        int[] ia3=new int[3];
        System.out.println(ia1[1]);
      //  System.out.println(ia2[1]); Error:(10, 28) java: non-static variable ia2 cannot be referenced from a static context
        System.out.println(ia3[1]);

        Test1 t=new Test1();
        System.out.println(t.ia2[1]);

    }
}
