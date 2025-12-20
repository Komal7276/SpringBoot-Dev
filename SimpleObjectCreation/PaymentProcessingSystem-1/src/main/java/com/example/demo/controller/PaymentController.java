package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CreditCardPaymentServiceImpl;
import com.example.demo.service.NetBankingServiceImpl;
import com.example.demo.service.PaymentService;
import com.example.demo.service.UPIPaymentServiceImpl;

@RestController
@RequestMapping("/pay")
public class PaymentController {
	
	@GetMapping("/{amount}/{mode}")
	public String makePayment(@PathVariable String mode,@PathVariable double amount)
	{
		 PaymentService paymentService = null;
		 
		 if(mode == null)
		 {
			 throw new IllegalArgumentException("Payment Mode cannot be null");
		 }
		 
		 switch(mode.toLowerCase())
		 {
		 case "card":
			 paymentService = new CreditCardPaymentServiceImpl();
			 break;
			 
		 case "upi":
			 paymentService = new UPIPaymentServiceImpl();
			 break;
		 
		 case "net":
			 paymentService = new NetBankingServiceImpl();
			 break;
			 
		default:
			throw new IllegalArgumentException("Invalid Payment Mode: " +mode);
			 
		 }
		
		
		return paymentService.processPayment(amount);
	}
	 
}



/*
 * How Your API Works :
 * 
 * @GetMapping("/{mode}") public String makePayment(@PathVariable String
 * mode, @RequestParam double amount)
 * 
 * ✔ @PathVariable mode
 * 
 * This means the payment type is passed inside the URL path:
 * 
 * /pay/card
 * 
 * /pay/upi
 * 
 * /pay/net
 * 
 * ✔ @RequestParam amount
 * 
 * This means the amount should be passed as a query parameter:
 * ?amount=200
 * ?amount=500
 * 
 * ?amount=1000
 * 
 * URLs for Testing
 * 
 * Credit Card Payment http://localhost:8080/pay/card?amount=500
 * 
 * UPI Payment http://localhost:8080/pay/upi?amount=200
 * 
 * 
 * Net Banking Payment http://localhost:8080/pay/net?amount=1200
 * 
 * 
 * Internal Execution Flow
 * 
 * Example: /pay/upi?amount=500
 * 
 * 1️⃣ Controller reads the URL → mode = "upi"
 * 
 * 2️⃣ amount read from query param → amount = 500
 * 
 * 3️⃣ Switch checks "upi" → Creates UPIPaymentServiceImpl()
 * 
 * 4️⃣ Calls:
 * 
 * return paymentService.processPayment(500);
 * 
 * 
 */