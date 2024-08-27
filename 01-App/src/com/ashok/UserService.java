package com.ashok;

public class UserService{

	// by extending inheritance tightcoupling occur and cause issue 
	public void printUserServiceName(Integer id ) {
		// by creating object we can access another classs
		 UserDao dao = new UserDao();
		String uname = dao.getUserNameById(id);
		System.out.println(uname);
	}
}
