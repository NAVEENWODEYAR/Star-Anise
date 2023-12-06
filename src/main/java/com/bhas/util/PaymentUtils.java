package com.bhas.util;

import java.util.HashMap;
import java.util.Map;

import com.bhas.exception.InSufficientAmountException;

public class PaymentUtils 
{
	private static Map<String, Double> paymentMap = new HashMap<>();
	
	static
	{
		paymentMap.put("ac1", 10000.00);
		paymentMap.put("ac2", 15000.00);
		paymentMap.put("ac3", 25000.00);
		paymentMap.put("ac4", 5000.00);
		paymentMap.put("ac5", 200000.00);
	}
	
	public static boolean validateCreditLimit(String accNo,double paidAmount)
	{
		if(paidAmount > paymentMap.get(accNo))
		{
			throw new InSufficientAmountException("Please check your account!,");
		}
		else
		{
			return true;
		}
	}
}
