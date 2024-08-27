package com.data_jpa_specification.repo;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data_jpa_specification.entity.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

	public List<Product> findAll(Specification<Product>spec);
}
