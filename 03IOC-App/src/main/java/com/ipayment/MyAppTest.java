package com.ipayment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppTest {
	public static void main(String[] args) {
		// starting ioc container
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		// cont = new
		RestaurantService  rs = context.getBean(RestaurantService .class);
		
		System.out.println(rs.hashCode());
		rs.processPayment(1200.00);
	}
}
