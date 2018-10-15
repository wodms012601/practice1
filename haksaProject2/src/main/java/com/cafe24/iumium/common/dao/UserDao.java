package com.cafe24.iumium.common.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.iumium.common.dto.UserLoginData;

@Repository
public class UserDao {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	private final String nameSpace = "com.cafe24.iumium.common.dao.UserMapper.";
	
	// 사용자 로그인 체크
	public UserLoginData userLoginCheck(UserLoginData userLoginData) {
		System.out.println("userDao - userLoginCheck() - input id : " + userLoginData.getUserId() + ", input pw : " + userLoginData.getUserPw());
	
		return sqlSessionTemplate.selectOne(nameSpace + "userLoginCheck", userLoginData);
	}
}
