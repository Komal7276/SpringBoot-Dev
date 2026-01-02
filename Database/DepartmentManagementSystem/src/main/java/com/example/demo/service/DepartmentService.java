package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Department;

public interface DepartmentService {

	
	void saveDepartment(Department department);
	
	Department getDepartment(int id);

	List<Department> getAllDepartment(Department department);

	void deleteDepartment(int id);

	void deleteAllDepartment(Department department);
}

