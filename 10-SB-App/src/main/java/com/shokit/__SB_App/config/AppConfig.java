package com.shokit.__SB_App.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.shokit.__SB_App.utils.SecurityApp;

@Configuration
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig :: Consructor");
	}
	@Bean
	public SecurityApp security() {
		SecurityApp sa = new SecurityApp();
		// logic
		return sa;
	}

}
