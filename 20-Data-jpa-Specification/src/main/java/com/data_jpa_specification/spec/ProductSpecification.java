package com.data_jpa_specification.spec;

import org.springframework.data.jpa.domain.Specification;

import com.data_jpa_specification.entity.Product;

public class ProductSpecification {

	public static Specification<Product> nameLike(String name) {
		return (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("name"), "%" + name + "%");
	}

	public static Specification<Product> priceLessThan(double price) {
		return (root, query, criteriaBuilder) -> criteriaBuilder.lessThanOrEqualTo(root.get("price"), price);
	}

	public static Specification<Product> priceGreaterThan(double price) {
		return (root, query, criteriaBuilder) -> criteriaBuilder.greaterThanOrEqualTo(root.get("price"), price);
	}

}