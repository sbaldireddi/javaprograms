package com.nit.Examples;

public class Student {
   private int sno;
   private String sname;
   private String course;
   private double fee;
   public Student(int sno, String sname, String course, double fee){
       this.sno=sno;
       this.sname=sname;
       this.course=course;
       this.fee=fee;
   }

       @Override
       public boolean equals(Object obj) {
       if (obj instanceof Student) {
           Student s = (Student) obj;
           return this.sno == s.sno;
          } else {
           return false;
       }


   }
}
