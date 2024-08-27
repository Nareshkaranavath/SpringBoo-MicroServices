package com.webmvch2App.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {
		String msgText = "Good morning !!";
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", msgText);
		mav.setViewName("index");

		return mav;
	}
	@GetMapping("/greet")
	public String getGreetMsg(Model model) {
		model.addAttribute("msg", "Hi, Hello");
		return "index";
	}
}
