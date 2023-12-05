package com.bhas.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhas.entity.PaymentInfo;

public interface PaymentInfoRepo extends JpaRepository<PaymentInfo, String> 
{

}
