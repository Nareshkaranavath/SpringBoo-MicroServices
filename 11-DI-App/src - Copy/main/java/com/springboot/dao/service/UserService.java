package com.springboot.dao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.UserDao;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	public UserService() {
		System.out.println("UserService::default -constructor");
	}
//
//	@Autowired // optional when have one when we have only one constructor 
//	public UserService(UserDao userDao) {
//		System.out.println("Userservice :: param-constructor");
//		this.userDao = userDao;
//	}
//
//	@Autowired //mandatory for setter method 
//	public void setUserDao(UserDao userDao) {
//		this.userDao = userDao;
//	}

	public void getName(int id) {
		String findName = userDao.findName(id);
		System.out.println("Name " + findName);

	}
}
