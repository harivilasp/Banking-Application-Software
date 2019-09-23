package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Transaction;
import com.example.demo.repository.DataRepository;
import com.example.demo.repository.UserRepository;


@Service
public class ShowService {

	@Autowired
	DataRepository dataRepository;
	@Autowired
	UserRepository userRepository;
	public int addAdmin(String name,String username,String accno,
			int mobno,String address, int ifsc, int balance)
	{
		return userRepository.addAdmin(name,username,accno,mobno,address,ifsc,balance);
	}
	public int addAdminLogin(String username,String password,String role)
	{
		return userRepository.addAdminLogin(username,password,role);
	}
	public List<Transaction> showTransaction(String uname) {
		return dataRepository.showTransaction(uname);
	}
}
