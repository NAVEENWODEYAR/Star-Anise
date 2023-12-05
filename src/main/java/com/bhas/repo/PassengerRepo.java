package com.bhas.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhas.entity.Passenger;

public interface PassengerRepo extends JpaRepository<Passenger, Long> 
{

}
