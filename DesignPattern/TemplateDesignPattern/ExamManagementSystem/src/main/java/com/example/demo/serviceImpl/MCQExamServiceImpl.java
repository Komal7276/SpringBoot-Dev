package com.example.demo.serviceImpl;

import com.example.demo.service.ExamServiceAB;

public class MCQExamServiceImpl extends ExamServiceAB{

	@Override
	public String evaluateAnswers() {
		// TODO Auto-generated method stub
		return "Evaluated the Answers of MCQ Exam";
	}

	@Override
	public String calculateResult() {
		// TODO Auto-generated method stub
		return "Calculated the result of MCQ Exam";
	}

	@Override
	public String publishResult() {
		// TODO Auto-generated method stub
		return "Published the Result of MCQ Exam";
	}

}
