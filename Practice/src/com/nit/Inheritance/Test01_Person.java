package com.nit.Inheritance;


import java.util.Scanner;

class Person {
  private   String name;
  private   double height;
  private   int weight;
 /*   public Person(String name,double height,int weight){

        this.name=name;
        this.height=height;
        this.weight=weight;
    }*/
  // Person p=new Person(name,height,weight);

    void setName(String name) {
        this.name = name;
    }

     String getName() {
        return name;
    }

    void setHeight(double height) {
        this.height = height;
    }

    double getHeight() {
        return height;
    }

     void setWeight(int weight) {
        this.weight = weight;
    }

     int getWeight() {
        return weight;
    }

    void eating() {
        System.out.println("Person is eating");
    }

    void learn() {
        System.out.println("person is learning");
    }
}
     class Student extends Person {
        private int sno;
        private int marks;
        private String course;
        private double fee;
    /*     Student(int no, String name, double height, int weight) {
             super(no, name, height, weight);

         }
*/
          void setSno(int sno) {
             this.sno = sno;
         }

          int getSno() {
             return sno;
         }

          void setMarks(int marks) {
             this.marks = marks;
         }

          int getMarks() {
             return marks;
         }

          void setCourse(String course) {
             this.course = course;
         }

          String getCourse() {
             return course;
         }

          void setFee(double fee) {
             this.fee = fee;
         }

          double getFee() {
             return fee;
         }

         void listen() {
             System.out.println("Student is listening");
         }

         void write() {
             System.out.println("Student is writing ");
         }
     }
        class College {
            public static void main(String[] args) {
                Scanner scn=new Scanner(System.in);
                System.out.print("Enter sno : ");
                int sno=scn.nextInt();scn.nextLine();
                System.out.print("Enter name : ");
                String name=scn.nextLine();
                System.out.print("Enter marks : ");
                int marks=scn.nextInt();scn.nextLine();
                System.out.print("Enter course : ");
                String course=scn.nextLine();
                System.out.print("Enter fee : ");
                double fee=scn.nextDouble();
                System.out.print("Enter height : ");
                double height=scn.nextDouble();
                System.out.print("Enter weight : ");
                int weight=scn.nextInt();
                Student s=new Student();
                s.setSno(sno);
                s.setName(name);
                s.setMarks(marks);
                s.setCourse(course);
                s.setFee(fee);
                s.setHeight(height);
                s.setWeight(weight);
                System.out.println("Student number : "+s.getSno());
                System.out.println("Student name   : "+s.getName());
                System.out.println("Student marks  : "+s.getMarks());
                System.out.println("Student course : "+s.getCourse());
                System.out.println("Student fee    : "+s.getFee());
                System.out.println("Student height : "+s.getHeight());
                System.out.println("Student weight : "+s.getWeight());
                System.out.println();
                s.write();
                s.learn();
                s.listen();
                s.eating();



            }
        }


