package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.EmailService;
import com.example.demo.serviceImpl.GmailEmailServiceImpl;
import com.example.demo.serviceImpl.OutlookEmailServiceImpl;
import com.example.demo.serviceImpl.YahooEmailServiceImpl;

@RestController
public class EmailController {

	
	@Autowired
	GmailEmailServiceImpl gmailServiceImpl;
	
	@Autowired
	OutlookEmailServiceImpl outlookServiceImpl;
	
	@Autowired
	YahooEmailServiceImpl yahooServiceImpl;
	
	@Autowired
	EmailService emailService;
	
	
	@GetMapping("email/{type}")
	public String EmailStatus(@PathVariable String type)
	{
		switch(type)
		{
			case "gmail" :
				emailService = gmailServiceImpl;
				break;
				
			case "outlook" :
				emailService = outlookServiceImpl;
				break;
				
			case "yahoo" :
				emailService = yahooServiceImpl;
				break;
				
				default : 
					return "Invalid Email Sending System";
		}
		
		
		return emailService.sendEmail() + "----------->>>" + emailService.attachFile() + 
				"---------->>>" + emailService.trackEmailStatus();
	}
	
}
