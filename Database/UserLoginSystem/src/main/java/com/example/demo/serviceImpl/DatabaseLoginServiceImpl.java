package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserLoginService;

@Service
public class DatabaseLoginServiceImpl implements UserLoginService{

	@Autowired
	UserRepository userRepository;

	@Override
	public void loginUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	@Override
	public void logoutUser(int id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}
	
	

}
