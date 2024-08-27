package com.ipayment;

public class DebitCardPayment implements Ipayment {

	public DebitCardPayment() {
		System.out.println("DebitCardpayment  :: constructor");
	}

	@Override
	public boolean payBill(double amt) {
		// TODO Auto-generated method stub
		System.out.println("DebitCardPayment processing ......");
		return true;
	}

}
