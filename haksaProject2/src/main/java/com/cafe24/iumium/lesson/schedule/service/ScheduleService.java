package com.cafe24.iumium.lesson.schedule.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.iumium.lesson.lecture.dto.ClassByDepartment;
import com.cafe24.iumium.lesson.lecture.dto.LectureStatus;
import com.cafe24.iumium.lesson.schedule.dao.ScheduleDao;
import com.cafe24.iumium.lesson.schedule.dto.Search;

@Service
@Transactional
public class ScheduleService {
	@Autowired private ScheduleDao scheduleDao;
	
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
	
	// 과목, 강의실, 교수님이름 조회
	public List<LectureStatus> scheduleSearch(Search search) {
		// 학과별반번호 검색 결과
		List<ClassByDepartment> classByDepartment = scheduleDao.classByDepartmentSearchList(search);
		if(classByDepartment.size() != 0) {
			for(ClassByDepartment bcd : classByDepartment) {
				// 강의상황서 검색 결과
				List<LectureStatus> lectureStatus = scheduleDao.lectureStatusSearchList(bcd);
				if(lectureStatus.size() != 0) {
					for(LectureStatus ls : lectureStatus) {
						System.out.println(ls.getSubjectCode()+" <--과목코드");
						System.out.println(ls.getRoomCode()+" <--룸코드");
						System.out.println(ls.getAppointmentSchoolPersonnelNumber()+" <--교직원번호");
						System.out.println(ls.getLectureStatusNumber()+" <--강의상황서 번호");
						if(ls.getLectureStatusNumber() != "0") {
							// 과목, 강의실, 교수님이름 검색 결과
							List<LectureStatus> lecture = scheduleDao.lectureStatusSearchNameList(ls);
							for(LectureStatus result : lecture) {
								System.out.println(result.getSubjectName()+" <--과목이름");
								System.out.println(result.getBuildingName()+" <--건물명");
								System.out.println(result.getRoomFloor()+" <--층");
								System.out.println(result.getRoomName()+" <--강의실이름");
								System.out.println(result.getHumanName()+" <--교수님");
							}
							return lecture;
						}
					}
				}
			}
		}
		return null;
	}
}
