package com.profiles.conytoller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MSgController {
	@Value("${msgTxt}")
	private String msg;

	@GetMapping("/")
	@ResponseBody
	public String getMSg() {

		return msg;
	}
}
