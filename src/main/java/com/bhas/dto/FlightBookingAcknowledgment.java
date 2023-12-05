package com.bhas.dto;

import com.bhas.entity.Passenger;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingAcknowledgment 
{
	private String status;
	private double totalFare;
	private String pnrNo;
	private Passenger passenger;
}
