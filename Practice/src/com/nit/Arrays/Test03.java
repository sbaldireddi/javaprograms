package com.nit.Arrays;

public class Test03 {
    public static void main(String[] args, Object dept) {
        Employee[] emps= {new Employee(101,"HK",1000,"CoreJava"),
                new Employee(102,"BK",1000,"HTML"),
                new Employee(103,"SK",1000,"CoreJava"),
                new Employee(104,"PK",1000,"AdvJava"),
                new Employee(105,"RS",1000,".NET"),
                new Employee(106,"Ak",1000,"Android")};
        for(Employee e:emps) {
            e.display();
        }
        for(Employee e:emps) {
            if((e.getDept().toUpperCase().contains("JAVA")
                    ||e.getDept().toUpperCase().contains("HTML"))
                    &&(!e.getDept().equalsIgnoreCase("HK"))) {
                e.setDept("Python");
            }
        }
        for(Employee e:emps) {
            e.display();
        }
    }

}
