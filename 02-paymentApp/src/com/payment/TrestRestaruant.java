package com.payment;

public class TrestRestaruant {

	public static void main(String[] args) {
		
		RestuarantService service1 =  new RestuarantService(new Debitcard());//ci
		//service1.payments = new Debitcard();//fi
		//service1.setPayment(new CreditCard());//si 
		service1.CollectBill(1345.00);
	}
}
