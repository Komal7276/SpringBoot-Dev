package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Sport;

public interface SportService {

	void saveSport(Sport sport);
	
	List<Sport> getAllSports();
	
	void deleteSport(int id);
	
}

