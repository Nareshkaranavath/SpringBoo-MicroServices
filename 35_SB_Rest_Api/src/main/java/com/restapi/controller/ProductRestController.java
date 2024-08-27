package com.restapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.binding.Product;

@RestController
public class ProductRestController {

	@GetMapping(value = "/product", produces = { "application/xml", "application/json" })
	public ResponseEntity<Product> getProduct() {
		Product p = new Product(101, "Monitor", 1000.0);

		return new ResponseEntity<>(p, HttpStatus.OK);
	}

	@PostMapping(value = "/product",
			consumes ={ "application/xml", "application/json" },
			produces = "text/plain")
	public ResponseEntity<String> addProduct(@RequestBody Product p) {
		System.out.println(p);
		// logic
		return new ResponseEntity<String>("productAdded", HttpStatus.CREATED);
	}
}
