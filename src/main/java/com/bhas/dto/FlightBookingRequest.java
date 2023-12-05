package com.bhas.dto;

import com.bhas.entity.Passenger;
import com.bhas.entity.PaymentInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest 
{
	private Passenger passenger;
	private PaymentInfo paymentInfo;
}
