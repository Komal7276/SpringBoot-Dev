package com.example.demo.serviceImpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.FoodOrderService;

@Service
@Primary
public class RestaurantOrderServiceImpl implements FoodOrderService{

 
	@Override
	public String placeOrder() {
		// TODO Auto-generated method stub
		return MessageConstants.RESTO_ORDER_PLACED;
	}

	@Override
	public String trackOrder() {
		// TODO Auto-generated method stub
		return MessageConstants.RESTO_ORDER_TRACKING;
	}

	@Override
	public String cancelOrder() {
		// TODO Auto-generated method stub
		return MessageConstants.RESTO_ORDER_CANCEL;
	}

}
