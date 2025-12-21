package com.example.demo.factory;

import com.example.demo.service.NotificationService;
import com.example.demo.serviceImpl.EmailNotificationServiceImpl;
import com.example.demo.serviceImpl.SMSNotificationServiceImpl;

public class NotificationFactory {


	public static NotificationService createObject(String type)
	{
		
		if(type.equals("email"))
		{
			return new EmailNotificationServiceImpl();
		}
	
		if(type.equals("sms"))
		{
			return new SMSNotificationServiceImpl();
		}
		
		return null;
		
	}
	
}
