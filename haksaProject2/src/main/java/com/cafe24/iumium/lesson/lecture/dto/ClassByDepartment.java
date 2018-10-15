package com.cafe24.iumium.lesson.lecture.dto;

public class ClassByDepartment {
	private String classByDepartmentNumber;
	private String recordId;
	private String deptCode;
	
	// haksa_department 테이블과 조인 후 값 가져옴
	private String deptNameKorean;
	
	private String appointmentSchoolPersonnelNumber;
	
	// ilban_human 테이블과 조인 후 값 가져옴
	private String humanName;
	
	private String semesterCode;
	private String classByDepartmentGrade;
	private String classByDepartmentClass;
	private String classByDepartmentDayAndNight;
	private String classByDepartmentCurriculumDivision;
	private String classByDepartmentRegisteredDate;
	
	public String getClassByDepartmentNumber() {
		return classByDepartmentNumber;
	}
	public void setClassByDepartmentNumber(String classByDepartmentNumber) {
		this.classByDepartmentNumber = classByDepartmentNumber;
	}
	public String getRecordId() {
		return recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public String getDeptNameKorean() {
		return deptNameKorean;
	}
	public void setDeptNameKorean(String deptNameKorean) {
		this.deptNameKorean = deptNameKorean;
	}
	public String getAppointmentSchoolPersonnelNumber() {
		return appointmentSchoolPersonnelNumber;
	}
	public void setAppointmentSchoolPersonnelNumber(String appointmentSchoolPersonnelNumber) {
		this.appointmentSchoolPersonnelNumber = appointmentSchoolPersonnelNumber;
	}
	public String getHumanName() {
		return humanName;
	}
	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}
	public String getSemesterCode() {
		return semesterCode;
	}
	public void setSemesterCode(String semesterCode) {
		this.semesterCode = semesterCode;
	}
	public String getClassByDepartmentGrade() {
		return classByDepartmentGrade;
	}
	public void setClassByDepartmentGrade(String classByDepartmentGrade) {
		this.classByDepartmentGrade = classByDepartmentGrade;
	}
	public String getClassByDepartmentClass() {
		return classByDepartmentClass;
	}
	public void setClassByDepartmentClass(String classByDepartmentClass) {
		this.classByDepartmentClass = classByDepartmentClass;
	}
	public String getClassByDepartmentDayAndNight() {
		return classByDepartmentDayAndNight;
	}
	public void setClassByDepartmentDayAndNight(String classByDepartmentDayAndNight) {
		this.classByDepartmentDayAndNight = classByDepartmentDayAndNight;
	}
	public String getClassByDepartmentCurriculumDivision() {
		return classByDepartmentCurriculumDivision;
	}
	public void setClassByDepartmentCurriculumDivision(String classByDepartmentCurriculumDivision) {
		this.classByDepartmentCurriculumDivision = classByDepartmentCurriculumDivision;
	}
	public String getClassByDepartmentRegisteredDate() {
		return classByDepartmentRegisteredDate;
	}
	public void setClassByDepartmentRegisteredDate(String classByDepartmentRegisteredDate) {
		this.classByDepartmentRegisteredDate = classByDepartmentRegisteredDate;
	}
}
