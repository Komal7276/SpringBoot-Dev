package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Team;

public interface TeamService {

	void saveTeam(Team team);
	
	Team getTeam(int id);
	
	List<Team> getAllTeams();
	
	void deleteTeam(int id);
	
	void deleteAllTeams(Team team);
	
 	void updateTeam(Team team);
	
}
