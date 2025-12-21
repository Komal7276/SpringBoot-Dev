package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.factory.NotificationFactory;
import com.example.demo.service.NotificationService;

@RestController
public class NotificationController {

	@GetMapping("notify/{type}")
	public String sendNotification(@PathVariable String type)
	{
		
		NotificationService notificationService = NotificationFactory.createObject(type);
		
		return  notificationService.sendNotification();

	}
	
}
