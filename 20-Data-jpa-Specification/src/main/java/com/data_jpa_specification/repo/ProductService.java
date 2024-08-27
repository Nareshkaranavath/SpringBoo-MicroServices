package com.data_jpa_specification.repo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.data_jpa_specification.entity.Product;
import com.data_jpa_specification.spec.ProductSpecification;

@Service
public class ProductService {
	@Autowired
	private ProductRepo pRepo;
	private Example<Product> of;

//specification Query
	public void getProductsSpec(String name, Double minPrice, Double maxPrice) {

		Specification<Product> spec = Specification.where(null);

		if (name != null) {
			spec = spec.and(ProductSpecification.nameLike(name));
		}

		if (minPrice != null) {
			spec = spec.and(ProductSpecification.priceGreaterThan(minPrice));
		}
		if (maxPrice != null) {
			spec = spec.and(ProductSpecification.priceLessThan(maxPrice));
		}
		List<Product> findAll = pRepo.findAll(spec);
		findAll.forEach(System.out::println);

	}

	public void saveProduct() {
		Product p = new Product();
		p.setName("Samsung");
		p.setPrice(20000);
		p.setCategeory("Mobiles");

		Product p1 = new Product();
		p1.setName("Apple");
		p1.setPrice(80000);
		p1.setCategeory("Mobiles");

		Product p2 = new Product();
		p2.setName("Redmi");
		p2.setPrice(60000);
		p2.setCategeory("Mobiles");

		pRepo.saveAll(Arrays.asList(p1, p2, p));

	}

	public void getProduct() {
		Product pp = new Product();
		Example<Product> of = Example.of(pp);
		List<Product> findAll = pRepo.findAll(of);
		findAll.forEach(System.out::println);

	}

}
