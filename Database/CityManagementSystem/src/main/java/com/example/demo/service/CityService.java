package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.City;

public interface CityService {

	void saveCity(City city);
	
	City getCity(int id);
	
	List<City> getAllCity();
	
	void deleteCity(int id);
	
	void deleteAllCity();
	
}
