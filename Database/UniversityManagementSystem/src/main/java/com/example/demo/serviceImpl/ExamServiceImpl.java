package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Exam;
import com.example.demo.repository.ExamRepository;
import com.example.demo.service.ExamService;

@Service
public class ExamServiceImpl implements ExamService{

	@Autowired
	ExamRepository examRepository;
	
	@Override
	public void saveExam(Exam exam) {
		// TODO Auto-generated method stub
		examRepository.save(exam);
	}

	@Override
	public void updateExam(Exam exam) {
		// TODO Auto-generated method stub
		examRepository.save(exam);
	}

	@Override
	public Exam getExam(int id) {
		// TODO Auto-generated method stub
		return examRepository.findById(id).get();
	}

	@Override
	public List<Exam> getAllExams() {
		// TODO Auto-generated method stub
		return examRepository.findAll();
	}

	@Override
	public void deleteExam(int id) {
		// TODO Auto-generated method stub
		examRepository.deleteById(id);
	}

	@Override
	public void deleteAllExams(Exam exam) {
		// TODO Auto-generated method stub
		examRepository.deleteAll();
	}

	
}
