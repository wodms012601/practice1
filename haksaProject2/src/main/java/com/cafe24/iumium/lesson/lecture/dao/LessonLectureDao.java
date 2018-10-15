package com.cafe24.iumium.lesson.lecture.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.iumium.lesson.lecture.dto.ChangedTypeOfCompletion;
import com.cafe24.iumium.lesson.lecture.dto.ClassByDepartment;
import com.cafe24.iumium.lesson.lecture.dto.LectureStatus;
import com.cafe24.iumium.lesson.lecture.dto.ProfessorChange;

@Repository
public class LessonLectureDao {

		@Autowired
		private SqlSessionTemplate sqlSessionTemplate;
		
		private final String nameSpace = "com.cafe24.iumium.lesson.lecture.dao.LessonLectureMapper.";
		
		// 학과별 반 리스트 조회
		public List<ClassByDepartment> selectAllClassesByDepartment(){
			return sqlSessionTemplate.selectList(nameSpace + "selectAllClassesByDepartment");
		}
		
		// 강의 상황서 리스트 조회
		public List<LectureStatus> selectAllLectureStatus(){
			return sqlSessionTemplate.selectList(nameSpace + "selectAllLectureStatus");
		}
		
		// 변경된 강의담당 상황교수 리스트  
		public List<ProfessorChange> selectAllProfessorChange(){
			return sqlSessionTemplate.selectList(nameSpace + "selectAllProfessorChange");
		}
				
		// 이수구분 변경 리스트
		public List<ChangedTypeOfCompletion> selectAllChangedTypeOfCompletion(){
			return sqlSessionTemplate.selectList(nameSpace + "selectAllChangedTypeOfCompletion");
		}
}
