package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Team;
import com.example.demo.repository.TeamRepository;
import com.example.demo.service.TeamService;

@Service
public class TeamServiceImpl implements TeamService{

	@Autowired
	TeamRepository teamRepository;
	
	@Override
	public void saveTeam(Team team) {
		// TODO Auto-generated method stub
		teamRepository.save(team);
	}

	@Override
	public Team getTeam(int id) {
		// TODO Auto-generated method stub
		return teamRepository.findById(id).get();
	}

	@Override
	public List<Team> getAllTeams() {
		// TODO Auto-generated method stub
		return teamRepository.findAll();
	}

	@Override
	public void deleteTeam(int id) {
		// TODO Auto-generated method stub
		teamRepository.deleteById(id);
	}

	@Override
	public void deleteAllTeams(Team team) {
		// TODO Auto-generated method stub
		teamRepository.deleteAll();
	}

	@Override
	public void updateTeam(Team team) {
		// TODO Auto-generated method stub
		teamRepository.save(team);
	}

}
