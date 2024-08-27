package com.data_jpa_specification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.data_jpa_specification.repo.ProductService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext bean = SpringApplication.run(Application.class, args);

		ProductService context = bean.getBean(ProductService.class);

		// context.saveProduct();
		// context.getProduct();
		//context.getProductsSpec("Sam", 3000.00, 80000.00);
		//context.getProductsSpec(null, 3000.00, 80000.00);
		context.getProductsSpec(null, null, null);
	}

}
