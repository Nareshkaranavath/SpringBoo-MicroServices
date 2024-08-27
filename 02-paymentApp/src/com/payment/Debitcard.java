package com.payment;

public class Debitcard implements Ipayment{

	@Override
	public boolean payBill(double amt) {
		// TODO Auto-generated method stub
		System.out.println("Debit card payment processing ...");
		//logic 
		return true;
	}

}
