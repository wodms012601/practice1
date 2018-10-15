package com.cafe24.iumium.schoolregister.code.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.iumium.schoolregister.code.dao.SchoolRegisterCodeDao;
import com.cafe24.iumium.schoolregister.code.dto.Calander;
import com.cafe24.iumium.schoolregister.code.dto.ReasonForChangeSchoolRegister;
import com.cafe24.iumium.schoolregister.code.dto.ResultOfCounselCode;
import com.cafe24.iumium.schoolregister.code.dto.SemesterCode;
import com.cafe24.iumium.schoolregister.code.dto.TypeOfCounselCode;

@Service
@Transactional
public class SchoolRegisterCodeService {
	
	@Autowired
	private SchoolRegisterCodeDao schoolRegisterCodeDao;
	
	// 모든 학기코드 조회
	public List<SemesterCode> selectAllSemesterCodes(){
		return schoolRegisterCodeDao.selectAllSemesterCodes();
	}
	
	// 모든 학기별 상세일정 조회
	public List<Calander> selectAllCalanders(){
		return schoolRegisterCodeDao.selectAllCalanders();
	}
	
	// 학적변동사유코드 리스트 조회
	public List<ReasonForChangeSchoolRegister> selectAllReasonsForChangeSchoolRegister(){
		return schoolRegisterCodeDao.selectAllReasonsForChangeSchoolRegister();
	}
	
	// 상담구분코드 리스트 조회
	public List<TypeOfCounselCode> selectAllTypeOfCounselCodes(){
		return schoolRegisterCodeDao.selectAllTypeOfCounselCodes();
	}
	
	// 상담구분코드 리스트 조회
	public List<ResultOfCounselCode> selectAllResultOfCounselCodes(){
		return schoolRegisterCodeDao.selectAllResultOfCounselCodes();
	}
}
