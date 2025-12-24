package com.example.demo.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.AuthenticationService;

@Service
public class ThirdPartyAuthServiceImpl implements AuthenticationService{

	@Override
	public String login() {
		// TODO Auto-generated method stub
		return MessageConstants.THIRD_PARTY_LOGIN;
	}

	@Override
	public String logout() {
		// TODO Auto-generated method stub
		return MessageConstants.THIRD_PARTY_LOGOUT;
	}

	@Override
	public String validateUser() {
		// TODO Auto-generated method stub
		return MessageConstants.THIRD_PARTY_VALIDATE;
	}

}
