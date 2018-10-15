package com.cafe24.iumium.lesson.schedule.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.iumium.lesson.lecture.dto.ClassByDepartment;
import com.cafe24.iumium.lesson.lecture.dto.LectureStatus;
import com.cafe24.iumium.lesson.schedule.dto.Search;

@Repository
public class ScheduleDao {
	private final String NS = "com.cafe24.iumium.lesson.schedule.dao.ScheduleMapper.";
	@Autowired
    private SqlSessionTemplate sqlSessionTemplate;
	
	// 학과 검색 쿼리문 실행
	public List<ClassByDepartment> departmentSearchList(String semesterCode){
		return sqlSessionTemplate.selectList(NS+"getDepartmentList", semesterCode);
	}
	
	// 학년 검색 쿼리문 실행
	public List<ClassByDepartment> gradeSearchList(String departmentCode){
		return sqlSessionTemplate.selectList(NS+"getGradeList", departmentCode);
	}
	
	// 반 검색 쿼리문 실행
	public List<ClassByDepartment> classSearchList(int gradeCode){
		return sqlSessionTemplate.selectList(NS+"getClassList", gradeCode);
	}
	
	// 학과별반 조회 쿼리문 실행
	public List<ClassByDepartment> classByDepartmentSearchList(Search search) {
		return sqlSessionTemplate.selectList(NS+"getClassByDepartmentList", search);
	}
	
	// 강의상황서 조회 쿼리문 실행
	public List<LectureStatus> lectureStatusSearchList(ClassByDepartment bcd) {
		return sqlSessionTemplate.selectList(NS+"getLectureStatusList", bcd);
	}
	
	// 과목, 강의실, 교수님이름 조회 쿼리문 실행
	public List<LectureStatus> lectureStatusSearchNameList(LectureStatus ls) {
		return sqlSessionTemplate.selectList(NS+"getLectureStatusNameList", ls);
	}
}
