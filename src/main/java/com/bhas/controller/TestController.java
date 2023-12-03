package com.bhas.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
	@GetMapping("/test")
	@ResponseStatus(code = HttpStatus.CONTINUE)
	public String greetMsg()
	{
		System.out.println("*********");
		return "Hello Welcome to Bhaskara Application,";
	}
	
	@GetMapping("/today")
//	@RequestMapping(name = "today",method = RequestMethod.GET)
	public ResponseEntity<LocalDateTime> getDate()
	{
		return new ResponseEntity<>(LocalDateTime.now(), HttpStatus.OK);
	}
}
