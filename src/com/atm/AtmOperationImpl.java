package com.atm;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterf{

	ATM atm = new ATM();
	Map<Double,String> ministmt = new HashMap<>();
	@Override
	public void viewBalance() {
		System.out.println("Available Balance is : "+atm.getBalance());
	}
	
	@Override
	public void withdrawAmount(double withdrawAmount) {
//		System.out.println(" Collect the Cash "+withdrawAmount);
//		atm.setBalance(atm.getBalance()-withdrawAmount);
//		viewBalance();
		if(withdrawAmount%500==0) {
		if(withdrawAmount<=atm.getBalance()) {
			ministmt.put(withdrawAmount, " Amount Withdrawn");
			System.out.println("Collect the Cash "+withdrawAmount);
			atm.setBalance(atm.getBalance()-withdrawAmount);
			viewBalance();
		}else {
			System.out.println("Insufficient Balance !!!");
		}
		}
		else {
			System.out.println("Please enter the amount of multiple of 500 ");
		}
	}
	
	@Override
	public void depositeAmount(double depositeAmount) {
		ministmt.put(depositeAmount, " Amount Deposited");
		System.out.println(depositeAmount+ " Deposited Successfully !!");
		atm.setBalance(atm.getBalance()+depositeAmount);
		viewBalance();
		
	}
	
	@Override
	public void viewMiniStatement() {
		for(Map.Entry<Double,String> m:ministmt.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
	}
	
}
