package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Buyer;

public interface BuyerService {

	void saveBuyer(Buyer buyer);
	
	Buyer getBuyer(int id);
	
	List<Buyer> getAllBuyer(Buyer buyer);
	
	void deleteBuyer(int id);
	
	void deleteAllBuyer(Buyer buyer);
}
