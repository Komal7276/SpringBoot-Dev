package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Sport;
import com.example.demo.repository.SportRepository;
import com.example.demo.service.SportService;

@Service
public class SportServiceImpl implements SportService{

	@Autowired
	SportRepository sportRepository;
	
	@Override
	public void saveSport(Sport sport) {
		// TODO Auto-generated method stub
		sportRepository.save(sport);
	}

	@Override
	public List<Sport> getAllSports() {
		// TODO Auto-generated method stub
		return sportRepository.findAll();
	}

	@Override
	public void deleteSport(int id) {
		// TODO Auto-generated method stub
		sportRepository.deleteById(id);
	}

}
