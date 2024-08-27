package com.clientserver.circuit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class RestControllerBreaker {

	@GetMapping("/data")
	@CircuitBreaker(fallbackMethod = "getDataFromDB", name = "Naresh")
	public String getDataFromRedies() {
		System.out.println("****Redies() -method executed....");
		// logic to connect redies
		int i =10/0;
		return "data fetch from redis server";
	}

	public String getDataFromDB(Throwable t) {
		System.out.println("****BD() -method executed....");
		// logic to connect db
		return "data fetch from db server";
	}
}
