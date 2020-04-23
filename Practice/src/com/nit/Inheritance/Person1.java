package com.nit.Inheritance;

public class Person1 {
    private static final int eyes=2;
    private static final int ears=2;
    private static final int hands=2;
    private static final int legs=2;

    private String name;
    private double height;
    private int weight;

    public static int getEyes() {
        return eyes;
    }

    public static int getEars() {
        return ears;
    }

    public static int getHands() {
        return hands;
    }

    public static int getLegs() {
        return legs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
    void eat(){
        System.out.println(name+"  eating");
    }
    void sleep(){
        System.out.println(name+" sleeping");
    }
}
