package com.rest_api.binding.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest_api.binding.Customer;

@RestController
public class CustomerController {

	@GetMapping(value = "/customer", produces = "application/json")
	public ResponseEntity<Customer> getCustomer() {
		Customer c = new Customer(1, "john", "johanmehar@gmail.com");
		return new ResponseEntity<>(c, HttpStatus.OK);
	}

	@PostMapping(value="/customer", consumes = "application/json")
	public ResponseEntity<String> createCustomer(@RequestBody Customer c) {

		System.out.println(c);
		// insert into db
		return new ResponseEntity<>("Product Saved", HttpStatus.CREATED);
	}

	@PutMapping(value="/customer",produces = "application/json", consumes = "atext/plain")
	public ResponseEntity<String> updateCustomer(@RequestBody Customer c) {
		// todo logic
		return new ResponseEntity<>("Product updated", HttpStatus.OK);
	}

	@DeleteMapping("/customer/{cid}")
	public ResponseEntity<String> deleteCustomer(@PathVariable("cid") Integer cid) {

		System.out.println(cid);
		// insert into db
		return new ResponseEntity<>("Product Deleted", HttpStatus.OK);
	}

	@GetMapping(value = "/list", produces = "application/json")
	public ResponseEntity<List<Customer>> getCustomers() {
		Customer c = new Customer(1, "John", "johanmehar@gmail.com");
		Customer c1 = new Customer(2, "Smith", "smith@gmail.com");
		Customer c2 = new Customer(3, "David", "david@gmail.com");
		List<Customer> list = Arrays.asList(c, c1, c2);
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
}
