package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Tournament;

public interface TournamentService {

	void saveTournament(Tournament tournament);
	
	Tournament getTournament(int id);
	
	List<Tournament> getAllTournament();
	
	void deleteTournament(int id);
	
	void deleteAllTournament(Tournament tournament);
}
