package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.InventoryService;
import com.example.demo.serviceImpl.OnlineInventoryServiceImpl;
import com.example.demo.serviceImpl.StoreInventoryServiceImpl;
import com.example.demo.serviceImpl.WarehouseInventoryServiceImpl;

@RestController
public class InventoryController {

	private OnlineInventoryServiceImpl onlineServiceImpl;
	private StoreInventoryServiceImpl storeServiceImpl;
	private WarehouseInventoryServiceImpl warehouseServiceImpl;
	private InventoryService invenService;



	@Autowired
	public void setOnlineService(OnlineInventoryServiceImpl onlineServiceImpl)
	{
		this.onlineServiceImpl = onlineServiceImpl;
	}
	
	
	@Autowired
	public void setStoreService(StoreInventoryServiceImpl storeServiceImpl)
	{
		this.storeServiceImpl = storeServiceImpl;
	}
	
	
	@Autowired
	public void setWarehouseService(WarehouseInventoryServiceImpl warehouseServiceImpl)
	{
		this.warehouseServiceImpl = warehouseServiceImpl;
	}
	
	
	@Autowired
	public void setInventoryService(InventoryService invenService)
	{
		this.invenService = invenService;
	}
	
	
	
	@GetMapping("stock/{type}")
	public String InventoryStockUpdates(@PathVariable String type)
	{
		
		switch(type)
		{
			case "online" :
				invenService = onlineServiceImpl;
				break;
			
			case "store" :
				invenService = storeServiceImpl;
				break;
				
			case "warehouse" :
				invenService = warehouseServiceImpl;
				break;
				
				default :
					return "Invalid Inventory Type";
		}
		
		
		return invenService.addItem() + "---------->>>>" + invenService.updateStock() 
				+ "---------->>>>" + invenService.checkStock();
		
	}
	
}
