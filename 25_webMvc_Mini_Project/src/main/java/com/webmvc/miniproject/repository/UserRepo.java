package com.webmvc.miniproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webmvc.miniproject.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	public User findByEmailAndPwd(String email, String pwd);
}
