package com.rps.employeemanagement.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/message")
	public String sayHello()		//http://localhost:8586/user/message
	{
		
		return "you are about sleep";
	}
}
