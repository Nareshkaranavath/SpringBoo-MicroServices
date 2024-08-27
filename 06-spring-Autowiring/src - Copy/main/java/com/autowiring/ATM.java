package com.autowiring;

public class ATM {

	private IPrinter printer;

	public ATM() {
		System.out.println("ATM :: constructor");
	}

	public void setPrinter(IPrinter printer) {
		System.out.println("setPrinter -method called");
		this.printer = printer;

	}

	public ATM(IPrinter printer) {
		System.out.println("ATM printer ::paramConstructor..");
		this.printer = printer;
	}

	public void withdraw() {
		System.out.println(" process completed...");
		printer.print();
	}
}
