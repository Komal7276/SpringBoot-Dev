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
import com.example.demo.entity.Coach;
import com.example.demo.service.CoachService;

@RestController
@RequestMapping("coach")
public class CoachController {

	@Autowired
	CoachService coachService;

	@PostMapping("add")
	public String addCoach(@RequestBody Coach coach)
	{
		coachService.saveCoach(coach);
		return MessageConstants.COACH_ADDED;
	}
	
	@GetMapping("get/{id}")
	Coach getCoach(@PathVariable int id)
	{
		return coachService.getCoach(id);
	}
	
	@GetMapping("getAll")
	List<Coach> getAllCoach()
	{
		return coachService.getAllCoach();
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteCoach(@PathVariable int id)
	{
		coachService.deleteCoach(id);
		return MessageConstants.COACH_DELETED;
	}
}
