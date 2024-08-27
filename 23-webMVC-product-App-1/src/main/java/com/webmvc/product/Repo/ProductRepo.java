package com.webmvc.product.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webmvc.product.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
