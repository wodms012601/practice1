package com.cafe24.iumium.lesson.schedule.dto;

public class Schedule {
	private String lectureNumber;
	private String subjectName;
	private String deptName;
	private String buildingName;
	private int roomFloor;
	private int roomNumber;
	private String humanName;
	private int departmentGrade;
	private String departmentClass;
	private String day;
	private int period;
	
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getRoomFloor() {
		return roomFloor;
	}
	public void setRoomFloor(int roomFloor) {
		this.roomFloor = roomFloor;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getHumanName() {
		return humanName;
	}
	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}
	public String getLectureNumber() {
		return lectureNumber;
	}
	public void setLectureNumber(String lectureNumber) {
		this.lectureNumber = lectureNumber;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getDepartmentGrade() {
		return departmentGrade;
	}
	public void setDepartmentGrade(int departmentGrade) {
		this.departmentGrade = departmentGrade;
	}
	public String getDepartmentClass() {
		return departmentClass;
	}
	public void setDepartmentClass(String departmentClass) {
		this.departmentClass = departmentClass;
	}
}
