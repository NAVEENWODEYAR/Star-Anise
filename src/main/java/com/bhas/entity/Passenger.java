package com.bhas.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Passenger_Info")
public class Passenger 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pId;
	private String name;
	private String email;
	private String source;
	private String destination;
	private String pickupTime;
	private String arrivalTime;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-mm-yy")
	private Date travelDate;
	private double fare;
}
