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
import com.example.demo.entity.Course;
import com.example.demo.service.CourseService;

@RestController
@RequestMapping("course")
public class CourseController {

	@Autowired
	CourseService courseService;

	@PostMapping("add")
	public String addCourse(@RequestBody Course course)
	{
		courseService.saveCourse(course);
		return MessageConstants.COURSE_ADDED;
	}
	
	
	@GetMapping("get/{id}")
	Course getCourse(@PathVariable int id)
	{
		return courseService.getCourse(id);
	}
	
	@GetMapping("getAll")
 	List<Course> getAllCourses(@RequestBody Course course)
	{
		return courseService.getAllCourse(course);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteCourse(@PathVariable int id)
	{
		courseService.deleteCourse(id);
		return MessageConstants.COURSE_DELETED;
	}
	
	@DeleteMapping("deleteAll")
	public String deleteAll(@RequestBody Course course)
	{
		courseService.deleteAllCourse(course);
		return MessageConstants.ALL_COURSE_DELETED;
	}

}
