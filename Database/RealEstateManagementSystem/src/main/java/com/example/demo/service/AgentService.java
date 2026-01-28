package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Agent;

public interface AgentService {

	void saveAgent(Agent agent);
	
	Agent getAgent(int id);
	
	List<Agent> getAllAgents(Agent agent);
	
	void deleteAgent(int id);
	
	void deleteAllAgent(Agent agent);
}
