package com.webmvcform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.webmvcform.binding.Book;

@Controller
public class BookController {

	@GetMapping("/book")
	public ModelAndView loadform() {

		ModelAndView mav = new ModelAndView();
		mav.addObject("bookObj", new Book());
		mav.setViewName("bookView");

		return mav;
	}

	@PostMapping("/book")
	public ModelAndView handlebooksubmit(Book book) {
		System.out.println(book);

		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Book saved sucessfully");
		mav.setViewName("success");

		return mav;
	}
}
