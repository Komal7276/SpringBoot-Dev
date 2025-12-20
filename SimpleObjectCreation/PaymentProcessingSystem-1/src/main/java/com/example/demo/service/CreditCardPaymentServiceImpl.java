package com.example.demo.service;

public class CreditCardPaymentServiceImpl implements PaymentService {

	@Override
	public String processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Credit Card Payment of Processed Successfully");
		return "Credit Card Payment of : "+amount +  "Processed Successfully";
	}

}