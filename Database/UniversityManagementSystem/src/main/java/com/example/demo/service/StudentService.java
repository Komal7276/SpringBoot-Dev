package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {

	void saveStudent(Student student);
	
	Student getStudent(int id);

 	List<Student> getAllStudents();
 	
 	void updateStudent(Student student);

 	void deleteStudent(int id);
 	
 	void deleteAllStudents(Student student);
}
