package com.webmvc.exception;

public class ProductNotFoundException extends Exception {

	public ProductNotFoundException() {

	}

	public ProductNotFoundException(String msg) {
		super(msg);
	}
}
