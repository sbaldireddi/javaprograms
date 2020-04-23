package com.nit.Examples;

public class AreasForAll {
    private double l;
    private double b;
    private double s;
    private double r;
    private double br;
    private double h;
    double pi=3.14;
    void setArea(double l,double b) {
        this.l=l;
        this.b=b;
    }
    double getArea(double l,double b) {
        return l*b;
    }
    void setArea1(double s) {
        this.s=s;
    }
    double getArea1(double s) {
        return s*s;
    }
    void setArea(double r) {
        this.r=r;
    }
    double getArea(double r) {
        return pi*r*r;
    }
    void setArea1(double br,double h) {
        this.br=br;
        this.h=h;
    }
    double getArea1(double br,double h) {
        return (br*h)/2;
    }
    void display() {
        System.out.println("Area of Rectanlge : "+getArea(l, b));
        System.out.println("Area of Circle   : "+getArea(r));
        System.out.println("Area of Square   : "+getArea1(s));
        System.out.println("Area of Triangle : "+getArea1(br, h));

    }

}
