package com.rest_api.controller;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping(value = "/tech", produces = "text/plain")
	public ResponseEntity<String> getMsg() {
		String msg = "Welcome to TechStar.....";
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

	@GetMapping("/rest")
	public String getWelcomeMsg(@RequestParam("name") String name) {
		String msg = name + " Welcome to RestApi";
		return msg;
	}

	@GetMapping("/greet/{name}")
	public String getGreetMsg(@PathVariable("name") String name) {
		String msg = name + " Good Morning .....!!!";
		return msg;
	}

	@PostMapping("/date")
	public String getDate() {
		LocalDate date = LocalDate.now();
		return String.valueOf(date);
	}
}
