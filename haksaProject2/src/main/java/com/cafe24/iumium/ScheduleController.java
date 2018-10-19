package com.cafe24.iumium;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafe24.iumium.common.dto.BuildingCode;
import com.cafe24.iumium.common.dto.RoomCode;
import com.cafe24.iumium.common.service.CommonCodeService;
import com.cafe24.iumium.lesson.lecture.dto.ClassByDepartment;
import com.cafe24.iumium.lesson.lecture.dto.LectureStatus;
import com.cafe24.iumium.lesson.schedule.dto.Schedule;
import com.cafe24.iumium.lesson.schedule.dto.Search;
import com.cafe24.iumium.lesson.schedule.service.ScheduleService;
import com.cafe24.iumium.schoolregister.code.dto.SemesterCode;
import com.cafe24.iumium.schoolregister.code.service.SchoolRegisterCodeService;

@CrossOrigin
@Controller
public class ScheduleController {
	@Autowired private SchoolRegisterCodeService schoolRegisterCodeService;
	@Autowired private ScheduleService scheduleService;
	@Autowired private CommonCodeService commonCodeService;
	
	// 시간표 입력 폼
	@RequestMapping(value="/lesson/schedule/addSchedule", method=RequestMethod.GET)
	public String addSchedule() {
		System.out.println("시간표 입력 폼");
		return "schedule/addSchedule";
	}
	
	// 시간표 리스트 페이지
	@RequestMapping(value="/lesson/schedule/listSchedule", method=RequestMethod.GET)
	public String ScheduleList() {
		System.out.println("시간표 리스트 페이지");
		return "schedule/listSchedult";
	}
	
	// 교수시간표 리스트 페이지
	@RequestMapping(value="/lesson/schedule/listProfessorSchedule", method=RequestMethod.GET)
	public String professorScheduleList() {
		System.out.println("교수시간표 리스트 페이지");
		return "schedule/listProfessorSchedule";
	}
	
	// 강의실시간표 리스트 페이지
	@RequestMapping(value="/lesson/schedule/listRoomSchedule", method=RequestMethod.GET)
	public String roomScheduleList() {
		System.out.println("강의실시간표 리스트 페이지");
		return "schedule/listRoomSchedule";
	}
	
	// 교수명 조회
	@RequestMapping(value="/rest/professorName", method=RequestMethod.GET, produces = "application/text; charset=utf8")
	public @ResponseBody String professorName(@RequestParam(value="professorNumber", required=true) String professorNumber) {
		System.out.println("교수명 조회");
		return scheduleService.professorSearch(professorNumber);
	}
	
	// 건물명 조회
	@RequestMapping(value="/rest/building", method=RequestMethod.GET)
	public @ResponseBody List<BuildingCode> buildingList() {
		System.out.println("건물 조회");
		return commonCodeService.selectAllBuildingCodes();
	}
	
	// 강의실 조회
	@RequestMapping(value="/rest/room", method=RequestMethod.GET)
	public @ResponseBody List<RoomCode> roomList(@RequestParam(value="buildingCode", required=true) String buildingCode) {
		System.out.println("강의실 조회");
		return scheduleService.roomSearch(buildingCode);
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
	@RequestMapping(value="/rest/scheduleFormList", method=RequestMethod.POST)
	public @ResponseBody List<LectureStatus> scheduleFormList(Search search) {
		System.out.println("과목, 교실, 교수님이름 조회");
		return scheduleService.scheduleSearch(search);
	}
	
	// 시간표 조회
	@RequestMapping(value="/rest/scheduleStateList", method=RequestMethod.POST)
	public @ResponseBody List<Schedule> scheduleStateList(Search search) {
		System.out.println("시간표 조회");
		return scheduleService.scheduleSearchList(search);
	}
	
	// 교수 시간표 조회
	@RequestMapping(value="/rest/professorSchedule", method=RequestMethod.POST)
	public @ResponseBody List<Schedule> professorScheduleList(ClassByDepartment classByDepartment) {
		System.out.println("교수 시간표 조회");
		return scheduleService.professorScheduleSearch(classByDepartment);
	}
	
	// 강의실 시간표 조회
	@RequestMapping(value="/rest/roomSchedule", method=RequestMethod.POST)
	public @ResponseBody List<Schedule> professorScheduleList(Search search) {
		System.out.println("강의실 시간표 조회");
		return scheduleService.roomScheduleSearch(search);
	}
}
