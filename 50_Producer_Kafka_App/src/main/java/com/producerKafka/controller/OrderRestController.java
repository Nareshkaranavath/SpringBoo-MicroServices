package com.producerKafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.producerKafka.binding.Order;
import com.producerKafka.service.OrderService;

@RestController
public class OrderRestController {

	@Autowired
	private OrderService orderService;

	@PostMapping("/order")
	public String placeOrder(@RequestBody Order order) {

		return orderService.createOrder(order);

	}
}
