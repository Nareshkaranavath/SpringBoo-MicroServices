package com.assignment;

public class FlipkartService {

	private IFlipkart payment;

	public FlipkartService() {
		System.out.println("FlipkartService ::0param  constructor");
	}

	public FlipkartService(IFlipkart paymnet) {
		System.out.println("FlipkartService ::param  constructor");
	}

	public void setPayment(IFlipkart payment) {
		System.out.println("setter method called .....");
		this.payment = payment;
	}

	public void processPayment(double amt) {
		boolean status = payment.IFlipkartpayment(amt);
		if (status) {
			System.out.println("payment completed...");
		} else {
			System.out.println("payment decline....");
		}
	}
}
