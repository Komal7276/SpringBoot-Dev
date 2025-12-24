package com.example.demo.serviceImpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.InventoryService;


@Service
@Primary
public class StoreInventoryServiceImpl implements InventoryService{

	@Override
	public String addItem() {
		// TODO Auto-generated method stub
		return MessageConstants.STORE_ITEM_ADDED;
	}

	@Override
	public String updateStock() {
		// TODO Auto-generated method stub
		return MessageConstants.STORE_STOCK_UPDATED;
	}

	@Override
	public String checkStock() {
		// TODO Auto-generated method stub
		return MessageConstants.STORE_STOCK_CHECKING;
	}

}
