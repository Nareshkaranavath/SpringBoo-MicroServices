package com.clientserver.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@Value("${msg}")
	private String msgTxt;

	@GetMapping("welcome")
	public String getWelcomeMsg() {

		return msgTxt;
	}

	public String getDatFromRedis() {
		// logic to fetch the data from Redies
		return null;
	}

	public String getDatFromDB() {
		// logic to fetch the data from DB
		return null;
	}
}
