package com.unnab.jpa2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unnab.jpa2.dao.UserDao;
import com.unnab.jpa2.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public List getUserDetails() {
		return userDao.getUserDetails();
	}

}



