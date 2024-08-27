package com.webclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webclient.binding.Product;
import com.webclient.service.ProductService;

import reactor.core.publisher.Mono;

@RestController
public class ProductRestController {

	@Autowired
	private ProductService service;

	@GetMapping("/product")
	public ResponseEntity<Mono<String>> getProduct() {

		Mono<String> productData = service.getProduct();
		return new ResponseEntity<>(productData, HttpStatus.OK);
	}

	@GetMapping("/")
	public ResponseEntity<Mono<Product>> getProductNew() {

		Mono<Product> productData = service.getProductNew();
		return new ResponseEntity<>(productData, HttpStatus.OK);
	}

}
