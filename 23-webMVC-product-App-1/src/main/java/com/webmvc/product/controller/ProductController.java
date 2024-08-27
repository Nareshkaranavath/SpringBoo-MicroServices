package com.webmvc.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.webmvc.product.entity.Product;
import com.webmvc.product.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	
	// load form GET
	@GetMapping("/")
	public ModelAndView loadform() {

		ModelAndView mav = new ModelAndView();
		mav.addObject("pobj", new Product());
		mav.setViewName("indext");
		return mav;
	}

	// save product data
	@PostMapping("/product")
	public ModelAndView saveProduct(Product pobj) {
		ModelAndView mav = new ModelAndView();
		boolean saveProduct = productService.saveProducts(pobj);

		if (saveProduct) {
			mav.addObject("smsg", "Products saved ");
		} else {
			mav.addObject("emsg", "products not saved...");
		}
		mav.addObject("pobj", new Product());//for binding form
		mav.setViewName("indext");
		return mav;
	}

	// get the saved data
	@GetMapping("/products")
	public ModelAndView viewProducts() {
		List<Product> allproducts = productService.getAllproducts();

		ModelAndView mav = new ModelAndView();
		mav.addObject("pList", allproducts);
		mav.setViewName("data");

		return mav;

	}
}
