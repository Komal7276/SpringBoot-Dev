package com.example.demo.service;

public class CreditCardPaymentServiceImpl  implements PaymentService{

	@Override
	public String paymentProcess(double amount) {
		// TODO Auto-generated method stub
		return "Credit card payment of :" + amount + " Processed Successful";
	}

	

}