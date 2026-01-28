package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Agent-28-JAN")
public class Agent {

	@Id
	private int agentId;
	
	private String name;
	private String email;
	private long mobNo;
	private double commissionRate;
	public int getAgentId() {
		return agentId;
	}
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobNo() {
		return mobNo;
	}
	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}
	public double getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
}
