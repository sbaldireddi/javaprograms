package com.nit.Inheritance;

public class Ex {
    Ex() {
        System.out.println("Example zer-param");
    }
    Ex(int a){
        System.out.println("Example int-param");
    }
}
class Sa extends Ex{
    Sa(){
        System.out.println("Sample zero-param");
    }
    Sa(int a){
        super(50);
        System.out.println("Sample int-param");
    }

    public static void main(String[] args) {
        Sa s1=new Sa();
        Sa s2=new Sa(50);
    }
}