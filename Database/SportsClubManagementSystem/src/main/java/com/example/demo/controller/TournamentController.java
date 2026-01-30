package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constants.MessageConstants;
import com.example.demo.entity.Tournament;
import com.example.demo.service.TournamentService;

@RestController
@RequestMapping("tournament")
public class TournamentController {

	@Autowired
	TournamentService tournamentService;
	
	@PostMapping("add")
	public String addTournament(@RequestBody Tournament tournament)
	{
		tournamentService.saveTournament(tournament);
		return MessageConstants.TOURNAMENT_ADDED;
	}
	
	@GetMapping("get/{id}")
	Tournament getTournament(@PathVariable int id)
	{
		return tournamentService.getTournament(id);
	}
	
	@GetMapping("getAll")
	List<Tournament> getAllTournaments()
	{
		return tournamentService.getAllTournament();
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteTournament(@PathVariable int id)
	{
		tournamentService.deleteTournament(id);
		return MessageConstants.TOURNAMENT_DELETED;
	}
	
	@DeleteMapping("deleteAll")
	public String deleteAllTournament(@RequestBody Tournament tournament)
	{
		tournamentService.deleteAllTournament(tournament);
		return MessageConstants.ALL_TOURNAMENT_DELETED;
	}
}
