package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Vehicle;
import com.example.demo.repository.VehicleRepository;
import com.example.demo.service.VehicleService;

@Service
public class PublicVehicleServiceImpl implements VehicleService{

	@Autowired
	VehicleRepository vehicleRepository;
	
	
	@Override
	public void addVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		vehicleRepository.save(vehicle);
	}

	@Override
	public Vehicle getVehicle(int id) {
		// TODO Auto-generated method stub
		return vehicleRepository.findById(id).get();
	}

	@Override
	public List<Vehicle> getAllVehicle() {
		// TODO Auto-generated method stub
		return vehicleRepository.findAll();
	}

	@Override
	public void deleteVehicle(int id) {
		// TODO Auto-generated method stub
		vehicleRepository.deleteById(id);
	}

	@Override
	public void deleteAllVehicle() {
		// TODO Auto-generated method stub
		vehicleRepository.deleteAll();
	}

}
