package com.webmvc.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webmvc.product.Repo.ProductRepo;
import com.webmvc.product.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepo productRepo;

	@Override
	public boolean saveProducts(Product p) {
		// TODO Auto-generated method stub
		Product savedProduct = productRepo.save(p);
		return savedProduct.getPid() != null;
	}

	@Override
	public List<Product> getAllproducts() {
		// TODO Auto-generated method stub
		List<Product> findAll = productRepo.findAll();
		return findAll;
	}

}
