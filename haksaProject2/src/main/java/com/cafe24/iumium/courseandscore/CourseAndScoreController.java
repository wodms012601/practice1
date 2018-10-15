package com.cafe24.iumium.courseandscore;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cafe24.iumium.courseandscore.dto.EnrolCourse;
import com.cafe24.iumium.courseandscore.service.CourseAndScoreService;

@Controller
public class CourseAndScoreController {
	
	@Autowired
	private CourseAndScoreService courseAndScoreService;
	
	/*1. 세션 아이디 받아서 학과별반번호 조회
	  2. 학과별반번호 일치하는 강의상황서 조회 
	  3. 조회된 강의상황서 과목 정보 출력
	*/
	@RequestMapping(value="/courseAndScore/enrolCourse")
	public String enrolCourse(Model model, HttpSession session) {
		System.out.println("CourseAndScoreController - enrolCourse() 호출");
		String id = null;
		
		if(session.getId() != null) {
			id = (String)session.getAttribute("userId");
		}
		System.out.println("session ID : " + id);
		
		List<EnrolCourse> enrolCourse = courseAndScoreService.selectEnrolCourse(id);
		
		// model에서 넘어온 데이터 객체 담기 -> view
		model.addAttribute("enrolCourse", enrolCourse);
		model.addAttribute("id", id);
		
		return "/courseAndScore/enrolCourse";
	}
	
	/*
	 *	1.입력된 아이디로 수강신청 테이블 조회
	 *	2.강의상황서 레코드의 속성별로 코드는 해당 코드의 필요값 조회
	 */
	
	@RequestMapping(value="/courseAndScore/searchCourse", method= {RequestMethod.POST, RequestMethod.GET})
	public String searchCourse(Model model, HttpServletRequest request) {
		System.out.println("CourseAndScoreController - searchCourse() 호출");
		String id = request.getParameter("id");
		
		List<EnrolCourse> enrolCourse = courseAndScoreService.searchEnrolCourse(id);
		
		// model에서 넘어온 데이터 객체 담기 -> view
		model.addAttribute("enrolCourse", enrolCourse);
		
		return "/courseAndScore/searchCourse";
	}

	
	
	
	
}
