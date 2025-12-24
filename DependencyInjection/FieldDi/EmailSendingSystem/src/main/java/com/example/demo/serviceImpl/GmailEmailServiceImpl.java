package com.example.demo.serviceImpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.EmailService;


@Service
@Primary
public class GmailEmailServiceImpl implements EmailService{

	@Override
	public String sendEmail() {
		// TODO Auto-generated method stub
		return MessageConstants.GMAIL_SENT;
	}

	@Override
	public String attachFile() {
		// TODO Auto-generated method stub
		return MessageConstants.GMAIL_ATTACHED;
	}

	@Override
	public String trackEmailStatus() {
		// TODO Auto-generated method stub
		return MessageConstants.GMAIL_TRACK;
	}

}
