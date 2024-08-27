package com.autowiring;

public class HpPrinter implements IPrinter {

	public HpPrinter() {

		// TODO Auto-generated constructor stub
		System.out.println("HpPrinter :: constructor");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("HpPrinter print () started...");
	}
}
