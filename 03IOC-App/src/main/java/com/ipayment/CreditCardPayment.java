package com.ipayment;

public class CreditCardPayment implements Ipayment {

	public CreditCardPayment() {
		System.out.println("CreditcardPayment :: constructor");
	}

	@Override
	public boolean payBill(double amt) {
		// TODO Auto-generated method stub
		System.out.println("CreditCardPayment pricessing ......");
		return true;
	}

}
