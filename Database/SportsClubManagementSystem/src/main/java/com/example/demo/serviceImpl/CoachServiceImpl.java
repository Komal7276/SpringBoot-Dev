package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Coach;
import com.example.demo.repository.CoachRepository;
import com.example.demo.service.CoachService;

@Service
public class CoachServiceImpl implements CoachService{

	@Autowired
	CoachRepository coachRepository;
	
	
	@Override
	public void saveCoach(Coach coach) {
		// TODO Auto-generated method stub
		coachRepository.save(coach);
	}

	@Override
	public Coach getCoach(int id) {
		// TODO Auto-generated method stub
		return coachRepository.findById(id).get();
	}

	@Override
	public List<Coach> getAllCoach() {
		// TODO Auto-generated method stub
		return coachRepository.findAll();
	}

	@Override
	public void deleteCoach(int id) {
		// TODO Auto-generated method stub
		coachRepository.deleteById(id);
	}

}
