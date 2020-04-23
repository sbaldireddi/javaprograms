package com.nit.Examples;

import java.util.*;
public class Bank {


	private static BankAccount[] bankaccounts;
	private static Scanner scn;

	public static void main(String[] args) {
		setBankaccounts(null);
	scn = new Scanner(System.in);
	int i=0;
	BankAccount[] accounts=new BankAccount[3];
	
	
	//String option11=scn.nextLine();
	
	/*acc.setBankname(bankname);
	acc.setBranch(branch);
	acc.setIfsc(ifsc);
*/
	do {
		i++;
		BankAccount acc=new BankAccount(null, null, null);
	//	bankaccounts[i-1]=acc;
	/*	System.out.println("choose one option");
		System.out.println("1.Open Account");
		System.out.println("2.print Account details");
		System.out.println("3.Deposite");
		System.out.println("4.Withdraw");
		System.out.println("5.Balance Quenry");
		System.out.println("6.Exit");*/
//		switch(option11) {
	//	case"1"://Open Account 
	
			System.out.println("Account"+i+"details");
			System.out.print("Enter accNum : ");
			scn.nextLine();
			System.out.print("Enter Acc Holder Name : ");
			scn.nextLine();
			System.out.print("Enter Balance : ");
			scn.nextDouble();scn.nextLine();
		//	break;
	//	case"2"://account details
			acc.tostring();
		//	break;
	 }while(equalsIgnoreCase("Y"));
			System.out.print("\n Do we want to continue(Y/N)? : ");
			for( i=1;i<=accounts.length;i++) {
		  System.out.println(accounts[i]);
	      }
	
	}

	private static boolean equalsIgnoreCase(String string) {
		// TODO Auto-generated method stub
		return true;
	}

	public static BankAccount[] getBankaccounts() {
		return bankaccounts;
	}

	public static void setBankaccounts(BankAccount[] bankaccounts) {
		Bank.bankaccounts = bankaccounts;
	}
}


	
