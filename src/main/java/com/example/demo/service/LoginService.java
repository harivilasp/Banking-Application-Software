package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.UserRepository;


@Service
public class LoginService {

	@Autowired
	UserRepository userRepository;
	
	
	
	public boolean isValid(String username, String password) {
		
		return userRepository.search(username,password);
		
	}
}
