package com.cafe24.iumium;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cafe24.iumium.common.dto.UserLoginData;
import com.cafe24.iumium.common.service.UserService;

@CrossOrigin
@RestController
public class UserRestController {
	@Autowired
	private UserService userService;
	
	// 비동기 방식으로 로그인처리를 하기 위함
	@RequestMapping(value="/rest/login", method = RequestMethod.POST)
	public String login(UserLoginData userLoginData, HttpSession session) {
		System.out.println("UserRestController - loginCheck() 호출");
		
		System.out.println("input id: " + userLoginData.getUserId() + ", input pw: " + userLoginData.getUserPw());
		
		UserLoginData userLevel = userService.userLoginCheck(userLoginData);
		
		if(userLevel != null) {
			session.setAttribute("userId", userLevel.getUserId());
			session.setAttribute("userLevel", userLevel.getUserLevel());
			
			return "success";
		}
		return "fail";
	}
}
