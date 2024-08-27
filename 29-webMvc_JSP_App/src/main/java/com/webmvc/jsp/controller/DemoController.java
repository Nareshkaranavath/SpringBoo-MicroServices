package com.webmvc.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/")
	public String getGreet(Model model) {
		model.addAttribute("msg", "Good morning !!!!");

		return "index";
	}

}
