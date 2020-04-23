package com.nit.Exception;

public class Example02 {
    public static void main(String[] args) {
    m1();
}
    static int m1(){
        try {
            System.out.println("In outer try");
            try {
                System.out.println("In inner try");
            }
            catch (NullPointerException npe){
                System.out.println("In inner catch");
            }
            finally {
                System.out.println("In inner finally");
                return 10;
            }
       //     System.out.println("After inner try/catch/finally"); Unreadable stmt
        }
        catch (NullPointerException npe){
            System.out.println("In outer catch");
        }
        finally {
            System.out.println("In outer finally");
        }
        System.out.println("After outer try/catch/finally");
        return 30;
    }
}
