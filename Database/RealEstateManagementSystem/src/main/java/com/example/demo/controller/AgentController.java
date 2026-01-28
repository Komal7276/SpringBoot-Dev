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
import com.example.demo.entity.Agent;
import com.example.demo.service.AgentService;

@RestController
@RequestMapping("agent")
public class AgentController {

	@Autowired
	AgentService agentService;

	@PostMapping("add")
	public String addAgent(@RequestBody Agent agent)
	{
		agentService.saveAgent(agent);
		return MessageConstants.AGENT_ADDED;
	}
	
	@GetMapping("get/{id}")
 	Agent getAgent(@PathVariable int id)
	{
		return agentService.getAgent(id);
	}
	
	@GetMapping("getAll")
	List<Agent> getAllAgents(@RequestBody Agent agent)
	{
		return agentService.getAllAgents(agent);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteAgent(@PathVariable int id)
	{
		agentService.deleteAgent(id);
		return MessageConstants.AGENT_DELETED;
	}
	
	@DeleteMapping("deleteAll")
	public String deleteAllAgents(@RequestBody Agent agent)
	{
		agentService.deleteAllAgent(agent);
		return MessageConstants.ALL_AGENTS_DELETED;
	}

}
