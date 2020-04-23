package com.nit.Arrays;

class Employee {
    private int eno;
    private String ename;
    private double sal;
    private String dept;
    Employee(int eno, String ename, double sal, String dept) {
        this.eno=eno;
        this.ename=ename;
        this.sal=sal;
        this.dept=dept;
    }
    void setDept(String dept) {
        this.dept=dept;
    }
    String getDept() {
        return dept;
    }
    void display() {
        System.out.println("eno\t :"+eno);
        System.out.println("ename\t :"+ename);
        System.out.println("sal\t :"+sal);
        System.out.println("dept\t :"+dept);

    }

}
