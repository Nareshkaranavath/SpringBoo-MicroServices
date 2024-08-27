package com.webmvc.exception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgController {

	@GetMapping("/greet")
	public String getGreet(Model model) {

		model.addAttribute("msg", "Welcome to AshokIT....");
		return "index";
	}

	@GetMapping("/welcome")
	public String getModel(Model model) {

		int a = 10 / 0;
		model.addAttribute("msg", "Welcome to TechStar....");

		return "index";
	}

}
