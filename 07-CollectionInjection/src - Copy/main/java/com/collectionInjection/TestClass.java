package com.collectionInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("collection.xml");

		Student st = context.getBean(Student.class);
		System.out.println(st);
		System.out.println(st.hashCode());
	}

}
