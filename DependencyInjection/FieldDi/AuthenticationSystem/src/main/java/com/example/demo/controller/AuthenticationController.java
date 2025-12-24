package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.AuthenticationService;
import com.example.demo.serviceImpl.OTPAuthServiceImpl;
import com.example.demo.serviceImpl.ThirdPartyAuthServiceImpl;
import com.example.demo.serviceImpl.UsernamePassAuthServiceImpl;

@RestController
public class AuthenticationController {

	
	@Autowired
	UsernamePassAuthServiceImpl userServiceImpl;
	
	@Autowired
	ThirdPartyAuthServiceImpl thirdServiceImpl;
	
	@Autowired
	OTPAuthServiceImpl otpServiceImpl;
	
	@Autowired
	AuthenticationService authService;
	
	@GetMapping("auth/{type}")
	public String AuthenticationSystem(@PathVariable String type)
	{
		switch(type)
		{
			case "otp" :
				authService = otpServiceImpl;
				break;
				
			case "3party":
				authService = thirdServiceImpl;
				break;
				
			case "name&pass" :
				authService = userServiceImpl;
				break;
				
				default:
					return "Authentication Declined";
		}
		
		return authService.login() + "------->>>" + authService.logout() + "------->>>" + authService.validateUser();
	}
	
}
