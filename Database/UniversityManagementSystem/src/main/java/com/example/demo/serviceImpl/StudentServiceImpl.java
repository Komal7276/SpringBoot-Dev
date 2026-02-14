package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository stuRepository;
	
	
	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		stuRepository.save(student);
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return stuRepository.findById(id).get();
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return stuRepository.findAll();
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		stuRepository.save(student);
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		stuRepository.deleteById(id);
	}

	@Override
	public void deleteAllStudents(Student student) {
		// TODO Auto-generated method stub
		stuRepository.deleteAll();
	}

}
