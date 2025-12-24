package com.example.demo.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.EmailService;


@Service
public class YahooEmailServiceImpl implements EmailService{

	@Override
	public String sendEmail() {
		// TODO Auto-generated method stub
		return MessageConstants.YAHOO_SENT;
	}

	@Override
	public String attachFile() {
		// TODO Auto-generated method stub
		return MessageConstants.YAHOO_ATTACHED;
	}

	@Override
	public String trackEmailStatus() {
		// TODO Auto-generated method stub
		return MessageConstants.YAHOO_TRACK;
	}

}
