package com.cafe24.iumium;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cafe24.iumium.lesson.lecture.dto.ChangedTypeOfCompletion;
import com.cafe24.iumium.lesson.lecture.dto.ClassByDepartment;
import com.cafe24.iumium.lesson.lecture.dto.LectureStatus;
import com.cafe24.iumium.lesson.lecture.dto.ProfessorChange;
import com.cafe24.iumium.lesson.lecture.service.LessonLectureService;

@Controller
public class LessonLectureController {
	@Autowired
	private LessonLectureService lessonLectureService;

	// 학과별 반 리스트 조회
	@RequestMapping(value = "/lesson/lecture/classByDepartment", method = RequestMethod.GET)
	public String getAllClassByDepartment(Model model) {

		List<ClassByDepartment> classesByDepartment = lessonLectureService.selectAllClassesByDepartment();
		model.addAttribute("classesByDepartment", classesByDepartment);

		return "lesson/lecture/classByDepartment";
	}

	// 강의 상황서 리스트 조회
	@RequestMapping(value = "/lesson/lecture/lectureStatus", method = RequestMethod.GET)
	public String getAllLectureStatus(Model model) {

		List<LectureStatus> LectureStatus = lessonLectureService.selectAllLectureStatus();
		model.addAttribute("list", LectureStatus);

		return "lesson/lecture/lectureStatus";
	}

	// 변경된 강의담당 상황교수 리스트 조회
	@RequestMapping(value = "/lesson/lecture/professorChange", method = RequestMethod.GET)
	public String getAllProfessorChange(Model model) {

		List<ProfessorChange> professorChange = lessonLectureService.selectAllProfessorChange();
		model.addAttribute("list", professorChange);

		return "lesson/lecture/professorChange";
	}

	// 변경된 이수구분 리스트 조회
	@RequestMapping(value = "/lesson/lecture/changedTypeOfCompletion", method = RequestMethod.GET)
	public String getAllChangedTypeOfCompletion(Model model) {

		List<ChangedTypeOfCompletion> changedTypeOfCompletion = lessonLectureService.selectAllChangedTypeOfCompletion();
		model.addAttribute("list", changedTypeOfCompletion);

		return "lesson/lecture/changedTypeOfCompletion";
	}
}
