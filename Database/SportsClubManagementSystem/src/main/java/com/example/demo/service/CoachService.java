package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Coach;

public interface CoachService {

	void saveCoach(Coach coach);
	
	Coach getCoach(int id);
	
	List<Coach> getAllCoach();
	
	void deleteCoach(int id);
}
