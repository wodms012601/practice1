package com.cafe24.iumium.manage.lecture.dto;

public class SubjectCode {
	private String subjectCode;
	private String recordId;
	private String subjectNameKorean;
	private String subjectNameEnglish;
	private int subjectScoreGraduation;
	private int subjectHoursTheory;
	private int subjectHoursPractice;
	private char subjectHoursIsUsed;
	private char subjectHoursIsChanged;
	private String subjectHoursReasonForChange;
	private String subjectHoursChangedDate;
	private String subjectHoursRegisteredDate;
	public String getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}
	public String getRecordId() {
		return recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getSubjectNameEnglish() {
		return subjectNameEnglish;
	}
	public void setSubjectNameEnglish(String subjectNameEnglish) {
		this.subjectNameEnglish = subjectNameEnglish;
	}
	public int getSubjectScoreGraduation() {
		return subjectScoreGraduation;
	}
	public void setSubjectScoreGraduation(int subjectScoreGraduation) {
		this.subjectScoreGraduation = subjectScoreGraduation;
	}
	public String getSubjectNameKorean() {
		return subjectNameKorean;
	}
	public void setSubjectNameKorean(String subjectNameKorean) {
		this.subjectNameKorean = subjectNameKorean;
	}
	public int getSubjectHoursTheory() {
		return subjectHoursTheory;
	}
	public void setSubjectHoursTheory(int subjectHoursTheory) {
		this.subjectHoursTheory = subjectHoursTheory;
	}
	public int getSubjectHoursPractice() {
		return subjectHoursPractice;
	}
	public void setSubjectHoursPractice(int subjectHoursPractice) {
		this.subjectHoursPractice = subjectHoursPractice;
	}
	public char getSubjectHoursIsUsed() {
		return subjectHoursIsUsed;
	}
	public void setSubjectHoursIsUsed(char subjectHoursIsUsed) {
		this.subjectHoursIsUsed = subjectHoursIsUsed;
	}
	public char getSubjectHoursIsChanged() {
		return subjectHoursIsChanged;
	}
	public void setSubjectHoursIsChanged(char subjectHoursIsChanged) {
		this.subjectHoursIsChanged = subjectHoursIsChanged;
	}
	public String getSubjectHoursReasonForChange() {
		return subjectHoursReasonForChange;
	}
	public void setSubjectHoursReasonForChange(String subjectHoursReasonForChange) {
		this.subjectHoursReasonForChange = subjectHoursReasonForChange;
	}
	public String getSubjectHoursChangedDate() {
		return subjectHoursChangedDate;
	}
	public void setSubjectHoursChangedDate(String subjectHoursChangedDate) {
		this.subjectHoursChangedDate = subjectHoursChangedDate;
	}
	public String getSubjectHoursRegisteredDate() {
		return subjectHoursRegisteredDate;
	}
	public void setSubjectHoursRegisteredDate(String subjectHoursRegisteredDate) {
		this.subjectHoursRegisteredDate = subjectHoursRegisteredDate;
	}
}
