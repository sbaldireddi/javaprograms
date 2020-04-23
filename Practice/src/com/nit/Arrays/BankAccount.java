package com.nit.Arrays;

class BankAccount {
   private long accno;
   private double balance;
    BankAccount(long accno,double balance){
        this.accno=accno;
        this.balance=balance;
    }
     void display(){
        System.out.println(accno);
        System.out.println(balance);
    }
}
