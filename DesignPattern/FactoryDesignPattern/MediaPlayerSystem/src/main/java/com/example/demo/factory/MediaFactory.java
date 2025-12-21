package com.example.demo.factory;

import com.example.demo.service.MediaService;
import com.example.demo.serviceImpl.AudioMediaServiceImpl;
import com.example.demo.serviceImpl.LiveStreamServiceImpl;
import com.example.demo.serviceImpl.VideoMediaServiceImpl;

public class MediaFactory {

	public static MediaService createObject(String type)
	{
		if(type.equals("audio"))
		{
			return new AudioMediaServiceImpl();
		}
		
		if(type.equals("video"))
		{
			return new VideoMediaServiceImpl();
		}
		
		if(type.equals("live"))
		{
			return new LiveStreamServiceImpl();
		}
	
		return null;
		
	}
	
}
