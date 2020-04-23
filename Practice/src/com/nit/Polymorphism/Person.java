package com.nit.Polymorphism;

public class Person {
    void eat(){
        System.out.println("VEG");
    }

}
class Student extends Person{
    void eat(){
        super.eat();
        System.out.println("NVG");
        sleep();
    }
    void sleep(){
        System.out.println("Deep sleep");
    }
}
class Party{
    void eat(Person p){
        p.eat();
    }

    public static void main(String[] args) {
        Party party=new Party();
        Student student=new Student();
        party.eat(student);
    }
}