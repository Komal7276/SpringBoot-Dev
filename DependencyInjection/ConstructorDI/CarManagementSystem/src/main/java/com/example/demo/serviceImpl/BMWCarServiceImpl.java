package com.example.demo.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.CarService;

@Service
public class BMWCarServiceImpl implements CarService{

	@Override
	public String startCar() {
		// TODO Auto-generated method stub
		return MessageConstants.BMW_START;
	}

	@Override
	public String driveCar() {
		// TODO Auto-generated method stub
		return MessageConstants.BMW_DRIVE;
	}

	@Override
	public String stopCar() {
		// TODO Auto-generated method stub
		return MessageConstants.BMW_STOP;
	}

}
