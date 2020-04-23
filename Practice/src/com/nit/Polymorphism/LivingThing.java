package com.nit.Polymorphism;

public class LivingThing {
    void move(){
        System.out.println("something moving");
    }
}
class Person1 extends LivingThing{
    void move(){
        System.out.println("Person move by walking");
    }
}
class Animal extends LivingThing{
    void move(){
        System.out.println("Animal move by running");
    }
}
class Bird extends LivingThing{
    void move(){
        System.out.println("Bird move by flying");
    }
}
class Fish extends LivingThing{
    void move(){
        System.out.println("Fish move by swimming");
    }
}
class Fun{
    void turn(){
        System.out.println("Fun is turning");
    }
}
class Pound{
    void move(LivingThing lt){
       lt.move();

    }
    public static void main(String[] args) {
        Pound p=new Pound();
        Person1 person1 =new Person1();
        Animal animal=new Animal();
        Bird bird=new Bird();
        Fish fish=new Fish();
        p.move(person1);
        p.move(animal);
        p.move(bird);
        p.move(fish);
    }
}