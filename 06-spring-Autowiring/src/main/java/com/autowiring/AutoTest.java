package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoTest {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("auto.xml");

		ATM atm = context.getBean(ATM.class);
		atm.withdraw();
	}
}
