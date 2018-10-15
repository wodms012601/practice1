package com.cafe24.iumium.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.iumium.common.dao.UserDao;
import com.cafe24.iumium.common.dto.UserLoginData;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public UserLoginData userLoginCheck(UserLoginData userLoginData) {
		System.out.println("userService - input id : " + userLoginData.getUserId() + ", input pw : " + userLoginData.getUserPw());
		UserLoginData userLevel = userDao.userLoginCheck(userLoginData);
		return userLevel;
	}
}
