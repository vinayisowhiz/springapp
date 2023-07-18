package com.example.springapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringappApplicationController {

	@GetMapping("/")
	public String index() {
		return "Welcome to Spring Boot Application !";
	}
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello, World!";
	}

}
