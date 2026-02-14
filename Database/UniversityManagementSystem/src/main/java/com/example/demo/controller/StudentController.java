package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constants.MessageConstants;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {

	@Autowired
	StudentService stuService;

	@PostMapping("add")
	public String addStudent(@RequestBody Student student)
	{
		stuService.saveStudent(student);
		return MessageConstants.STUDENT_ADDED;
	}
	
	@GetMapping("get/{id}")
	Student getStudent(@PathVariable int id)
	{
		return stuService.getStudent(id);
	}
	
	@GetMapping("getAll")
	List<Student> getAllStudent()
	{
		return stuService.getAllStudents();
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteStudent(@PathVariable int id)
	{
		stuService.deleteStudent(id);
		return MessageConstants.STUDENT_DELETED;
	}
	
	@DeleteMapping("deleteAll")
	public String deleteAllStudent(@RequestBody Student student)
	{
		stuService.deleteAllStudents(student);
		return MessageConstants.ALL_STUDENT_DELETED;
	}
	
	@PutMapping("update")
	public String updateStudent(@RequestBody Student student)
	{
		stuService.updateStudent(student);
		return MessageConstants.STUDENT_UPDATED;
	}

}
