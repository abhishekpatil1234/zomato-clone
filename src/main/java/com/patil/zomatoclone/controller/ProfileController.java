package com.patil.zomatoclone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patil.zomatoclone.model.Profile;

@RestController
public class ProfileController {
	@GetMapping("/profile")
	public Profile getProfile() {
		return new Profile(1, "abhishek", "123456789", "abhishek@gmail.com", "hyderabad");
	}
}
