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
import com.example.demo.entity.SeniorEmployee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("seniorEmp")
public class SeniorEmpController {

	@Autowired
	EmployeeService employeeService;
	
	
	@PostMapping("add")
	public String addEmployee(@RequestBody SeniorEmployee seniorEmployee)
	{
		employeeService.saveEmployee(seniorEmployee);
		return MessageConstants.SENIOR_EMP_ADDED;
	}
	
	@GetMapping("get/{id}")
	SeniorEmployee getEmployee(@PathVariable int id)
	{
		return employeeService.getEmployee(id);
	}
	
	@GetMapping("getAll")
	List<SeniorEmployee> getAllEmployee(@RequestBody SeniorEmployee seniorEmployee)
	{
		return employeeService.getAllEmployee(seniorEmployee);
	}
	
	@DeleteMapping("delete/{id}")
	String deleteEmployee(@PathVariable int id)
	{
		employeeService.deleteEmployee(id);
		return MessageConstants.SENIOR_EMP_DELETED;
	}
	
	@DeleteMapping("deleteAll")
	String deleteAllEmployee(@RequestBody SeniorEmployee seniorEmployee)
	{
		employeeService.deleteAllEmployee(seniorEmployee);
		return MessageConstants.SENIOR_ALL_EMP_DELETED;
	}
}
