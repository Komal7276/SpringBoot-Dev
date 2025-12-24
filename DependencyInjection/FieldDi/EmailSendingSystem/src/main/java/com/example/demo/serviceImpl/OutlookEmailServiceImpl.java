package com.example.demo.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.EmailService;


@Service
public class OutlookEmailServiceImpl implements EmailService{

	@Override
	public String sendEmail() {
		// TODO Auto-generated method stub
		return MessageConstants.OUTLOOK_SENT;
	}

	@Override
	public String attachFile() {
		// TODO Auto-generated method stub
		return MessageConstants.OUTLOOK_ATTACHED;
	}

	@Override
	public String trackEmailStatus() {
		// TODO Auto-generated method stub
		return MessageConstants.OUTLOOK_TRACK;
	}

}
