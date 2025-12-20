package com.example.demo.service;

public class NetBankingServiceImpl implements PaymentService {

	@Override
	public String processPayment(double amount) {
		// TODO Auto-generated method stub
		
		System.out.println("NetBanking Payment is Processed Successfully ");
		
		return "NetBanking Payment of :" +amount + "Processed Successfully";
	}

}