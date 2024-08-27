package com.data_jpa_OTO_App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.data_jpa_OTO_App.Service.PersonService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext bean = SpringApplication.run(Application.class, args);

		PersonService service = bean.getBean(PersonService.class);

		//service.savePerson();
		//service.getPerson();
		service.getPassPort();
	}

}
