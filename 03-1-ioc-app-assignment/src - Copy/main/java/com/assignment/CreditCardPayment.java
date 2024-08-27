package com.assignment;

public class CreditCardPayment implements IFlipkart {

	public CreditCardPayment() {
		System.out.println("CreditCardPayment ::Constructor");
	}
	@Override
	public boolean IFlipkartpayment(double amt) {
		// TODO Auto-generated method stub
		System.out.println("Credicardpaymentprocessing .....");
		return true;
	}

}
