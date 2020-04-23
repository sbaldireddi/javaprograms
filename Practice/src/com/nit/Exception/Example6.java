package com.nit.Exception;

public class Example6 {
    public static void main(String[] args) {
       System.out.println(m1(5));
    }
    static int m1(int a){
        int i=0;
        while (i==5){
            try{
                try {
                    i=10;
                }
                finally {
                    i=20;
                }
                i=30;
                return i;
            }
            finally {
                if (i==30){
                    continue;
                }
            }
        }
        return 40;
    }
}
