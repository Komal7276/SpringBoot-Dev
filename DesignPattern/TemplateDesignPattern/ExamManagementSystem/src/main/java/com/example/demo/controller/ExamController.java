package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ExamService;
import com.example.demo.serviceImpl.CodingEcamServiceImpl;
import com.example.demo.serviceImpl.MCQExamServiceImpl;

@RestController
public class ExamController {
	
	ExamService examService = null;

	@GetMapping("exam/{type}")
	public String printMcqResult(@PathVariable String type)
	{
		if(type.equals("mcq"))
		{
			examService = new MCQExamServiceImpl();
		}
		
		if(type.equals("coding"))
		{
			examService = new CodingEcamServiceImpl();
		}
		
		examService.verifyStudent();
		examService.evaluateAnswers();
		examService.calculateResult();
		
		return examService.publishResult();
	}
	
	
	
}
