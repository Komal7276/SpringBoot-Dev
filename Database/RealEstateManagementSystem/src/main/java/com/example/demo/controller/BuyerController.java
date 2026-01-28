package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constants.MessageConstants;
import com.example.demo.entity.Buyer;
import com.example.demo.service.BuyerService;

@RestController
@RequestMapping("buyer")
public class BuyerController {

	@Autowired
	BuyerService buyerService;

	@PostMapping("add")
	public String addBuyer(@RequestBody Buyer buyer)
	{
		buyerService.saveBuyer(buyer);
		return MessageConstants.BUYER_ADDED;
	}
	
	@GetMapping("get/{id}")
	Buyer getBuyer(@PathVariable int id)
	{
		return buyerService.getBuyer(id);
	}
	
	@GetMapping("getAll")
	List<Buyer> getAllBuyers(@RequestBody Buyer buyer)
	{
		return buyerService.getAllBuyer(buyer);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteBuyer(@PathVariable int id)
	{
		buyerService.deleteBuyer(id);
		return MessageConstants.BUYER_ADDED;
	}
	
	@DeleteMapping("deleteAll")
	public String deleteAllBuyers(@RequestBody Buyer buyer)
	{
		buyerService.deleteAllBuyer(buyer);
		return MessageConstants.ALL_BUYERS_DELETED;
	}

}
