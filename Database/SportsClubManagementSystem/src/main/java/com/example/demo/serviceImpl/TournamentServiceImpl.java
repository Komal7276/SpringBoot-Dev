package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Tournament;
import com.example.demo.repository.TournamentRepository;
import com.example.demo.service.TournamentService;

@Service
public class TournamentServiceImpl implements TournamentService{

	@Autowired
	TournamentRepository tournamentRepository;
	
	@Override
	public void saveTournament(Tournament tournament) {
		// TODO Auto-generated method stub
		tournamentRepository.save(tournament);
	}

	@Override
	public Tournament getTournament(int id) {
		// TODO Auto-generated method stub
		return tournamentRepository.findById(id).get();
	}

	@Override
	public List<Tournament> getAllTournament() {
		// TODO Auto-generated method stub
		return tournamentRepository.findAll();
	}

	@Override
	public void deleteTournament(int id) {
		// TODO Auto-generated method stub
		tournamentRepository.deleteById(id);
	}

	@Override
	public void deleteAllTournament(Tournament tournament) {
		// TODO Auto-generated method stub
		tournamentRepository.deleteAll();
	}

}
