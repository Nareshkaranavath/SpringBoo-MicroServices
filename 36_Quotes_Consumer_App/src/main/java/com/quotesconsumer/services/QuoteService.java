package com.quotesconsumer.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.quotesconsumer.response.Product;

@Service
public class QuoteService {

	public void getProduct() {
		String apiUrl = "https://api.restful-api.dev/objects";

		RestTemplate rt = new RestTemplate();
		ResponseEntity<Product[]> resEntity = rt.getForEntity(apiUrl, Product[].class);

		int StatusCode = resEntity.getStatusCode().value();

		if (StatusCode == 200) {
			Product[] products = resEntity.getBody();

			for (Product p : products) {
				System.out.println(p);
			}
		}
	}

	public Product getProduct(String productId) {
		String apiUrl = "https://api.restful-api.dev/objects/" + productId;

		RestTemplate rt = new RestTemplate();
		ResponseEntity<Product> restEntity = rt.getForEntity(apiUrl, Product.class);

		int Status = restEntity.getStatusCode().value();

		if (Status == 200) {
			return restEntity.getBody();
		}
		return null;
	}
}
