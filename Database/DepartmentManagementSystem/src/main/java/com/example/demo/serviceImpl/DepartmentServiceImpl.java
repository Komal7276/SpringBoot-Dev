package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.service.DepartmentService;


@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	DepartmentRepository deptRepository;
	
	@Override
	public void saveDepartment(Department department) {
		// TODO Auto-generated method stub
		deptRepository.save(department);
	}

	@Override
	public Department getDepartment(int id) {
		// TODO Auto-generated method stub
		return deptRepository.findById(id).get();
	}

	@Override
	public List<Department> getAllDepartment(Department department) {
		// TODO Auto-generated method stub
		return deptRepository.findAll();
	}

	@Override
	public void deleteDepartment(int id) {
		// TODO Auto-generated method stub
		deptRepository.deleteById(id);
	}

	@Override
	public void deleteAllDepartment(Department department) {
		// TODO Auto-generated method stub
		deptRepository.deleteAll();
	}

}
