package com.example.demo.serviceImpl;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.MediaService;

public class LiveStreamServiceImpl implements MediaService{

	@Override
	public String playMedia() {
		// TODO Auto-generated method stub
		return MessageConstants.LIVESTREAM_MEDIA;
	}

}
