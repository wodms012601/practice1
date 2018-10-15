package com.cafe24.iumium;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cafe24.iumium.common.dto.UserLoginData;
import com.cafe24.iumium.common.service.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class UserController {
	
	// 첫 로그인 화면
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String loginPage() {
		System.out.println("UserController - loginPage() 호출");
		
		return "login";
	}
	
	// 로그아웃
		@RequestMapping(value = "/logout", method = RequestMethod.GET)
		public String loginOut(HttpSession session) {
			System.out.println("UserController - logout() 호출");
			session.invalidate();
			return "redirect:/";
		}

	// 임시로 인덱스 요청 매핑함
	@RequestMapping(value= "/index", method = RequestMethod.GET)
	public String index(HttpSession session) {
		// 세션 정보
		String sessionId = (String) session.getAttribute("userId");
		String sessionLevel = (String) session.getAttribute("userLevel");
		
		if(sessionId == null) {
			return "redirect:/";
		}else {
			System.out.println("session : " + sessionId + "userLevel : " + sessionLevel);
			return "index";
		}
	}
}
