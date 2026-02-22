package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("students")
public class StudentController {

	private final StudentService studentService;
	
	public StudentController(StudentService studentService)
	{
		this.studentService = studentService;
		
	}
	
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student)
	{
		return studentService.saveStudent(student);
	}
	
	@GetMapping("/getAll")
	public List<Student> getAllStudents()
	{
		return studentService.getAllStudents();
	}
	
	@PutMapping("/update/{id}")
	public Student updateStudent(@PathVariable int id,
									@RequestBody Student student)
	{
		return studentService.updateStudent(id, student);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteStudent(@PathVariable int id)
	{
		studentService.deleteStudent(id);
		
		return "Student Deleted Successfully";
	}
	
	@GetMapping("/search/{name}")
	public List<Student> searchStudents(@PathVariable String name)
	{
		return studentService.searchByName(name);
	}
	
	@GetMapping("/result/{marks}")
	public String checkResult(@PathVariable int marks)
	{
		return studentService.checkResult(marks);
	}
	
	@GetMapping("/get/average")
	public double getAverageMarks()
	{
		return studentService.getAverageMarks();
	}
	
}
