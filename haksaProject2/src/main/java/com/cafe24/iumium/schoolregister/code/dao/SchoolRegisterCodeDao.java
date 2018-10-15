package com.cafe24.iumium.schoolregister.code.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.iumium.schoolregister.code.dto.Calander;
import com.cafe24.iumium.schoolregister.code.dto.ReasonForChangeSchoolRegister;
import com.cafe24.iumium.schoolregister.code.dto.ResultOfCounselCode;
import com.cafe24.iumium.schoolregister.code.dto.SemesterCode;
import com.cafe24.iumium.schoolregister.code.dto.TypeOfCounselCode;

@Repository
public class SchoolRegisterCodeDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	private final String nameSpace = "com.cafe24.iumium.schoolregister.code.dao.SchoolRegisterCodeMapper.";
	
	// 모든 학기코드 조회
	public List<SemesterCode> selectAllSemesterCodes(){
		return sqlSessionTemplate.selectList(nameSpace + "selectAllSemesterCodes");
	}
	// 모든 학기별 상세일정 조회
	public List<Calander> selectAllCalanders(){
		return sqlSessionTemplate.selectList(nameSpace + "selectAllCalanders");
	}
	
	// 학적변동사유코드 리스트 조회
	public List<ReasonForChangeSchoolRegister> selectAllReasonsForChangeSchoolRegister(){
		return sqlSessionTemplate.selectList(nameSpace + "selectAllReasonsForChangeSchoolRegister");
	}
	
	// 상담구분코드 리스트 조회
	public List<TypeOfCounselCode> selectAllTypeOfCounselCodes(){
		return sqlSessionTemplate.selectList(nameSpace + "selectAllTypeOfCounselCodes");
	}
	
	// 상담구분코드 리스트 조회
	public List<ResultOfCounselCode> selectAllResultOfCounselCodes(){
		return sqlSessionTemplate.selectList(nameSpace + "selectAllResultOfCounselCodes");
	}
}
