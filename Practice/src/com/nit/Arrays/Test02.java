package com.nit.Arrays;

public class Test02 {
    public static void main(String[] args) {
        Student[] sa1=new Student[5];
        System.out.println(sa1[0]);
        System.out.println(sa1[1]);
        System.out.println(sa1[2]);
        System.out.println(sa1[3]);
        System.out.println(sa1[4]);
        System.out.println();
        sa1[0]=new Student();
        sa1[1]=new Student();
        System.out.println(sa1[0]);
        System.out.println(sa1[1]);
        System.out.println(sa1[2]);
        System.out.println(sa1[3]);
        System.out.println(sa1[4]);
        System.out.println();
        System.out.println(sa1[0].sno);
        System.out.println(sa1[0].sname);
        System.out.println(sa1[1].sno);
        System.out.println(sa1[1].sname);
        System.out.println();
        sa1[0].sno=101;
        sa1[0].sname="satish";
        sa1[1].sno=102;
        sa1[1].sname="satya";
        System.out.println(sa1[0].sno);
        System.out.println(sa1[0].sname);
        System.out.println(sa1[1].sno);
        System.out.println(sa1[1].sname);
        System.out.println();

        Student[] sa2= {new Student(),new Student(),null,null,null };
        System.out.println(sa2[0]);
        System.out.println(sa2[1]);
        System.out.println(sa2[2]);
        System.out.println(sa2[3]);
        System.out.println(sa2[4]);
        System.out.println();
        sa2[0].sno=104;
        sa2[0].sname="dfgyhk";
        sa2[1].sno=106;
        sa2[1].sname="wertyui";
        System.out.println(sa2[0].sno);
        System.out.println(sa2[0].sname);
        System.out.println(sa2[1].sno);
        System.out.println(sa2[1].sname);
        System.out.println();
        Student[] sa3=new Student[] {new Student(),new Student(),null,null,null };
        System.out.println(sa3[0]);
        System.out.println(sa3[1]);
        System.out.println(sa3[2]);
        System.out.println(sa3[3]);
        System.out.println(sa3[4]);
        System.out.println();
        sa3[0].sno=186;
        sa3[0].sname="kjhgf";
        sa3[1].sno=600;
        sa3[1].sname="oiuyrd";
        System.out.println(sa3[0].sno);
        System.out.println(sa3[0].sname);
        System.out.println(sa3[1].sno);
        System.out.println(sa2[1].sname);
        System.out.println();


    }

}
