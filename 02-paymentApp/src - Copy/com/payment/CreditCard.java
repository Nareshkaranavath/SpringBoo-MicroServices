package com.payment;

public class CreditCard implements Ipayment{

	@Override
	public boolean payBill(double amt) {
		// TODO Auto-generated method stub
		System.out.println("Credit card payment processing ....");
		//logic
		return true;
	}

}
