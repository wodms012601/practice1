package com.cafe24.iumium.manage.lecture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.iumium.manage.lecture.dao.ManageLectureCodeDao;
import com.cafe24.iumium.manage.lecture.dto.AssignmentForEvaluateCode;
import com.cafe24.iumium.manage.lecture.dto.GradingCriteriaCode;
import com.cafe24.iumium.manage.lecture.dto.QuestionForEvaluateLectureCode;
import com.cafe24.iumium.manage.lecture.dto.SubjectCode;
import com.cafe24.iumium.manage.lecture.dto.TypeOfCompletionCode;

@Service
@Transactional
public class ManageLectureCodeService {
	@Autowired
	private ManageLectureCodeDao lectureCode;
	
	
	
//수업관리 코드 리스트 service
	
	
	// 이수 구분 코드 리스트
	public List<TypeOfCompletionCode> selectManageLectureTocList() {
        return lectureCode.selectManageLectureTocList();
    }
	
	// 과목 코드 리스트
	public List<SubjectCode> selectManageLectureSubjectList(){
		return lectureCode.selectManageLectureSubjectList();
	}
	
	// 강의 평가 항목 코드 리스트
	public List<QuestionForEvaluateLectureCode> selectManageLectureQfelList(){
		return lectureCode.selectManageLectureQfelList();
	}
	
	// 강의별 평가항목 배정 코드 리스트
	public List<AssignmentForEvaluateCode> selectManageLectureAfeList(){
		return lectureCode.selectManageLectureAfeList();
	
	}
	// 성적 평가 기준 리스트
	public List<GradingCriteriaCode> selectManageLectureGccList(){
		return lectureCode.selectManageLectureGccList();
	
	}
	
	
//수업관리 코드 입력 처리 service
	
	// 이수 구분 코드 추가
	public int addTocAction(TypeOfCompletionCode toc, String recordId) {
		toc.setRecordId(recordId);
        return lectureCode.addTocAction(toc);
    }
	
	// 과목 코드 추가
	public int addSubjectCodeAction(SubjectCode subjectCode, String recordId) {
		subjectCode.setRecordId(recordId);
        return lectureCode.addSubjectCodeAction(subjectCode);
    }
	
	// 강의 평가 항목 코드 selectBox 학기코드 조회
	public List<QuestionForEvaluateLectureCode> addQuestionForEvaluateLectureCodeForm(){
		return lectureCode.addQuestionForEvaluateLectureCodeForm();
	}
	
	// 강의 평가 항목 코드 추가
	public int addQuestionForEvaluateLectureCodeAction(QuestionForEvaluateLectureCode qfel, String recordId) {
		qfel.setRecordId(recordId);
        return lectureCode.addQuestionForEvaluateLectureCodeAction(qfel);
    }
	
	// 성적평가 기준 코드 추가
	public int addGradingCriteriaCodeAction(GradingCriteriaCode gc, String recordId) {
		gc.setRecordId(recordId);
        return lectureCode.addGradingCriteriaCodeAction(gc);
    }
}
