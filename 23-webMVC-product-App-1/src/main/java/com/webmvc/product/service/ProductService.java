package com.webmvc.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.webmvc.product.entity.Product;

@Service
public interface ProductService {

	public abstract boolean saveProducts(Product p);
	
	public List<Product> getAllproducts();
}
