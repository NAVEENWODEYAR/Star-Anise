package com.bhas.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhas.dto.FlightBookingAcknowledgment;
import com.bhas.dto.FlightBookingRequest;
import com.bhas.entity.Passenger;
import com.bhas.entity.PaymentInfo;
import com.bhas.repo.PassengerRepo;
import com.bhas.repo.PaymentInfoRepo;
import com.bhas.util.PaymentUtils;

@Service
public class FlightBookingService 
{

	// DI,
	@Autowired
	private PassengerRepo passengerRepo;
	
	@Autowired
	private PaymentInfoRepo paymentInfoRepo;
	
	// to book the ticket,
	public FlightBookingAcknowledgment bookFlightTicket(FlightBookingRequest request)
	{
		Passenger passenger = request.getPassenger();
					passenger = passengerRepo.save(passenger);
					
		PaymentInfo paymentInfo = request.getPaymentInfo();
		
		
		// validating the funds,
		PaymentUtils.validateCreditLimit(paymentInfo.getAccountNu(),passenger.getFare());
		
		paymentInfo.setPassengerId(passenger.getPId());
		paymentInfo.setAmount(passenger.getFare());
					paymentInfoRepo.save(paymentInfo);		
					
					return new FlightBookingAcknowledgment("SUCCESS", passenger.getFare(), UUID.randomUUID().toString().split("-")[0],passenger);
//					return new FlightBookingAcknowledgment(null, 0, null, passenger);
					
	}
}
