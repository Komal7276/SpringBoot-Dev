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
import com.example.demo.entity.City;
import com.example.demo.service.CityService;

@RestController
@RequestMapping("smartcity")
public class SmartCityController {

	
	@Autowired
	CityService cityService;
	
	@PostMapping("add")
	public String addCity(@RequestBody City city)
	{
		cityService.saveCity(city);
		return MessageConstants.CITY_ADDED;
	}
	
	
	@GetMapping("get/{id}")
	City getCity(@PathVariable int id)
	{
		return cityService.getCity(id);
	}
	
	
	@GetMapping("getall")
	List<City> getAllCity()
	{
		return cityService.getAllCity();
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteCity(@PathVariable int id)
	{
		cityService.deleteCity(id);
		return MessageConstants.CITY_DELETED;
	}
	
	@DeleteMapping("deleteall")
	public String deleteAllCity(@RequestBody City city)
	{
		cityService.deleteAllCity();
		return MessageConstants.ALL_CITY_DELETED;
	}
	
}
