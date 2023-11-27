package com.bhas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
	@GetMapping
	@ResponseStatus(code = HttpStatus.CONTINUE)
	public String greetMsg()
	{
		System.out.println("\n*********");
		return "Hello Welcome to Bhaskara Application,";
//		controller
	}
}
