package com.autowiring;

public class SonyPrinter implements IPrinter {

	public SonyPrinter() {
		
		// TODO Auto-generated constructor stub
		System.out.println("Sonyprinter :: constructor");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Sony print () started...");
	}

}
