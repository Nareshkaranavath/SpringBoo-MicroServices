package com.webmvcform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.webmvcform.binding.User;

@Controller
public class UserController {

	@GetMapping("/user")
	public ModelAndView loadform() {

		ModelAndView mav = new ModelAndView();
		mav.addObject("userObj", new User());
		mav.setViewName("index");

		return mav;
	}

	@PostMapping("/user")
	public ModelAndView handleUserFormsubmit(User user) {
		System.out.println(user);
		ModelAndView mav = new ModelAndView();

		mav.addObject("msg", "User Details Saved");
		mav.setViewName("success");

		return mav;
	}
}
