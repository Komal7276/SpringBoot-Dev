package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Buyer;
import com.example.demo.repository.BuyerRepository;
import com.example.demo.service.BuyerService;

@Service
public class BuyerServiceImpl implements BuyerService{

	@Autowired
	BuyerRepository buyerRepository;
	
	
	@Override
	public void saveBuyer(Buyer buyer) {
		// TODO Auto-generated method stub
		buyerRepository.save(buyer);
	}

	@Override
	public Buyer getBuyer(int id) {
		// TODO Auto-generated method stub
		return buyerRepository.findById(id).get();
	}

	@Override
	public List<Buyer> getAllBuyer(Buyer buyer) {
		// TODO Auto-generated method stub
		return buyerRepository.findAll();
	}

	@Override
	public void deleteBuyer(int id) {
		// TODO Auto-generated method stub
		buyerRepository.deleteById(id);
	}

	@Override
	public void deleteAllBuyer(Buyer buyer) {
		// TODO Auto-generated method stub
		buyerRepository.deleteAll();
	}

}
