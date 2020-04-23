package com.nit.Examples;

import java.util.Scanner;
public class BankAccount {
	 static String bankname;
	 static String branch;
	 static String ifsc;
	{
		System.out.print("Enter Bank Name : ");
		bankname=new Scanner(System.in).nextLine();
		System.out.print("Enter Branch : ");
		branch=new Scanner(System.in).nextLine();
		System.out.print("Enter IFSC : ");
		ifsc=new Scanner(System.in).nextLine();
	}
	long accno;
	String accHname;
	double balance;
  /*  static void setBankname(String bankname) {
    	 BankAccount.bankname=bankname;
	}
    static  String getBankname(String bankname) {
    	 return bankname;
     }
    static void setBranch(String branch) {
    	 BankAccount.branch=branch;
     }
    static String getBranch(String branch) {
    	 return branch;
     }
    static void setIfsc(String ifsc) {
    	 BankAccount.ifsc=ifsc;
     }
    static String getIfsc(String ifsc) {
    	 return ifsc;
     }
	*/@SuppressWarnings("static-access")
	BankAccount(String bankname,String branch,String ifsc){
		BankAccount.bankname=bankname;
		BankAccount.branch=branch;
		this.ifsc=ifsc;
	}
		void setDeposite(double amt) {
	
		this.balance=this.balance+amt;	
	}
	double getDeposite(double amt) {
		return amt;
	}
     void setWithdraw(double amt) {
    	 this.balance=this.balance-amt;
     }
     double getWithdraw(double amt) {
    	 return amt;
     }
     void currentBalance() {
    	 System.out.println("Current Balance is "+balance);
     }
     String tostring() {
    	 return "Bank Name : "+bankname+
    			 "Branch   : "+branch+
    			 "ifsc     : "+ifsc+
    			 "Acc Num  : "+accno+
    			 "Acc holder Name : "+accHname+
    			 "Balance  : "+balance;
     }
     
}
