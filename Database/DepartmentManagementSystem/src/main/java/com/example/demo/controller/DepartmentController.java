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
import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;

@RestController
@RequestMapping("department")
public class DepartmentController {

	
	@Autowired
	DepartmentService departmentService;

	
	@PostMapping("add")
	public String addDepartment(@RequestBody Department department)
	{
		departmentService.saveDepartment(department);
		return MessageConstants.ADD_DEPT;
	}
	
	@GetMapping("get/{id}")
	Department getDepartment(@PathVariable int id)
	{
		return departmentService.getDepartment(id);
	}
	
	@GetMapping("getAll")
	List<Department> getAllDepartments(@RequestBody Department department)
	{
		return departmentService.getAllDepartment(department);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteDepartmnet(@PathVariable int id)
	{
		departmentService.deleteDepartment(id);
		return MessageConstants.DELETE_DEPT;
	}
	
	@DeleteMapping("deleteAll")
	public String deleteAllDept(@RequestBody Department department)
	{
		departmentService.deleteAllDepartment(department);
		return MessageConstants.DELETE_ALL_DEPT;
	}

}
