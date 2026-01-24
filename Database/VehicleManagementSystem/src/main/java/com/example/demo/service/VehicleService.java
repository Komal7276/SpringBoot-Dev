package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Vehicle;


public interface VehicleService {

	void addVehicle(Vehicle vehicle);
	
	Vehicle getVehicle(int id);
	
	List<Vehicle> getAllVehicle();
	
	void deleteVehicle(int id);
	
	void deleteAllVehicle();
}
