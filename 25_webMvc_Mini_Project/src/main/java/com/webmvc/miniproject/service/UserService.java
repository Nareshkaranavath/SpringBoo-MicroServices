package com.webmvc.miniproject.service;

import com.webmvc.miniproject.entity.User;

public interface UserService {

	public boolean saveUser(User user);

	public User getUser(String email, String pwd);
}
