package com.datajpaRepo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.datajpaRepo.service.EmpService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		EmpService empserv = context.getBean(EmpService.class);
		//empserv.getAllEmpsSort();
		//empserv.getAllEmpsPagnation();
		empserv.getRecordsWithFilter();

	}

}
