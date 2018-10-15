package com.cafe24.iumium.lesson.schedule.dto;

public class Schedule {
	private String lectureNumber;
	private String day;
	private String period;
	
	public String getLectureNumber() {
		return lectureNumber;
	}
	public void setLectureNumber(String lectureNumber) {
		this.lectureNumber = lectureNumber;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
}
