package com.producerKafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.producerKafka.binding.Order;
import com.producerKafka.constants.AppContstants;

@Service
public class OrderService {
	@Autowired
	private KafkaTemplate<String,Object> kafkaTemplate;

	public String createOrder(Order order) {
		kafkaTemplate.send(AppContstants.ORDER_TOPIC, order);
		return "Order created in kafa Topic";
	}
}
