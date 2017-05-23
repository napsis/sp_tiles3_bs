package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.HelloWorldDao;

@Service
public class HelloWorldService {
	
	@Autowired
	private HelloWorldDao hwDao ;

	public String selectDual() {
		return hwDao.selectDual();
	}
	
	
}
