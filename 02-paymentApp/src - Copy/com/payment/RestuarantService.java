package com.payment;

public class RestuarantService {
	Ipayment payment;

	public RestuarantService(Ipayment payment) {
		this.payment = payment;
	}

	public void setPayment(Ipayment payment) {
		this.payment = payment;
	}

	public void CollectBill(double amt) {
		boolean status = payment.payBill(amt);
		if (status) {
			System.out.println("payment sucess ......thankyou");
		} else {
			System.out.println("card decline....");
		}
	}
}
