package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;

public interface UserService {

	void saveUser(User user);
	
	User getUser(int id);

 	List<User> getAllUsers(User user);
 	
 	void deleteUser(int id);

 	void deleteAllUsers(User user);
 	
}
