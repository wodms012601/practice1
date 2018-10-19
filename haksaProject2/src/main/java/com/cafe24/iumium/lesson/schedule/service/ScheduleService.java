package com.cafe24.iumium.lesson.schedule.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.iumium.common.dto.RoomCode;
import com.cafe24.iumium.lesson.lecture.dto.ClassByDepartment;
import com.cafe24.iumium.lesson.lecture.dto.LectureStatus;
import com.cafe24.iumium.lesson.schedule.dao.ScheduleDao;
import com.cafe24.iumium.lesson.schedule.dto.Schedule;
import com.cafe24.iumium.lesson.schedule.dto.Search;

@Service
@Transactional
public class ScheduleService {
	@Autowired private ScheduleDao scheduleDao;
	
	// 교수명 조회
	public String professorSearch(String professorNumber) {
		return scheduleDao.professorSearchOne(professorNumber);
	}
	
	// 학과 조회
	public List<ClassByDepartment> departmentSearch(String semesterCode) {
		return scheduleDao.departmentSearchList(semesterCode);
	}
	
	// 학년 조회
	public List<ClassByDepartment> gradeSearch(String departmentCode) {
		return scheduleDao.gradeSearchList(departmentCode);
	}
	
	// 반 조회
	public List<ClassByDepartment> classSearch(int gradeCode) {
		return scheduleDao.classSearchList(gradeCode);
	}
	
	// 강의실 조회
	public List<RoomCode> roomSearch(String buildingCode) {
		return scheduleDao.roomSearchList(buildingCode);
	}
	
	// 과목, 강의실, 교수님이름 조회
	public List<LectureStatus> scheduleSearch(Search search) {
		return scheduleDao.lectureStatusSearchList(search);
	}
	
	// 시간표 조회
	public List<Schedule> scheduleSearchList(Search search) {
		return scheduleDao.scheduleList(search);
	}
	
	// 교수 시간표 조회
	public List<Schedule> professorScheduleSearch(ClassByDepartment classByDepartment) {
		return scheduleDao.professorScheduleList(classByDepartment);
	}
	
	// 강의실 시간표 조회
	public List<Schedule> roomScheduleSearch(Search search) {
		return scheduleDao.roomScheduleList(search);
	}
	
	// 과목, 강의실, 교수님이름 조회
/*	public List<LectureStatus> scheduleSearch(Search search) {
		
		// 학과별반번호 검색 결과
		ClassByDepartment classByDepartment = scheduleDao.classByDepartmentSearchList(search);
		System.out.println(classByDepartment.getClassByDepartmentNumber() + " <-- 학과별반번호");
		
		// 강의상황서 검색 결과
		List<LectureStatus> lecture = scheduleDao.lectureStatusSearchList(classByDepartment);
		
		for(LectureStatus ls : lecture) {
			System.out.println(ls.getSubjectCode()+" <--과목코드");
			System.out.println(ls.getRoomCode()+" <--룸코드");
			System.out.println(ls.getAppointmentSchoolPersonnelNumber()+" <--교직원번호");
			System.out.println(ls.getLectureStatusNumber()+" <--강의상황서 번호");
			
			// 과목, 강의실, 교수님이름 검색 결과
			LectureStatus lectureName = scheduleDao.lectureStatusSearchNameList(ls);
			System.out.println(lectureName.getSubjectName()+" <--과목이름");
			System.out.println(lectureName.getBuildingName()+" <--건물명");
			System.out.println(lectureName.getRoomFloor()+" <--층");
			System.out.println(lectureName.getRoomName()+" <--강의실이름");
			System.out.println(lectureName.getHumanName()+" <--교수님");
			lecture.add(lectureName);
		}
		System.out.println(lecture.size() + " <-- 사이즈는 몇4");
		return lecture;
	}*/
}
