package com.cafe24.iumium.courseandscore.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.iumium.courseandscore.dto.EnrolCourse;

@Repository
public class CourseAndScoreDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	private final String nameSpace = "com.cafe24.iumium.courseandscore.dao.CourseAndScoreMapper.";
	
	// 1.세션 아이디 받아서 학과코드, 반 조회
	public int inquireClassByDepartmentNumber(String id){
		System.out.println("CourseAndScoreDao - inquireStudentDept() 호출");
		List<EnrolCourse> list = sqlSessionTemplate.selectList(nameSpace + "inquireStudentDept", id);
		
		int classByDepartmentNumber = list.get(0).getClassByDepartmentNumber();
		System.out.println("학번으로 조회된 학과별반번호 : " + classByDepartmentNumber);
		
		return classByDepartmentNumber;
	}
	
	// 2.조회된 학과별반번호로 강의상황서 번호와 모든 속성코드 조회
	
	public List<EnrolCourse> inquireLectureStatus(int lectureStatusNumber){
		System.out.println("CourseAndScoreDao - inquireDeptCourse() 호출");
		
		return sqlSessionTemplate.selectList(nameSpace + "inquireLectureStatus", lectureStatusNumber);
	}
	
	// 3. 입력된 학번으로 수강신청내역 테이블에서 학번이 일치하는 모든 레코드의 컬럼 값 조회
	
	public List<EnrolCourse> inquireSearchLectureById(String id) {
		return sqlSessionTemplate.selectList(nameSpace + "inquireSearchLectureById", id);
	}
}
