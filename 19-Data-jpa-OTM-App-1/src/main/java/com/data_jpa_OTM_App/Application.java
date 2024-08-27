package com.data_jpa_OTM_App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.data_jpa_OTM_App.service.EmpService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext bean = SpringApplication.run(Application.class, args);

		EmpService bean2 = bean.getBean(EmpService.class);
		// bean2.saveEmp();
		// bean2.getEmp();
		// bean2.getAddress();
		bean2.DeleteEmp();
	}

}
