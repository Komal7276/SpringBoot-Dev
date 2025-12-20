package com.example.demo.service;

public class UPIPaymentServiceImpl implements PaymentService {

	@Override
	public String processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("UPI Payment is Successfully Processed");
		
		return "UPI Payment of : "+amount + "Processed Successfully";
	}

}