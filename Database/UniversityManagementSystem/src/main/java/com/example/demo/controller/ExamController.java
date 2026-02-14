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
import com.example.demo.entity.Exam;
import com.example.demo.service.ExamService;

@RestController
@RequestMapping("exam")
public class ExamController {

	@Autowired
	ExamService examService;
	
	
	@PostMapping("add")
	public String addExam(@RequestBody Exam exam)
	{
		examService.saveExam(exam);
		return MessageConstants.EXAM_ADDED;
	}
	
	@PutMapping("update")
	public String updateExam(@RequestBody Exam exam)
	{
		examService.updateExam(exam);
		return MessageConstants.EXAM_UPDATED;
	}
	
	@GetMapping("get/{id}")
	Exam getExam(@PathVariable int id)
	{
		return examService.getExam(id);
	}
	
	@GetMapping("getAll")
	List<Exam> getAllExams()
	{
		return examService.getAllExams();
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteExam(@PathVariable int id)
	{
		examService.deleteExam(id);
		return MessageConstants.EXAM_DELETED;
	}
	
	@DeleteMapping("deleteAll")
	public String deleteAllExams(@RequestBody Exam exam)
	{
		examService.deleteAllExams(exam);
		return MessageConstants.ALL_EXAMS_DELETED;
	}
}

