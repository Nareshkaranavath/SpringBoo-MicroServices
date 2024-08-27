package com.assignment;

public class DebitCardPayment implements IFlipkart {
	
  public DebitCardPayment() {
	  System.out.println("Debitcardpayment ....constructor");
  }

	@Override
	public boolean IFlipkartpayment(double amt) {
		// TODO Auto-generated method stub
		System.out.println("Debitcardpaymint processing.....");
		return true;
	}

}
