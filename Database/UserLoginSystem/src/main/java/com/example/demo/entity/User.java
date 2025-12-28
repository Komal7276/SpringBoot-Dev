package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "User-28-DEC")
public class User {

	@Id
	private int userId;
	private String userName;
	private String password;
	private String email;
	private String careatedDate;
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCareatedDate() {
		return careatedDate;
	}
	public void setCareatedDate(String careatedDate) {
		this.careatedDate = careatedDate;
	}
	
	
}
