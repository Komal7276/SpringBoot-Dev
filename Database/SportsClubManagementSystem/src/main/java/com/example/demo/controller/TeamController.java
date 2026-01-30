package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constants.MessageConstants;
import com.example.demo.entity.Team;
import com.example.demo.service.TeamService;

@RestController
@RequestMapping("team")
public class TeamController {

	@Autowired
	TeamService teamService;

	@PostMapping("add")
	public String addTeam(@RequestBody Team team)
	{
		teamService.saveTeam(team);
		return MessageConstants.TEAM_ADDED;
	}
	
	@GetMapping("get/{id}")
	Team getTeam(@PathVariable int id)
	{
		return teamService.getTeam(id);
	}
	
	@GetMapping("getAll")
	List<Team> getAllTeams()
	{
		return teamService.getAllTeams();
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteTeam(@PathVariable int id)
	{
		teamService.deleteTeam(id);
		return MessageConstants.TEAM_DELETED;
	}
	
	@DeleteMapping("deleteAll")
	public String deleteAllTeams(@RequestBody Team team)
	{
		teamService.deleteAllTeams(team);
		return MessageConstants.ALL_TEAM_DELETED;
	}
	
	@PutMapping("update")
	public String updateTeam(@RequestBody Team team)
	{
		teamService.updateTeam(team);
		return MessageConstants.TEAM_UPDATED;
	}

}
