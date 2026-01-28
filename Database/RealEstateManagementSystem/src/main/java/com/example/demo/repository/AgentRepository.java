package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Agent;

public interface AgentRepository extends JpaRepository<Agent, Integer>{

}
