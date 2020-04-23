package com.nit.Arrays;

public class Test04 {
    public static void main(String[] agrrs){
        BankAccount[][] baa1=new BankAccount[3][2];
        baa1[0][0]= new BankAccount(101,1000);
        baa1[0][1]= new BankAccount(102,1000);
        baa1[1][0]= new BankAccount(103,1000);
        baa1[1][1]= new BankAccount(104,1000);
        baa1[2][0]= new BankAccount(105,1000);
        baa1[2][1]= new BankAccount(106,1000);
        for (int i=0;i<baa1.length;i++){
            for (int j=0;j<baa1[i].length;j++){
                baa1[i][j].display();
            }
        }

    }
}
