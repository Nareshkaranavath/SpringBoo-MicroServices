package com.webmvc.exception.adviceexception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.webmvc.exception.ProductNotFoundException;

@ControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(value = Exception.class)
	public String exceptionHandler(ArithmeticException ae) {

		return "exView";
	}

	@ExceptionHandler(value = ProductNotFoundException.class)
	public String handleProductEx(ProductNotFoundException pne) {
		// logic
		return "exView";
	}

}
