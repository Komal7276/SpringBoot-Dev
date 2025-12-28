package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserLoginService {

	void loginUser(User user);
	
	void logoutUser(int id);
}
