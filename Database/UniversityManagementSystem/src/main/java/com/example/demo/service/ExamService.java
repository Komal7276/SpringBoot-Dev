package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Exam;

public interface ExamService {

	void saveExam(Exam exam);
	
	void updateExam(Exam exam);
	
	Exam getExam(int id);
	
	List<Exam> getAllExams();
	
	void deleteExam(int id);
	
	void deleteAllExams(Exam exam);
}
