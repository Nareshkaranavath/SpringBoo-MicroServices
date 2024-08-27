package com.webmvcform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.webmvcform.binding.ProductForm;


@Controller
public class ProductController {

	@GetMapping("/product")
	public ModelAndView loadProductForm() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("ProductFrom", new ProductForm());
		mav.setViewName("productView");

		return mav;
	}
	
	@PostMapping("/product")
	public ModelAndView handleUserFormsubmit(ProductForm productForm) {
		System.out.println(productForm);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "product Details Saved");
		mav.setViewName("success");

		return mav;
	}
}
