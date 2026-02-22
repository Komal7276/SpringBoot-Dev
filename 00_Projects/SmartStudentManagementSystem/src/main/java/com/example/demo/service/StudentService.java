package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {

	Student saveStudent(Student student);
	
	List<Student> getAllStudents();

 	Student updateStudent(int id,Student student);
 	
 	void deleteStudent(int id);

 	List<Student> searchByName(String name);

 	String checkResult(int marks);
 	
 	double getAverageMarks();
 	
}
