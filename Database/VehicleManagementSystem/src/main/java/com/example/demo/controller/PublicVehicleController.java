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
import com.example.demo.entity.Vehicle;
import com.example.demo.service.VehicleService;

@RestController
@RequestMapping("public")
public class PublicVehicleController {

	
	@Autowired
	VehicleService vehicleService;
	
	@PostMapping("add")
	public String addVehicle(@RequestBody Vehicle vehicle)
	{
		vehicleService.addVehicle(vehicle);
		return MessageConstants.VEHICLE_ADDED;
	}
	
	@GetMapping("get/{id}")
	Vehicle getVehicle(@PathVariable int id)
	{
		return vehicleService.getVehicle(id);
	}
	
	@GetMapping("getAll")
	List<Vehicle> getAllVehicle()
	{
		return vehicleService.getAllVehicle();
	}
	
	@DeleteMapping("delete/{id}")
	String deleteVehicle(@PathVariable int id)
	{
		vehicleService.deleteVehicle(id);
		return MessageConstants.VEHICLE_DELETED;
	}
	
	@DeleteMapping("deleteAll")
	String deleteAllVehicle(@RequestBody Vehicle vehicle)
	{
		vehicleService.deleteAllVehicle();
		return MessageConstants.ALL_VEHICLE_DELETED;
	}
}
