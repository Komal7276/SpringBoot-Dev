package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.FoodOrderService;
import com.example.demo.serviceImpl.CloudKitchenOrderServiceImpl;
import com.example.demo.serviceImpl.HomeChefOrderServiceImpl;
import com.example.demo.serviceImpl.RestaurantOrderServiceImpl;

@RestController
public class FoodOrderController {

	
	private RestaurantOrderServiceImpl restoServiceImpl;
	private HomeChefOrderServiceImpl homeServiceImpl;
	private CloudKitchenOrderServiceImpl cloudServiceImpl;
	private FoodOrderService foodOrderService;

	
	
	//Setter Injection

	@Autowired
	public void setRestoOrderService(RestaurantOrderServiceImpl restoServiceImpl)
	{
		this.restoServiceImpl = restoServiceImpl;
	}
	
	
	@Autowired
	public void setHomeOrderService(HomeChefOrderServiceImpl homeServiceImpl)
	{
		this.homeServiceImpl = homeServiceImpl;
	}
	
	
	@Autowired
	public void setCloudOrderService(CloudKitchenOrderServiceImpl cloudServiceImpl)
	{
		this.cloudServiceImpl = cloudServiceImpl;
	}
	
	
	@Autowired
	public void setFoodService(FoodOrderService foodOrderService)
	{
		this.foodOrderService = foodOrderService;
	}
	
	
	
	@GetMapping("food/{type}")
	public String OrderPhases(@PathVariable String type)
	{
		
		switch(type)
		{
			case "resto" :
				foodOrderService = restoServiceImpl;
				break;
				
			case "home" : 
				foodOrderService = homeServiceImpl;
				break;
				
			case "cloud" :
				foodOrderService = cloudServiceImpl;
				break;
				
				default :
					return "Invalid Ordering System";
		}
		
		
		return foodOrderService.placeOrder() + "----------->>>>" + foodOrderService.trackOrder() + 
				"----------->>>>" +foodOrderService.cancelOrder();
		
	}
	
}
