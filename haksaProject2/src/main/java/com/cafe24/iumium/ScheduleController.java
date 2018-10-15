package com.cafe24.iumium;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafe24.iumium.lesson.lecture.dto.ClassByDepartment;
import com.cafe24.iumium.lesson.lecture.dto.LectureStatus;
import com.cafe24.iumium.lesson.schedule.dto.Search;
import com.cafe24.iumium.lesson.schedule.service.ScheduleService;
import com.cafe24.iumium.schoolregister.code.dto.SemesterCode;
import com.cafe24.iumium.schoolregister.code.service.SchoolRegisterCodeService;

@CrossOrigin
@Controller
public class ScheduleController {
	@Autowired private SchoolRegisterCodeService schoolRegisterCodeService;
	@Autowired private ScheduleService scheduleService;
	
	// 시간표 입력 폼
	@RequestMapping(value="/schoolregister/schedule", method=RequestMethod.GET)
	public String Schedule() {
		System.out.println("시간표 입력 폼");
		return "schedule/insertSchedule";
	}
	
	// 년도, 학기 조회
	@RequestMapping(value="/rest/semester", method=RequestMethod.GET)
	public @ResponseBody List<SemesterCode> semesterList() {
		System.out.println("년도, 학기 조회");
		return schoolRegisterCodeService.selectAllSemesterCodes();
	}
	
	// 학과 조회
	@RequestMapping(value="/rest/department", method=RequestMethod.GET)
	public @ResponseBody List<ClassByDepartment> departmentList(@RequestParam(value="semesterCode", required=true) String semesterCode) {
		System.out.println("학과 조회");
		return scheduleService.departmentSearch(semesterCode);
	}
	
	// 학년 조회
	@RequestMapping(value="/rest/grade", method=RequestMethod.GET)
	public @ResponseBody List<ClassByDepartment> gradeList(@RequestParam(value="departmentCode", required=true) String departmentCode) {
		System.out.println("학년 조회");
		return scheduleService.gradeSearch(departmentCode);
	}
	
	// 반 조회
	@RequestMapping(value="/rest/class", method=RequestMethod.GET)
	public @ResponseBody List<ClassByDepartment> classList(@RequestParam(value="gradeCode", required=true) int gradeCode) {
		System.out.println("반 조회");
		return scheduleService.classSearch(gradeCode);
	}
	
	// 과목, 교실, 교수님이름 조회
	@RequestMapping(value="/rest/scheduleSelect", method=RequestMethod.POST)
	public @ResponseBody List<LectureStatus> scheduleList(Search search) {
		System.out.println("과목, 교실, 교수님이름 조회");
		return scheduleService.scheduleSearch(search);
	}
}
