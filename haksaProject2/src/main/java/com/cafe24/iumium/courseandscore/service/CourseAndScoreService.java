package com.cafe24.iumium.courseandscore.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.iumium.courseandscore.dao.CourseAndScoreDao;
import com.cafe24.iumium.courseandscore.dto.EnrolCourse;

@Service
@Transactional
public class CourseAndScoreService {
	
	@Autowired
	private CourseAndScoreDao courseAndScoreDao;
	
	/*1. 세션 아이디 받아서 학과별반번호 조회
	  2. 학과별반번호 일치하는 강의상황서 조회 
	  3. 조회된 과목 정보 출력
	*/
	
	public List<EnrolCourse> selectEnrolCourse(String id){ 
		System.out.println("CourseAndScoreService - selectEnrolCourse() 호출");
		
		int classByDepartmentNumber = courseAndScoreDao.inquireClassByDepartmentNumber(id);
		System.out.println("세션 학번으로 학과별반번호 조회 : " + classByDepartmentNumber);
		
		List<EnrolCourse> lectureStatusNumber = courseAndScoreDao.inquireLectureStatus(classByDepartmentNumber);
		System.out.println("학과별반번호로 강의상황서 번호 : " + lectureStatusNumber);
		
		//list = courseAndScoreDao.inquireDeptCourse(deptCode);
		
		return lectureStatusNumber;
	}
	
	/*
	 *	1.입력된 아이디로 수강신청 테이블 조회
	 *	2.강의상황서 레코드의 속성별로 코드는 해당 코드의 필요값 조회
	 */
	public List<EnrolCourse> searchEnrolCourse(String id){
		return courseAndScoreDao.inquireSearchLectureById(id);
	}
	
}
