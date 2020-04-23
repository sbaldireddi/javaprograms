package com.nit.Inheritance;

class Student1 extends Person1 {
    private int sno;
    private String course;
    private double fee;

    public void setSno(int sno) {
        this.sno = sno;
    }

    public int getSno() {
        return sno;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }
    void listen() {
        System.out.println(getName()+" listening "+course);
    }
    void read(){
        System.out.println(getName()+" reading "+course);
    }
    void write(){
        System.out.println(getName()+" writing "+course);
    }
    void display(){
        System.out.println("\neyes\t: "+getEyes());
        System.out.println("eays\t: "+getEars());
        System.out.println("Hands\t: "+getHands());
        System.out.println("Legs\t: "+getLegs());
        System.out.println("Name\t:"+getName());
        System.out.println("Height\t:"+getHeight());
        System.out.println("Weight\t:"+getWeight());
        System.out.println();
        System.out.println("Sno\t\t: "+sno);
        System.out.println("course\t: "+course);
        System.out.println("Fee\t\t: "+fee);
    }
}
