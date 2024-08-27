package com.restapiexception.info;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(value = ProductNotFoundException.class)
	public ResponseEntity<ExceptionInfo> handlePNFE(ProductNotFoundException pe) {

		ExceptionInfo info = new ExceptionInfo();
		info.setExCode("SBI0002");
		info.setExMsg(pe.getMessage());
		info.setExDate(LocalDate.now());

		return new ResponseEntity<>(info, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ExceptionInfo> handleException(Exception e) {
		ExceptionInfo info = new ExceptionInfo();
		info.setExCode("SBIOOO1");
		info.setExDate(LocalDate.now());
		info.setExMsg(e.getMessage());

		return new ResponseEntity<>(info, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
