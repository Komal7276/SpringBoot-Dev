package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constants.MessageConstants;
import com.example.demo.entity.User;
import com.example.demo.service.UserLoginService;

@RestController
@RequestMapping("user")
public class UserLoginController {

	@Autowired
	UserLoginService userLoginService;
	
	
	@PostMapping("/login")
	public String addUser(@RequestBody User user)
	{
		userLoginService.loginUser(user);
		
		return MessageConstants.USER_LOGIN_DB;
	}
	
	@DeleteMapping("/logout/{id}")
	public String deleteUser(@PathVariable int id)
	{
		userLoginService.logoutUser(id);
		
		return MessageConstants.USER_LOGOUT_DB;
	}
}
