package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Property;

public interface PropertyService {

	void saveProperty(Property property);
	
	void updateProperty(Property property);
	
	Property getProperty(int id);
	
	List<Property> getAllProperties(Property property);
	
	void deleteProperty(int id);
	
	void deleteAllProperties(Property property);
	
}