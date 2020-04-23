package com.nit.Examples;

public class Employee {
    private int eno;
    private String ename;
    private String dept;
    private double salary;
    public Employee(int eno, String ename, String dept, double salary){
        this.eno=eno;
        this.ename=ename;
        this.dept=dept;
        this.salary=salary;
    }

    @Override
    public int hashCode() {
        System.out.println("hC is called");
        return ((dept==null)?0:dept.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("es is called");
        if(obj instanceof Employee){
            Employee  e=(Employee)obj;
            return (this.eno==e.eno)&&(this.dept.equals(e.dept));
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("ts is called");
        return "Employee("+eno+","+ename+","+dept+","+salary+")";
    }
}

