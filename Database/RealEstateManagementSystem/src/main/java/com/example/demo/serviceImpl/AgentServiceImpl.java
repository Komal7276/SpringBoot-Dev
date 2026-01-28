package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Agent;
import com.example.demo.repository.AgentRepository;
import com.example.demo.service.AgentService;

@Service
public class AgentServiceImpl implements AgentService{

	@Autowired
	AgentRepository agentRepository;
	
	@Override
	public void saveAgent(Agent agent) {
		// TODO Auto-generated method stub
		agentRepository.save(agent);
	}

	@Override
	public Agent getAgent(int id) {
		// TODO Auto-generated method stub
		return agentRepository.findById(id).get();
	}

	@Override
	public List<Agent> getAllAgents(Agent agent) {
		// TODO Auto-generated method stub
		return agentRepository.findAll();
	}

	@Override
	public void deleteAgent(int id) {
		// TODO Auto-generated method stub
		agentRepository.deleteById(id);
	}

	@Override
	public void deleteAllAgent(Agent agent) {
		// TODO Auto-generated method stub
		agentRepository.deleteAll();
	}

	
}
