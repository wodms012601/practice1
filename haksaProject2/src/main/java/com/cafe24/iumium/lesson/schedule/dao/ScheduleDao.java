package com.cafe24.iumium.lesson.schedule.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.iumium.common.dto.RoomCode;
import com.cafe24.iumium.lesson.lecture.dto.ClassByDepartment;
import com.cafe24.iumium.lesson.lecture.dto.LectureStatus;
import com.cafe24.iumium.lesson.schedule.dto.Schedule;
import com.cafe24.iumium.lesson.schedule.dto.Search;

@Repository
public class ScheduleDao {
	private final String NS = "com.cafe24.iumium.lesson.schedule.dao.ScheduleMapper.";
	@Autowired private SqlSessionTemplate sqlSessionTemplate;
	
	// 교수명 검색 쿼리문 실행
	public String professorSearchOne(String professorNumber){
		return sqlSessionTemplate.selectOne(NS+"getprofessorName", professorNumber);
	}
	
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
	
	// 강의실 검색 쿼리문 실행
	public List<RoomCode> roomSearchList(String buildingCode){
		return sqlSessionTemplate.selectList(NS+"getroomList", buildingCode);
	}
	
	// 과목, 강의실, 교수님이름 조회 쿼리문 실행
	public List<LectureStatus> lectureStatusSearchList(Search search) {
		return sqlSessionTemplate.selectList(NS+"getLectureStatusList", search);
	}
	
	// 시간표 조회 쿼리문 실행
	public List<Schedule> scheduleList(Search search) {
		return sqlSessionTemplate.selectList(NS+"getScheduleList", search);
	}
	
	// 교수 시간표 쿼리문 실행
	public List<Schedule> professorScheduleList(ClassByDepartment classByDepartment) {
		return sqlSessionTemplate.selectList(NS+"getProfessorScheduleList", classByDepartment);
	}
	
	// 강의실 시간표 쿼리문 실행
	public List<Schedule> roomScheduleList(Search search) {
		return sqlSessionTemplate.selectList(NS+"getRoomScheduleList", search);
	}
	
	/*// 학과별반 조회 쿼리문 실행
	public ClassByDepartment classByDepartmentSearchList(Search search) {
		return sqlSessionTemplate.selectOne(NS+"getClassByDepartmentList", search);
	}
	
	// 강의상황서 조회 쿼리문 실행
	public List<LectureStatus> lectureStatusSearchList(ClassByDepartment classByDepartment) {
		return sqlSessionTemplate.selectList(NS+"getLectureStatusList", classByDepartment);
	}
	
	// 과목, 강의실, 교수님이름 조회 쿼리문 실행
	public LectureStatus lectureStatusSearchNameList(LectureStatus ls) {
		return sqlSessionTemplate.selectOne(NS+"getLectureStatusNameList", ls);
	}*/
}
