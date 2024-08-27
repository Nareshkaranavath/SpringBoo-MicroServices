package com.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.service.Empservice;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		Empservice service = context.getBean(Empservice.class);
		// service.saveEmployee();
		// service.SaveEmps();
		// service.getEmp(4);

		// service.getEmpls(Arrays.asList(1, 2, 4, 8, 9));
		// service.getEmployes();
		// service.findByEsalaryGreaterThanEqual(2000.00);
		service.CallCustomQuries();

	}

}
