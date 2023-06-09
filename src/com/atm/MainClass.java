package com.atm;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		AtmOperationInterf op = new AtmOperationImpl();
		int atmnumber = 12345;
		int atmpin = 123;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to ATM MAchine !!!");
		System.out.println("Enter Atm Number : ");
		int atmNumber = sc.nextInt();
		System.out.println("Enter Atm Pin : ");
		int pin = sc.nextInt();
		if((atmnumber==atmNumber)&&(atmpin==pin)) {
			while(true) {
				System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposite Amount\n4.View Ministatement\n5.Exit");
				System.out.println("Enter Choice : ");
				int ch = sc.nextInt();
				if(ch == 1) {
					op.viewBalance();
				}else if(ch == 2) {
					
					System.out.println("Enter amount to withdraw ");
					double withdrawAmount = sc.nextDouble();
					op.withdrawAmount(withdrawAmount);
					
				}else if(ch == 3) {
					
					System.out.println("Enter Amount to Deposite : ");
					double depositeAmount = sc.nextDouble();//5000
					op.depositeAmount(depositeAmount);
					
				}else if(ch == 4) {
					op.viewMiniStatement();
				}else if(ch == 5) {
					
					System.out.println("Collect your ATM Card\n Thank you for using ATM Machine");
					System.exit(0);
					
				}
				else {
					System.out.println("Please enter correct choice");
				}
			}
		}
		else {
			System.out.println("Incorrect Atm Number or pin");
			System.exit(0);
		}
	}

}
