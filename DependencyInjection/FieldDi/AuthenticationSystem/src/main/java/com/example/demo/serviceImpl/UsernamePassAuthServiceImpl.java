package com.example.demo.serviceImpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.AuthenticationService;

@Service
@Primary
public class UsernamePassAuthServiceImpl implements AuthenticationService{

	@Override
	public String login() {
		// TODO Auto-generated method stub
		return MessageConstants.USER_PASS_LOGIN;
	}

	@Override
	public String logout() {
		// TODO Auto-generated method stub
		return MessageConstants.USER_PASS_LOGOUT;
	}

	@Override
	public String validateUser() {
		// TODO Auto-generated method stub
		return MessageConstants.USER_PASS_VALIDATE;
	}

}
