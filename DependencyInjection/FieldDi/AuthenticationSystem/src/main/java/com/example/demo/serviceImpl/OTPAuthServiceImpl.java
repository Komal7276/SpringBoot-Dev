package com.example.demo.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.AuthenticationService;


@Service
public class OTPAuthServiceImpl implements AuthenticationService{

	@Override
	public String login() {
		// TODO Auto-generated method stub
		return MessageConstants.OTP_LOGIN;
	}

	@Override
	public String logout() {
		// TODO Auto-generated method stub
		return MessageConstants.OTP_LOGOUT;
	}

	@Override
	public String validateUser() {
		// TODO Auto-generated method stub
		return MessageConstants.OTP_VALIDATE;
	}

}
