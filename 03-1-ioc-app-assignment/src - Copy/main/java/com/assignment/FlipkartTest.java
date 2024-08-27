package com.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FlipkartTest {

	public static void main(String[] args) {
		//strting container
		ApplicationContext context = new ClassPathXmlApplicationContext("flipkart.xml");
		//get Bean 
		 FlipkartService fs =  context.getBean(FlipkartService.class);
		System.out.println(fs.hashCode());
		fs.processPayment(120.00);
		
	}
}