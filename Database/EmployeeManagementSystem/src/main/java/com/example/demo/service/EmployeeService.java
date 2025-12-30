package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.SeniorEmployee;

public interface EmployeeService {

	void saveEmployee(SeniorEmployee seniorEmployee);
	
	SeniorEmployee getEmployee(int id);

	List<SeniorEmployee> getAllEmployee(SeniorEmployee seniorEmployee);
	
	void deleteEmployee(int id);

	void deleteAllEmployee(SeniorEmployee seniorEmployee);
	
}
