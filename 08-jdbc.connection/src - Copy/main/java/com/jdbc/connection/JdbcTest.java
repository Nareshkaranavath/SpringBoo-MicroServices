package com.jdbc.connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdbc.connection.service.MyService;

public class JdbcTest {
	private MyService myService;

	public void setMyService(MyService myService) {
		this.myService = myService;
	}

	public void run() {
		myService.fetchData().forEach(System.out::println);
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		JdbcTest test = (JdbcTest) context.getBean("test");
		test.run();
	}
}
