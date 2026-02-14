package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Department;

public interface DepartmentService {

	void saveDepartment(Department department);
	
	List<Department> getAllDepartment();
	
	void deleteDepartment(int id);
}
