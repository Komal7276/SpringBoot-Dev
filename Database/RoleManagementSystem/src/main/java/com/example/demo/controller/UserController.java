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
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	UserService userService;

	
	@PostMapping("add")
	public String addUser(@RequestBody User user)
	{
		userService.saveUser(user);
		return MessageConstants.USER_ADDED;
	}
	
	@GetMapping("get/{id}")
	User getUser(@PathVariable int id)
	{
		return userService.getUser(id);
	}
	
	
	@GetMapping("getAll")
	List<User> getAllUsers(@RequestBody User user)
	{
		return userService.getAllUsers(user);
	}
	
	
	@DeleteMapping("delete/{id}")
	public String deleteUser(@PathVariable int id) 
	{
		userService.deleteUser(id);
		return MessageConstants.USER_DELETED;
	}
	
	@DeleteMapping("deleteAll")
	public String deleteAllUsers(@RequestBody User user)
	{
		userService.deleteAllUsers(user);
		return MessageConstants.ALL_USERS_DELETED;
	}
	
}
