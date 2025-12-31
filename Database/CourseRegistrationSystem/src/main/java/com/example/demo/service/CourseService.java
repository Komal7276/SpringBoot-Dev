package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Course;

public interface CourseService {

	void saveCourse(Course course);
	
	Course getCourse(int id);

	List<Course> getAllCourse(Course course);
	
	void deleteCourse(int id);

	void deleteAllCourse(Course course);
}
