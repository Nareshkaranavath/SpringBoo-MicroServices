package com.webmvc.validations.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.webmvc.validations.entity.User;

import jakarta.validation.Valid;

@Controller
public class UserController {
	@GetMapping("/")
	public String loadForm(Model model) {
		model.addAttribute("user", new User());

		return "index";
	}

	@PostMapping("/user")
	public String handleSubmit(@Valid User user, BindingResult result, Model model) {
		System.out.println(model);
		if (result.hasErrors()) {
			return "index";
		} else {
			System.out.println(user);
		}
		model.addAttribute("msg", "User saved");
		return "index";
	}
}
