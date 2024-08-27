package com.timeStamping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timeStamping.Repo.ProductRepo;
import com.timeStamping.entity.Product;

@Service
public class ProductService {
       @Autowired
	private ProductRepo productRepo;

	public void saveProduct() {

		Product p = new Product();
		
		p.setName("monitor");
		p.setPrice(6000.0);
		
		productRepo.save(p);
		System.out.println("productsave....");
	}
}
