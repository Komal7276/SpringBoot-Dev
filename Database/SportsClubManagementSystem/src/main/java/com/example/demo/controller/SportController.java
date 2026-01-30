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
import com.example.demo.entity.Sport;
import com.example.demo.service.SportService;

@RestController
@RequestMapping("sport")
public class SportController {

	@Autowired
	SportService sportService;

	@PostMapping("add")
	public String addSport(@RequestBody Sport sport)
	{
		sportService.saveSport(sport);
		return MessageConstants.SPORT_ADDED;
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteSport(@PathVariable int id)
	{
		sportService.deleteSport(id);
		return MessageConstants.SPORT_DELETED;
	}
	
	@GetMapping("getAll")
	List<Sport> getAllSports()
	{
		return sportService.getAllSports();
	}

}
