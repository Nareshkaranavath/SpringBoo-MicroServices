package com.consumerKafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import com.consumerKafka.Constants.AppConstants;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
@KafkaListener(topics = AppConstants.ORDER_TOPIC, groupId = "nareshit_order_group")
	public void getMSg(String order) {
		System.out.println("***MSg Recieved From Kafka Topic  ****");
		System.out.println(order);
	}
}
