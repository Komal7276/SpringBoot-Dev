package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.City;
import com.example.demo.repository.CityRepository;
import com.example.demo.service.CityService;

@Service
public class SmartCityServiceImpl implements CityService{

	@Autowired
	CityRepository cityRepository;
	
	
	@Override
	public void saveCity(City city) {
		// TODO Auto-generated method stub
		cityRepository.save(city);
	}

	@Override
	public City getCity(int id) {
		// TODO Auto-generated method stub
		return cityRepository.findById(id).get();
	}

	@Override
	public List<City> getAllCity() {
		// TODO Auto-generated method stub
		return cityRepository.findAll();
	}

	@Override
	public void deleteCity(int id) {
		// TODO Auto-generated method stub
		cityRepository.deleteById(id);
	}

	@Override
	public void deleteAllCity() {
		// TODO Auto-generated method stub
		cityRepository.deleteAll();
	}

}
