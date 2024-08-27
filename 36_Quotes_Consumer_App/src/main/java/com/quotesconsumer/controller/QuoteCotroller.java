package com.quotesconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.quotesconsumer.response.Product;
import com.quotesconsumer.services.QuoteService;

@Controller
public class QuoteCotroller {

	@Autowired
	private QuoteService quoteService;

	@GetMapping("/product")
	public String getProduct(@RequestParam("pid") String pid, Model model) {

		Product product = quoteService.getProduct(pid);
		model.addAttribute("p", product);
		return "index";
	}

	@GetMapping("/")
	public String index(@ModelAttribute("p") Product p, Model model) {
		return "index";
	}

}
