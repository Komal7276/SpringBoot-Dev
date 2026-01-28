package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constants.MessageConstants;
import com.example.demo.entity.Property;
import com.example.demo.service.PropertyService;

@RestController
@RequestMapping("property")
public class PropertyController {

	@Autowired
	PropertyService propertyService;

	@PostMapping("add")
	public String addProperty(@RequestBody Property property)
	{
		propertyService.saveProperty(property);
		return MessageConstants.PROPERTY_ADDED;
	}
	
	@GetMapping("get/{id}")
 	Property getProperty(@PathVariable int id)
	{
		return propertyService.getProperty(id);
	}
	
	@GetMapping("getAll")
	List<Property> getAllProperties(@RequestBody Property property)
	{
		return propertyService.getAllProperties(property);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteProperty(@PathVariable int id)
	{
		propertyService.deleteProperty(id);
		return MessageConstants.PROPERTY_DELETED;
	}
	
	@DeleteMapping("deleteAll")
	public String deleteAllProperties(@RequestBody Property property)
	{
		propertyService.deleteAllProperties(property);
		return MessageConstants.ALL_PROPERTIES_DELETED;
	}
	
	@PutMapping("update")
	public String updateProperty(@RequestBody Property property)
	{
		propertyService.updateProperty(property);
		return MessageConstants.PROPERTY_UPDATED;
	}

}