package com.bhas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
	@GetMapping
	public String greetMsg()
	{
		System.out.println("\n*********");
		return "Hello Welcome to Bhaskara Application,";
	}
}
