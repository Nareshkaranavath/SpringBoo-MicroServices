package com.webmvc.queryparams.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	@GetMapping("/welcome")
	@ResponseBody
	public String welcomeMethod(@RequestParam("name") String name ) {
		return name +", Welcome to Ashokit";
	}
	
	@GetMapping("/greet/{name}")
	public String getGreet(@PathVariable("name") String name, Model model) {
		model.addAttribute("msg", name+", Good morning....");

		return "index";
	}
}
