package com.jdbc.connection.service;

import java.util.List;

import com.jdbc.connection.MyDao;

public class MyServiceImpl implements MyService {

	private MyDao myDao;

	public void setMyDao(MyDao myDao) {
		this.myDao = myDao;
	}

	@Override
	public List<String> fetchData() {
		return myDao.getData();
	}

	@Override
	public void saveService() {
		// TODO Auto-generated method stub
		
	}
}
