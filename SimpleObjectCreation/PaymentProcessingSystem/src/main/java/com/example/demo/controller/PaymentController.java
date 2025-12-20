package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CreditCardPaymentServiceImpl;
import com.example.demo.service.NetBankingPaymentServiceImpl;
import com.example.demo.service.PaymentService;
import com.example.demo.service.UPIPaymentServiceImpl;

@RestController
public class PaymentController {

	@GetMapping("/pay/{amount}/{mode}")
	public String makePayment(@PathVariable String mode ,@PathVariable double amount)
	{
		
		PaymentService PS = null;
		
		if(mode.equals("card"))
		{
			PS = new CreditCardPaymentServiceImpl();
		}
		
		if( mode.equals("upi"))
		{
			PS = new UPIPaymentServiceImpl();
		}
		 
		if( mode.equals("net"))
		{
			PS = new NetBankingPaymentServiceImpl();
		}
		
		return PS.paymentProcess(amount);
		
	}
	
	
}