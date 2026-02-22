package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student-22-Feb")
public class Student {

	@Id
	private int id;
	
	private String name;
	private int marks;
	private String course;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
	public Student() {}
	
	public Student(int id, String name, int marks, String course) 
	{
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ","
				+ " name=" + name + ","
				+ " marks=" + marks + ", "
				+ "course=" + course + "]";
	}
	
	
	
}
