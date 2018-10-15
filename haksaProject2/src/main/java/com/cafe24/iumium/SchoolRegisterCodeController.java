package com.cafe24.iumium;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cafe24.iumium.schoolregister.code.dto.Calander;
import com.cafe24.iumium.schoolregister.code.dto.ReasonForChangeSchoolRegister;
import com.cafe24.iumium.schoolregister.code.dto.ResultOfCounselCode;
import com.cafe24.iumium.schoolregister.code.dto.SemesterCode;
import com.cafe24.iumium.schoolregister.code.dto.TypeOfCounselCode;
import com.cafe24.iumium.schoolregister.code.service.SchoolRegisterCodeService;

@Controller
public class SchoolRegisterCodeController {
	@Autowired
	private SchoolRegisterCodeService schoolRegisterCodeService;
	
	// 학기코드 리스트 조회
	@RequestMapping(value="/schoolRegister/codes/semester")
	public String getAllSemesterCodes(Model model) {
		List<SemesterCode> semesterCodes = schoolRegisterCodeService.selectAllSemesterCodes();
		model.addAttribute("semesterCodes", semesterCodes);
		return "schoolRegister/code/semesterCode";
	}
	
	// 학기별 상세일정 리스트 조회
	@RequestMapping(value="/schoolRegister/codes/calander", method = RequestMethod.GET)
	public String getAllCalanders(Model model) {
		List<Calander> calanders = schoolRegisterCodeService.selectAllCalanders();
		model.addAttribute("calanders", calanders);
		return "schoolRegister/code/calander";
	}
	
	// 학적변동사유코드 리스트 조회
	@RequestMapping(value="/schoolRegister/codes/reasonForChangeSchoolRegister", method = RequestMethod.GET)
	public String getAllReasonsForChangeSchoolRegister(Model model) {
		List<ReasonForChangeSchoolRegister> reasonsForChangeSchoolRegister = schoolRegisterCodeService.selectAllReasonsForChangeSchoolRegister();
		model.addAttribute("reasonsForChangeSchoolRegister", reasonsForChangeSchoolRegister);
		return "schoolRegister/code/reasonForChangeSchoolRegister";
	}
	
	// 상담구분코드 리스트 조회
	@RequestMapping(value="/schoolRegister/codes/typeOfCounsel", method = RequestMethod.GET)
	public String getAllTypeOfCounselCodes(Model model) {
		List<TypeOfCounselCode> typeOfCounselCodes = schoolRegisterCodeService.selectAllTypeOfCounselCodes();
		model.addAttribute("typeOfCounselCodes", typeOfCounselCodes);
		return "schoolRegister/code/typeOfCounselCode";
	}
	
	// 상담결과코드 리스트 조회
	@RequestMapping(value="/schoolRegister/codes/resultOfCounsel", method = RequestMethod.GET)
	public String getAllResultOfCounselCodes(Model model) {
		List<ResultOfCounselCode> resultOfCounselCodes = schoolRegisterCodeService.selectAllResultOfCounselCodes();
		model.addAttribute("resultOfCounselCodes", resultOfCounselCodes);
		return "schoolRegister/code/resultOfCounselCodeList";
	}
}
