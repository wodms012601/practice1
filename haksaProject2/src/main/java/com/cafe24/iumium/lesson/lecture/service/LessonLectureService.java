package com.cafe24.iumium.lesson.lecture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.iumium.lesson.lecture.dao.LessonLectureDao;
import com.cafe24.iumium.lesson.lecture.dto.ChangedTypeOfCompletion;
import com.cafe24.iumium.lesson.lecture.dto.ClassByDepartment;
import com.cafe24.iumium.lesson.lecture.dto.LectureStatus;
import com.cafe24.iumium.lesson.lecture.dto.ProfessorChange;

@Service
@Transactional
public class LessonLectureService {
	@Autowired
	private LessonLectureDao lessonLectureDao;
	
	// 학과별 반 리스트 조회
	public List<ClassByDepartment> selectAllClassesByDepartment(){
		return lessonLectureDao.selectAllClassesByDepartment();
	}
	
	// 강의 상황서 리스트 조회
	public List<LectureStatus> selectAllLectureStatus(){
		return lessonLectureDao.selectAllLectureStatus();
	}
	
	// 변경된 강의담당 상황교수 리스트 조회
	public List<ProfessorChange> selectAllProfessorChange(){
		return lessonLectureDao.selectAllProfessorChange();
	}
		
	// 변경된 이수구분 리스트 조회
	public List<ChangedTypeOfCompletion> selectAllChangedTypeOfCompletion(){
		return lessonLectureDao.selectAllChangedTypeOfCompletion();
	}
}
