package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.SeniorEmployee;
import com.example.demo.repository.SeniorEmployeeRepository;
import com.example.demo.service.EmployeeService;


@Service
public class SeniorEmployeeServiceImpl implements EmployeeService{

	
	@Autowired
	SeniorEmployeeRepository seniorEmployeeRepository;
	
	
	@Override
	public void saveEmployee(SeniorEmployee seniorEmployee) {
		// TODO Auto-generated method stub
		seniorEmployeeRepository.save(seniorEmployee);
	}

	@Override
	public SeniorEmployee getEmployee(int id) {
		// TODO Auto-generated method stub
		return seniorEmployeeRepository.findById(id).get();
	}

	@Override
	public List<SeniorEmployee> getAllEmployee(SeniorEmployee seniorEmployee) {
		// TODO Auto-generated method stub
		return seniorEmployeeRepository.findAll();
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		seniorEmployeeRepository.deleteById(id);
	}

	@Override
	public void deleteAllEmployee(SeniorEmployee seniorEmployee) {
		// TODO Auto-generated method stub
		seniorEmployeeRepository.deleteAll();
	}

}
