package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class Welcome {//http://localhost:8080/welcome/hi
	@RequestMapping("/hello")
	public String hi() {
		return "Hello Evening";
		
		
	}
	@RequestMapping("/hi")
	public String hello() {
		return "Hello everyone!!!!!!!!!";
		
		
	}

}
