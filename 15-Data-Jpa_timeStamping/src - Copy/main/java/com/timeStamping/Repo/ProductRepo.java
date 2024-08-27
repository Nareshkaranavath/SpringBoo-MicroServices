package com.timeStamping.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timeStamping.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
