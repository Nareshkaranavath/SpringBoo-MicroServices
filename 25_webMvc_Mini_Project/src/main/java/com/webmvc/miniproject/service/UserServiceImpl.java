package com.webmvc.miniproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webmvc.miniproject.entity.User;
import com.webmvc.miniproject.repository.UserRepo;
import com.webmvc.miniproject.utils.EmailUtlis;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private EmailUtlis emailUtils;

	@Override
	public boolean saveUser(User user) {
		User savedUser = userRepo.save(user);
		if (savedUser.getUid() != null) {
			String subject = "Your Account created -TechStar IT";
			String body = "<h1>Welcome  to onboard</h1>";
			emailUtils.sendEmails(user.getEmail(), subject, body);
		}
		return false;
	}

	@Override
	public User getUser(String email, String pwd) {
		// TODO Auto-generated method stub
		return userRepo.findByEmailAndPwd(email, pwd);
	}

}
