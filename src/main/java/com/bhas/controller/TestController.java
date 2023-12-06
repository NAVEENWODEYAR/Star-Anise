package com.bhas.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bhas.dto.FlightBookingAcknowledgment;
import com.bhas.dto.FlightBookingRequest;
import com.bhas.service.FlightBookingService;

@RestController
public class TestController
{
	@Autowired
	private FlightBookingService service;
	
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
	
	@PostMapping("/bookFlight")
	public FlightBookingAcknowledgment bookFlightTicket(@RequestBody FlightBookingRequest request)
	{
		return service.bookFlightTicket(request);
	}
}
