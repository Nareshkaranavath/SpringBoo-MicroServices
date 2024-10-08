package com.restapiexception.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.restapiexception.binding.Product;
import com.webmvc.exception.ProductNotFoundException;

@RestController
public class RestControllerException {

	//user define exception
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable("id")Integer id) throws Exception {
		if (id == 1) {
			Product p = new Product();
			p.setId(1);
			p.setName("Mouse");
			p.setPrice(500.50);
			return new ResponseEntity<>(p, HttpStatus.OK);
		} else {
			throw new ProductNotFoundException("Invalid Id");
		}
	}

}
