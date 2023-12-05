package com.bhas.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Passenger_Table")
public class Passenger 
{
	private Long pId;
	private String name;
	private String email;
	private String source;
	private String destination;
	private String pickupTime;
	private String arrivalTime;
	private Date travelDate;
	private double fare;
}
