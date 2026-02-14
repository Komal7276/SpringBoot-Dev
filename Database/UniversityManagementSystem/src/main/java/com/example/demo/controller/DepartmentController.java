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
	DepartmentService deptService;

	@PostMapping("add")
	public String addDepartment(@RequestBody Department department)
	{
		deptService.saveDepartment(department);
		return MessageConstants.DEPARTMENT_ADDED;
	}
	
	@GetMapping("getAll")
	List<Department> getAllDepartments()
	{
		return deptService.getAllDepartment();
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteDepartment(@PathVariable int id)
	{
		deptService.deleteDepartment(id);
		return MessageConstants.DEPARTMNET_DELETED;
	}

}
