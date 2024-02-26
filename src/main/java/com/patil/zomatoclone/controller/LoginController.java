package com.patil.zomatoclone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@GetMapping("/")
	public String login() {
		return "welcome to the login screen";
	}
	
	@GetMapping("/home")
	public String home() {
		return "logged in to home page successfully";
	}
	
}
