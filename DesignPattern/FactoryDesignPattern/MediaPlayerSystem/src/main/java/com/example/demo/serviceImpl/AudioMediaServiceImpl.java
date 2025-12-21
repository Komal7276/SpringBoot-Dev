package com.example.demo.serviceImpl;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.MediaService;

public class AudioMediaServiceImpl implements MediaService{

	@Override
	public String playMedia() {
		// TODO Auto-generated method stub
		return MessageConstants.AUDIO_MEDIA;
	}

}
