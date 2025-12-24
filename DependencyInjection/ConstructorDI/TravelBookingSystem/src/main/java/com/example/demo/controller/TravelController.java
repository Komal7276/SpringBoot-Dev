package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TravelService;
import com.example.demo.serviceImpl.BusServiceImpl;
import com.example.demo.serviceImpl.FlightServiceImpl;
import com.example.demo.serviceImpl.TrainServiceImpl;

@RestController
@RequestMapping("travel")
public class TravelController {

	
    private final TrainServiceImpl trainServiceImpl;

    private final FlightServiceImpl flightServiceImpl;

    private final BusServiceImpl busServiceImpl;

    
    
	TravelController(BusServiceImpl busServiceImpl,
						FlightServiceImpl flightServiceImpl,
						TrainServiceImpl trainServiceImpl)
	{
		this.busServiceImpl = busServiceImpl;
		this.flightServiceImpl = flightServiceImpl;
		this.trainServiceImpl = trainServiceImpl;
	}
	
	
	
	@GetMapping("/{type}")
	public String showTravelDetails(@PathVariable String type)
	{
		
		TravelService travelService;
		
		switch(type)
		{
			case "bus":
				travelService = busServiceImpl;
				break;
				
			case "flight" :
				travelService = flightServiceImpl;
				break;
				
			case "train" :
				travelService = trainServiceImpl;
				break;
				
				default :
					return "Invalid Mode";
		}
		
		
		return travelService.searchTicket() + "----->>>" + travelService.bookTicket() +
				"----->>>" + travelService.confirmBooking() + "------>>>" + travelService.cancelBooking();
	}
	
	
}
