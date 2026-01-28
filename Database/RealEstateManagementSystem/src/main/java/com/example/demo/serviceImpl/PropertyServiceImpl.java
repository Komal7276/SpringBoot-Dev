package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Property;
import com.example.demo.repository.PropertyRepository;
import com.example.demo.service.PropertyService;

@Service
public class PropertyServiceImpl implements PropertyService{

	
	@Autowired
	PropertyRepository propRepository;
	
	
	@Override
	public void saveProperty(Property property) {
		// TODO Auto-generated method stub
		propRepository.save(property);
	}

	@Override
	public Property getProperty(int id) {
		// TODO Auto-generated method stub
		return propRepository.findById(id).get();
	}

	@Override
	public List<Property> getAllProperties(Property property) {
		// TODO Auto-generated method stub
		return propRepository.findAll();
	}

	@Override
	public void deleteProperty(int id) {
		// TODO Auto-generated method stub
		propRepository.deleteById(id);
	}

	@Override
	public void deleteAllProperties(Property property) {
		// TODO Auto-generated method stub
		propRepository.deleteAll();
	}

	@Override
	public void updateProperty(Property property) {
		// TODO Auto-generated method stub
		propRepository.save(property);
	}

	
}