package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CarService;
import com.example.demo.serviceImpl.BMWCarServiceImpl;
import com.example.demo.serviceImpl.HyundaiCarServiceImpl;
import com.example.demo.serviceImpl.TeslaCarServiceImpl;


@RestController
@RequestMapping("car")
public class CarController {

    private TeslaCarServiceImpl teslaCarService;
	private BMWCarServiceImpl bmwCarService;
	private HyundaiCarServiceImpl hyundaiCarService;
	
	
	/*
	 * It is a way to provide dependencies to a class using its constructor.
		Spring injects required objects at the time of object creation.
		It ensures dependencies are mandatory and available from the start.
		Constructor DI improves code readability, immutability, and testability.
		It is the **recommended approach** in Spring applications.

	 * */
	
	
	CarController(TeslaCarServiceImpl teslaCarService,
					BMWCarServiceImpl bmwCarService,
						HyundaiCarServiceImpl hyundaiCarService)
	{
		this.teslaCarService = teslaCarService;
		this.bmwCarService = bmwCarService;
		this.hyundaiCarService = hyundaiCarService;
	}
	
	

	@GetMapping("/{type}")
	public String showCarPhases(@PathVariable String type)
	{
		
		CarService carService;
		
		switch(type)
		{
			case "tesla" :
				carService = teslaCarService;
				break;
				
			case "bmw" :
				carService = bmwCarService;
				break;
				
			case "hyundai" :
				carService = hyundaiCarService;
				break;
				
			default :
				return "Invalid";
		}
		
	
		return carService.startCar() + "------->>" + carService.driveCar() 
				+ "------->> " + carService.stopCar();
	}
	
}
