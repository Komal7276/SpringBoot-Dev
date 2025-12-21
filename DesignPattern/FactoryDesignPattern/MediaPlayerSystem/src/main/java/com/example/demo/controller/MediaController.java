package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.factory.MediaFactory;
import com.example.demo.service.MediaService;

@RestController
public class MediaController {
	
	@GetMapping("media/{type}")
	public String mediaPlayer(@PathVariable String type)
	{
		
		MediaService mediaService = MediaFactory.createObject(type);
		
		return mediaService.playMedia();
	}

}
