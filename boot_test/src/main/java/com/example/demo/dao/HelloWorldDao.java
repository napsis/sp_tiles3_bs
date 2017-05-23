package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.mapper.HelloWorldMapper;

@Repository
public class HelloWorldDao {
	
	@Autowired
	private HelloWorldMapper hwMapper;

	public String selectDual() {
		return hwMapper.selectDual();
	}

}
